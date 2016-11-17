/******************************************************************************* 
 * Copyright (c) 2006, 2016 Soyatec (http://www.soyatec.com) and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Soyatec - initial API and implementation 
 *******************************************************************************/ 
package org.eclipse.pmf.emf.ui.popup.actions;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.ui.dialogs.ResourceDialog;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.edit.ui.EMFEditUIPlugin;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.pmf.pim.Application;
import org.eclipse.pmf.pim.Library;
import org.eclipse.pmf.pim.PMFFactory;
import org.eclipse.pmf.pim.PMFPackage;
import org.eclipse.pmf.pim.impl.EClassToEventEntryMapImpl;
import org.eclipse.pmf.pim.ui.UIEvent;
import org.eclipse.pmf.pim.ui.UiFactory;
import org.eclipse.pmf.pim.ui.UiPackage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class ImportModel implements IObjectActionDelegate {
	static final String[] FILE_EXTENSIONS = new String[] { "genmodel", "ecore" };
	static final String[] FILE_SUFIXES = new String[] { "*.genmodel", "*.ecore" };
	protected Application application;

	private Shell shell;

	/**
	 * Constructor for Action1.
	 */
	public ImportModel() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		LoadResourceDialog loadResourceDialog = new LoadResourceDialog(shell,
				application.eResource().getResourceSet());

		if (Window.OK == loadResourceDialog.open()) {
			// Try to save model if loaded resource successfully.
			try {
				/* Adding the library of predefined UI events is moved to org.eclipse.pmf.pim.presentation.PMFApplicationWizard
				URI uri = application.eResource().getURI();
				String targetURI = extractDirectoryPath(uri.toPlatformString(true));
				Library libObjectEvents;
				try {
					libObjectEvents = addLibraryEvent(targetURI, "System.plb");
					if (!application.getLibraries().contains(libObjectEvents))
						application.getLibraries().add(libObjectEvents);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				*/
				application.eResource().save(Collections.emptyMap());
				
				// Library libObject = (Library)
				// PMFFactory.eINSTANCE.createLibrary();
				// libObject.setName("System");
				// EList<Library> libs = application.getLibraries();
				// libs.add(libObject);

				// application.getLibraries().add(addLibraryEvent());
			} catch (IOException e) {
				EMFEditUIPlugin.INSTANCE.log(e);
			}
		}
	}

	public class LoadResourceDialog extends ResourceDialog {
		protected ResourceSet resourceSet;

		public LoadResourceDialog(Shell parent, ResourceSet resourceSet) {
			super(parent, EMFEditUIPlugin.INSTANCE
					.getString("_UI_LoadResourceDialog_title"), SWT.OPEN
					| SWT.MULTI);
			this.resourceSet = resourceSet;
		}

		@Override
		protected boolean processResources() {
			if (resourceSet != null) {
				for (URI uri : getURIs()) {
					try {
						if (!processResource(resourceSet.getResource(uri, true))) {
							return false;
						}
					} catch (RuntimeException exception) {
						EMFEditUIPlugin.INSTANCE.log(exception);
					}
				}
			}
			return true;
		}

		protected boolean processResource(Resource resource) {
			Application application = ImportModel.this.application;
			application.importModel(resource);

			return true;
		}

		/**
		 * Called to prepare the Browse File System button, this implementation
		 * adds a selection listener that creates an appropriate
		 * {@link FileDialog}.
		 */
		protected void prepareBrowseFileSystemButton(
				Button browseFileSystemButton) {
			browseFileSystemButton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent event) {
					FileDialog fileDialog = new FileDialog(getShell(), style);
					fileDialog.setFilterExtensions(FILE_SUFIXES);
					fileDialog.open();

					String filterPath = fileDialog.getFilterPath();
					if (isMulti()) {
						String[] fileNames = fileDialog.getFileNames();
						StringBuffer uris = new StringBuffer();

						for (int i = 0, len = fileNames.length; i < len; i++) {
							uris.append(URI.createFileURI(
									filterPath + File.separator + fileNames[i])
									.toString());
							uris.append("  ");
						}
						uriField.setText((uriField.getText() + "  " + uris
								.toString()).trim());
					} else {
						String fileName = fileDialog.getFileName();
						if (fileName != null) {
							uriField.setText(URI.createFileURI(
									filterPath + File.separator + fileName)
									.toString());
						}
					}
				}
			});
		}

		/**
		 * Called to prepare the Browse Workspace button, this implementation
		 * adds a selection listener that creates an appropriate
		 * {@link WorkspaceResourceDialog}.
		 */
		protected void prepareBrowseWorkspaceButton(Button browseWorkspaceButton) {
			browseWorkspaceButton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent event) {
					if (isMulti()) {
						StringBuffer uris = new StringBuffer();

						IFile[] files = WorkspaceResourceDialog
								.openFileSelection(getShell(), null, null,
										true, null, getViewerFilters());
						for (int i = 0, len = files.length; i < len; i++) {
							uris.append(URI.createPlatformResourceURI(files[i]
									.getFullPath().toString(), true));
							uris.append("  ");
						}
						uriField.setText((uriField.getText() + "  " + uris
								.toString()).trim());
					} else {
						IFile file = null;

						if (isSave()) {
							file = WorkspaceResourceDialog.openNewFile(
									getShell(), null, null, null,
									getViewerFilters());
						} else {
							IFile[] files = WorkspaceResourceDialog
									.openFileSelection(getShell(), null, null,
											false, null, getViewerFilters());
							if (files.length != 0) {
								file = files[0];
							}
						}

						if (file != null) {
							uriField.setText(URI.createPlatformResourceURI(
									file.getFullPath().toString(), true)
									.toString());
						}
					}
				}
			});
		}

		protected List<ViewerFilter> getViewerFilters() {
			ArrayList<ViewerFilter> arrayList = new ArrayList<ViewerFilter>();
			arrayList.add(new ViewerFilter() {
				@Override
				public boolean select(Viewer viewer, Object parentElement,
						Object element) {
					if (element instanceof IAdaptable) {
						IAdaptable adaptable = (IAdaptable) element;
						IResource resource = (IResource) adaptable
								.getAdapter(IResource.class);
						switch (resource.getType()) {
						case IResource.PROJECT:
						case IResource.FOLDER:
							return true;
						case IResource.FILE:
							for (String extension : FILE_EXTENSIONS) {
								if (extension.equals(resource
										.getFileExtension())) {
									return true;
								}
							}
						default:
							break;
						}
					}
					return false;
				}
			});
			return arrayList;
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection.isEmpty()) {
			return;
		}
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Object element = structuredSelection.getFirstElement();
			if (element instanceof Application) {
				application = (Application) element;

			}
		}
	}
	
	/**
	 * create a library, which contains the basic events
	 * 
	 * @param path
	 * @param fileName
	 * @param rootId
	 * @return
	 * @throws IOException
	 */
	protected Library addLibraryEvent(String path, String fileName) throws IOException {

		/* create a library for bringing initial events */
		Library libObject = (Library) PMFFactory.eINSTANCE.createLibrary();
		libObject.setName("System");
		
		EMap<EClass, EList<UIEvent>> uiEventsMap = createUIEventsforLibrary(libObject);
		
		/* update the events of the library */
		libObject.eSet(PMFPackage.Literals.LIBRARY__EVENTS, uiEventsMap.map());
		
		/* save the library */
		URI fileURI = URI
				.createPlatformResourceURI(path + "/" + fileName, true);

		// Create a resource for this file.
		//
		ResourceSet resourceSet = new ResourceSetImpl();

		Resource resource = resourceSet.createResource(fileURI);

		resource.getContents().add(libObject);

		resource.save(Collections.EMPTY_MAP);

		return libObject;
	}
	
	/**
	 * Create an initial EMap (EClass, EList<UIEvent>) 
	 * @param libObject
	 * @return
	 */
	public static EMap<EClass, EList<UIEvent>> createUIEventsforLibrary(Library libObject) {
		EMap<EClass, EList<UIEvent>> uiEventsMap = new EcoreEMap<EClass, EList<UIEvent>>(
				PMFPackage.Literals.ECLASS_TO_EVENT_ENTRY_MAP,
				EClassToEventEntryMapImpl.class, (InternalEObject) libObject,
				PMFPackage.LIBRARY__EVENTS);

		/* add the initial events for the Button type */
		EList<UIEvent> uiButtonEvents = new BasicEList<UIEvent>();

		org.eclipse.pmf.pim.ui.Button button = UiFactory.eINSTANCE.createButton();
		EClass eButton = button.eClass();
		UIEvent clickEvent = UiFactory.eINSTANCE.createUIEvent();
		clickEvent.setName("Click");
		clickEvent.setId("click");

		uiButtonEvents.add(clickEvent);

		uiEventsMap.put(eButton, uiButtonEvents);

	
		/* add the initial events for the UIElement type */
		EList<UIEvent> uiUIElementEvents = new BasicEList<UIEvent>();

		EClass eUIElement = (EClass)UiPackage.eINSTANCE.getEClassifier("UIElement");
		
		UIEvent exposeEvent = UiFactory.eINSTANCE.createUIEvent();
		exposeEvent.setName("Expose");
		exposeEvent.setId("Expose");
		UIEvent mouseInEvent = UiFactory.eINSTANCE.createUIEvent();
		mouseInEvent.setName("MouseIn");
		mouseInEvent.setId("MouseIn");
		UIEvent mouseOutEvent = UiFactory.eINSTANCE.createUIEvent();
		mouseOutEvent.setName("MouseOut");
		mouseOutEvent.setId("MouseOut");
		
		// new UI Events added to the UIElement type
		UIEvent dragEvent = UiFactory.eINSTANCE.createUIEvent();
		dragEvent.setName("DragDetect");
		dragEvent.setId("DragDetect");
		UIEvent focusinEvent = UiFactory.eINSTANCE.createUIEvent();
		focusinEvent.setName("FocusIn");
		focusinEvent.setId("FocusIn");
		UIEvent focusoutEvent = UiFactory.eINSTANCE.createUIEvent();
		focusoutEvent.setName("FocusOut");
		focusoutEvent.setId("FocusOut");
		UIEvent doubleclickEvent = UiFactory.eINSTANCE.createUIEvent();
		doubleclickEvent.setName("MouseDoubleClick");
		doubleclickEvent.setId("MouseDoubleClick");
		UIEvent resizeEvent = UiFactory.eINSTANCE.createUIEvent();
		resizeEvent.setName("Resize");
		resizeEvent.setId("Resize");
		
		uiUIElementEvents.add(exposeEvent);
		uiUIElementEvents.add(mouseInEvent);
		uiUIElementEvents.add(mouseOutEvent);
		
		uiUIElementEvents.add(dragEvent);
		uiUIElementEvents.add(focusinEvent);
		uiUIElementEvents.add(focusoutEvent);
		uiUIElementEvents.add(doubleclickEvent);
		uiUIElementEvents.add(resizeEvent);

		uiEventsMap.put(eUIElement, uiUIElementEvents);

		/* add the initial events for the List type */
		EList<UIEvent> uiListEvents = new BasicEList<UIEvent>();

		EClass eList = (EClass)UiPackage.eINSTANCE.getEClassifier("ListView");
		UIEvent selectionEvent = UiFactory.eINSTANCE.createUIEvent();
		selectionEvent.setName("Selection");
		selectionEvent.setId("Selection");
		uiListEvents.add(selectionEvent);
		
		uiEventsMap.put(eList, uiListEvents);
		
		/* add the initial events for the Text type */
		EList<UIEvent> uiTextEvents = new BasicEList<UIEvent>();

		EClass eText = (EClass)UiPackage.eINSTANCE.getEClassifier("Text");
		UIEvent focusInEvent = UiFactory.eINSTANCE.createUIEvent();
		focusInEvent.setName("focusIn");
		focusInEvent.setId("focusIn");
		UIEvent focusOutEvent = UiFactory.eINSTANCE.createUIEvent();
		focusOutEvent.setName("focusOut");
		focusOutEvent.setId("focusOut");
		
		/* new UI events added to the Text (aka TextField) type */
		UIEvent clickTextEvent = UiFactory.eINSTANCE.createUIEvent();
		clickTextEvent.setName("Click");
		clickTextEvent.setId("Click");
		UIEvent modifyTextEvent = UiFactory.eINSTANCE.createUIEvent();
		modifyTextEvent.setName("Modify");
		modifyTextEvent.setId("Modify");
		
		uiTextEvents.add(focusInEvent);
		uiTextEvents.add(focusOutEvent);
		uiTextEvents.add(clickTextEvent);
		uiTextEvents.add(modifyTextEvent);
		
		uiEventsMap.put(eText, uiTextEvents);
		
		/* add the initial events for the Combo type */
		EList<UIEvent> uiComboEvents = new BasicEList<UIEvent>();
		
		EClass eCombo = (EClass)UiPackage.eINSTANCE.getEClassifier("Combo");
		UIEvent selectionComboEvent = UiFactory.eINSTANCE.createUIEvent();
		selectionComboEvent.setName("Selection");
		selectionComboEvent.setId("Selection");
		UIEvent modifyComboEvent = UiFactory.eINSTANCE.createUIEvent();
		modifyComboEvent.setName("Modify");
		modifyComboEvent.setId("Modify");
		
		uiComboEvents.add(selectionComboEvent);
		uiComboEvents.add(modifyComboEvent);
		
		uiEventsMap.put(eCombo, uiComboEvents);
		
		/* add the initial events for the Hyperlink type */
		EList<UIEvent> uiLinkEvents = new BasicEList<UIEvent>();
		
		EClass eLink = (EClass)UiPackage.eINSTANCE.getEClassifier("Hyperlink");
		UIEvent clickComboEvent = UiFactory.eINSTANCE.createUIEvent();
		clickComboEvent.setName("Click");
		clickComboEvent.setId("Click");
		
		uiLinkEvents.add(clickComboEvent);
		
		uiEventsMap.put(eLink, uiLinkEvents);
		
		/* add the initial events for the MenuItem type */
		EList<UIEvent> uiMenuItemEvents = new BasicEList<UIEvent>();
		
		EClass eMenuItem = (EClass)UiPackage.eINSTANCE.getEClassifier("MenuItem");
		UIEvent selectMenuItemEvent = UiFactory.eINSTANCE.createUIEvent();
		selectMenuItemEvent.setName("Selection");
		selectMenuItemEvent.setId("Selection");
		
		uiMenuItemEvents.add(selectMenuItemEvent);
		
		uiEventsMap.put(eMenuItem, uiMenuItemEvents);
		
		/* add the initial events for the Tab type */
		EList<UIEvent> uiTabEvents = new BasicEList<UIEvent>();
		
		EClass eTab = (EClass)UiPackage.eINSTANCE.getEClassifier("Tab");
		UIEvent selectTabEvent = UiFactory.eINSTANCE.createUIEvent();
		selectTabEvent.setName("Selection");
		selectTabEvent.setId("Selection");
		
		uiTabEvents.add(selectTabEvent);
		
		uiEventsMap.put(eTab, uiTabEvents);
		
		/* add the initial events for the Table type */
		EList<UIEvent> uiTableEvents = new BasicEList<UIEvent>();
		
		EClass eTable = (EClass)UiPackage.eINSTANCE.getEClassifier("Table");
		UIEvent selectTableEvent = UiFactory.eINSTANCE.createUIEvent();
		selectTableEvent.setName("Selection");
		selectTableEvent.setId("Selection");
		UIEvent sortTableEvent = UiFactory.eINSTANCE.createUIEvent();
		sortTableEvent.setName("Sort");
		sortTableEvent.setId("Sort");
		
		uiTableEvents.add(selectTableEvent);
		uiTableEvents.add(sortTableEvent);
		
		uiEventsMap.put(eTable, uiTableEvents);
		
		/* add the initial events for the DateTimePicker type */
		EList<UIEvent> uiDateTimePickerEvents = new BasicEList<UIEvent>();
		
		EClass eDateTimePicker = (EClass)UiPackage.eINSTANCE.getEClassifier("DateTimePicker");
		UIEvent selectDateTimePickerEvent = UiFactory.eINSTANCE.createUIEvent();
		selectDateTimePickerEvent.setName("Selection");
		selectDateTimePickerEvent.setId("Selection");
		
		uiDateTimePickerEvents.add(selectDateTimePickerEvent);
		
		uiEventsMap.put(eDateTimePicker, uiDateTimePickerEvents);
		
		return uiEventsMap;
	}
	
	/**
	   * Get the parent of the given path.
	   *
	   * @param path The path for which to retrieve the parent
	   *
	   * @return The parent path. /sub/sub2/index.html -> /sub/sub2 If the given path is the root path ("/" or ""), return a blank string.
	   */
	  public static String extractDirectoryPath(String path)
	  {
	    if ((path == null) || path.equals("") || path.equals("/"))
	    {
	      return "";
	    }

	    int lastSlashPos = path.lastIndexOf('/');

	    if (lastSlashPos >= 0)
	    {
	      return path.substring(0, lastSlashPos); //strip off the slash
	    }
	    else
	    {
	      return ""; //we expect people to add  + "/somedir on their own
	    }
	  }
}
