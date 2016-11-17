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
package org.eclipse.pmf.pim.presentation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.StringTokenizer;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.edit.ui.EMFEditUIPlugin;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.pmf.pim.Application;
import org.eclipse.pmf.pim.Library;
import org.eclipse.pmf.pim.PMFFactory;
import org.eclipse.pmf.pim.PMFPackage;
import org.eclipse.pmf.pim.impl.EClassToEventEntryMapImpl;
import org.eclipse.pmf.pim.provider.PmfEditPlugin;
import org.eclipse.pmf.pim.ui.UIEvent;
import org.eclipse.pmf.pim.ui.UiFactory;
import org.eclipse.pmf.pim.ui.UiPackage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;

/**
 * This is a simple wizard for creating a new model file. <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class PMFApplicationWizard extends Wizard implements INewWizard {
	/**
	 * The supported extensions for created files. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<String> FILE_EXTENSIONS = Collections
			.unmodifiableList(Arrays.asList(PmfEditorPlugin.INSTANCE.getString(
					"_UI_PMFEditorFilenameExtensions").split("\\s*,\\s*")));

	/**
	 * A formatted list of supported file extensions, suitable for display. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String FORMATTED_FILE_EXTENSIONS = PmfEditorPlugin.INSTANCE
			.getString("_UI_PMFEditorFilenameExtensions").replaceAll(
					"\\s*,\\s*", ", ");

	/**
	 * This caches an instance of the model package. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PMFPackage pmfPackage = PMFPackage.eINSTANCE;

	/**
	 * This caches an instance of the model factory. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PMFFactory pmfFactory = pmfPackage.getPMFFactory();

	/**
	 * This is the file creation page. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected PMFModelWizardNewFileCreationPage newFileCreationPage;

	/**
	 * This is the initial object creation page. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected PMFModelWizardInitialObjectCreationPage initialObjectCreationPage;

	/**
	 * Remember the selection during initialization for populating the default
	 * container. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * Remember the workbench during initialization. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IWorkbench workbench;

	/**
	 * Caches the names of the types that can be created as the root object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected List<String> initialObjectNames;

	/**
	 * This just records the information. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(PmfEditorPlugin.INSTANCE.getString("_UI_Wizard_label"));
		setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE
				.getImageDescriptor(PmfEditorPlugin.INSTANCE
						.getImage("full/wizban/NewPMF")));
	}

	/**
	 * Returns the names of the types that can be created as the root object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Collection<String> getInitialObjectNames() {
		if (initialObjectNames == null) {
			initialObjectNames = new ArrayList<String>();
			for (EClassifier eClassifier : pmfPackage.getEClassifiers()) {
				if (eClassifier instanceof EClass) {
					EClass eClass = (EClass) eClassifier;
					if (!eClass.isAbstract()) {
						initialObjectNames.add(eClass.getName());
					}
				}
			}
			Collections.sort(initialObjectNames,
					CommonPlugin.INSTANCE.getComparator());
		}
		return initialObjectNames;
	}

	/**
	 * Create a new model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EObject createInitialModel() {
		EClass eClass = (EClass) pmfPackage
				.getEClassifier(initialObjectCreationPage
						.getInitialObjectName());
		EObject rootObject = pmfFactory.create(eClass);
		initialObjectCreationPage.init(rootObject);
		return rootObject;
	}

	/**
	 * Do the work after everything is specified. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean performFinish() {
		try {
			// Remember the file.
			//
			final IFile modelFile = getModelFile();

			// Do the work within an operation.
			//
			WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
				@Override
				protected void execute(IProgressMonitor progressMonitor) {
					try {
						// Create a resource set
						//
						ResourceSet resourceSet = new ResourceSetImpl();

						// Get the URI of the model file.
						//
						URI fileURI = URI.createPlatformResourceURI(modelFile
								.getFullPath().toString(), true);

						// Create a resource for this file.
						//
						Resource resource = resourceSet.createResource(fileURI);

						// Add the initial model object to the contents.
						//
						EObject rootObject = createInitialModel();
						if (rootObject != null) {
							resource.getContents().add(rootObject);
						}
						
						if (rootObject instanceof Application){
							Application application = (Application) rootObject;
							try {
								URI uri = application.eResource().getURI();
								String targetURI = extractDirectoryPath(uri.toPlatformString(true));
								Library libObjectEvents;
								try {
									libObjectEvents = addLibraryEvent(targetURI, "System.plb");
									if (!application.getLibraries().contains(libObjectEvents))
										application.getLibraries().add(libObjectEvents);
								} catch (IOException e) {
									e.printStackTrace();
								}
								application.eResource().save(Collections.emptyMap());
							} catch (IOException e) {
								EMFEditUIPlugin.INSTANCE.log(e);
							}
						}

						// Save the contents of the resource to the file system.
						//
						Map<Object, Object> options = new HashMap<Object, Object>();
						options.put(XMLResource.OPTION_ENCODING,
								initialObjectCreationPage.getEncoding());
						resource.save(options);
					} catch (Exception exception) {
						PmfEditorPlugin.INSTANCE.log(exception);
					} finally {
						progressMonitor.done();
					}
				}
			};

			getContainer().run(false, false, operation);

			// Select the new file resource in the current view.
			//
			IWorkbenchWindow workbenchWindow = workbench
					.getActiveWorkbenchWindow();
			IWorkbenchPage page = workbenchWindow.getActivePage();
			final IWorkbenchPart activePart = page.getActivePart();
			if (activePart instanceof ISetSelectionTarget) {
				final ISelection targetSelection = new StructuredSelection(
						modelFile);
				getShell().getDisplay().asyncExec(new Runnable() {
					public void run() {
						((ISetSelectionTarget) activePart)
								.selectReveal(targetSelection);
					}
				});
			}

			// Open an editor on the new file.
			//
			try {
				page.openEditor(
						new FileEditorInput(modelFile),
						workbench
								.getEditorRegistry()
								.getDefaultEditor(
										modelFile.getFullPath().toString())
								.getId());
			} catch (PartInitException exception) {
				MessageDialog.openError(workbenchWindow.getShell(),
						PmfEditorPlugin.INSTANCE
								.getString("_UI_OpenEditorError_label"),
						exception.getMessage());
				return false;
			}

			return true;
		} catch (Exception exception) {
			PmfEditorPlugin.INSTANCE.log(exception);
			return false;
		}
	}

	/**
	 * This is the one page of the wizard. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public class PMFModelWizardNewFileCreationPage extends
			WizardNewFileCreationPage {
		/**
		 * Pass in the selection. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public PMFModelWizardNewFileCreationPage(String pageId,
				IStructuredSelection selection) {
			super(pageId, selection);
		}

		/**
		 * The framework calls this to see if the file is correct. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		@Override
		protected boolean validatePage() {
			if (super.validatePage()) {
				String extension = new Path(getFileName()).getFileExtension();
				if (extension == null || !FILE_EXTENSIONS.contains(extension)) {
					String key = FILE_EXTENSIONS.size() > 1 ? "_WARN_FilenameExtensions"
							: "_WARN_FilenameExtension";
					setErrorMessage(PmfEditorPlugin.INSTANCE.getString(key,
							new Object[] { FORMATTED_FILE_EXTENSIONS }));
					return false;
				}
				return true;
			}
			return false;
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public IFile getModelFile() {
			return ResourcesPlugin.getWorkspace().getRoot()
					.getFile(getContainerFullPath().append(getFileName()));
		}
	}

	/**
	 * This is the page where the type of object to create is selected. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public class PMFModelWizardInitialObjectCreationPage extends WizardPage {
		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated NOT
		 */
		protected Text nameField;

		/**
		 * @generated <!-- begin-user-doc --> <!-- end-user-doc -->
		 */
		protected List<String> encodings;

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		protected Combo encodingField;

		/**
		 * Pass in the selection. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public PMFModelWizardInitialObjectCreationPage(String pageId) {
			super(pageId);
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public void createControl(Composite parent) {
			Composite composite = new Composite(parent, SWT.NONE);
			{
				GridLayout layout = new GridLayout();
				layout.numColumns = 1;
				layout.verticalSpacing = 12;
				composite.setLayout(layout);

				GridData data = new GridData();
				data.verticalAlignment = GridData.FILL;
				data.grabExcessVerticalSpace = true;
				data.horizontalAlignment = GridData.FILL;
				composite.setLayoutData(data);
			}

			Label containerLabel = new Label(composite, SWT.LEFT);
			{
				containerLabel.setText(PmfEditorPlugin.INSTANCE
						.getString("_UI_ModelName"));

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				containerLabel.setLayoutData(data);
			}

			nameField = new Text(composite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				nameField.setLayoutData(data);
			}

			// for (String objectName : getInitialObjectNames()) {
			// initialObjectField.add(getLabel(objectName));
			// }
			//
			// if (initialObjectField.getItemCount() == 1) {
			// initialObjectField.select(0);
			// }
			// initialObjectField.addModifyListener(validator);

			Label encodingLabel = new Label(composite, SWT.LEFT);
			{
				encodingLabel.setText(PmfEditorPlugin.INSTANCE
						.getString("_UI_XMLEncoding"));

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				encodingLabel.setLayoutData(data);
			}
			encodingField = new Combo(composite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				encodingField.setLayoutData(data);
			}

			for (String encoding : getEncodings()) {
				encodingField.add(encoding);
			}

			encodingField.select(0);
			encodingField.addModifyListener(validator);

			setPageComplete(validatePage());
			setControl(composite);
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		protected ModifyListener validator = new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				setPageComplete(validatePage());
			}
		};

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		protected boolean validatePage() {
			return getInitialObjectName() != null
					&& getEncodings().contains(encodingField.getText());
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated NOT
		 */
		@Override
		public void setVisible(boolean visible) {
			super.setVisible(visible);
			if (visible) {
				nameField.setFocus();
			}
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated NOT
		 */
		public String getInitialObjectName() {
			return "Application";
		}
		
		/**
		 * The given object is initialized by setting name and adding a sub-library that representing predefined UI events
		 * @param object
		 */
		public void init(EObject object) {
			if (object instanceof Library) {
				Library library = (Library) object;
				library.setName(nameField.getText());
			}
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public String getEncoding() {
			return encodingField.getText();
		}

		/**
		 * Returns the label for the specified type name. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		protected String getLabel(String typeName) {
			try {
				return PmfEditPlugin.INSTANCE.getString("_UI_" + typeName
						+ "_type");
			} catch (MissingResourceException mre) {
				PmfEditorPlugin.INSTANCE.log(mre);
			}
			return typeName;
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		protected Collection<String> getEncodings() {
			if (encodings == null) {
				encodings = new ArrayList<String>();
				for (StringTokenizer stringTokenizer = new StringTokenizer(
						PmfEditorPlugin.INSTANCE
								.getString("_UI_XMLEncodingChoices")); stringTokenizer
						.hasMoreTokens();) {
					encodings.add(stringTokenizer.nextToken());
				}
			}
			return encodings;
		}
	}

	/**
	 * The framework calls this to create the contents of the wizard. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void addPages() {
		// Create a page, set the title, and the initial model file name.
		//
		newFileCreationPage = new PMFModelWizardNewFileCreationPage("Whatever",
				selection);
		newFileCreationPage.setTitle(PmfEditorPlugin.INSTANCE
				.getString("_UI_PMFApplicationWizard_label"));
		newFileCreationPage.setDescription(PmfEditorPlugin.INSTANCE
				.getString("_UI_PMFApplicationWizard_description"));
		newFileCreationPage.setFileName(PmfEditorPlugin.INSTANCE
				.getString("_UI_PMFEditorFilenameDefaultBase")
				+ "."
				+ FILE_EXTENSIONS.get(0));
		addPage(newFileCreationPage);

		// Try and get the resource selection to determine a current directory
		// for the file dialog.
		//
		if (selection != null && !selection.isEmpty()) {
			// Get the resource...
			//
			Object selectedElement = selection.iterator().next();
			if (selectedElement instanceof IResource) {
				// Get the resource parent, if its a file.
				//
				IResource selectedResource = (IResource) selectedElement;
				if (selectedResource.getType() == IResource.FILE) {
					selectedResource = selectedResource.getParent();
				}

				// This gives us a directory...
				//
				if (selectedResource instanceof IFolder
						|| selectedResource instanceof IProject) {
					// Set this for the container.
					//
					newFileCreationPage.setContainerFullPath(selectedResource
							.getFullPath());

					// Make up a unique new name here.
					//
					String defaultModelBaseFilename = PmfEditorPlugin.INSTANCE
							.getString("_UI_PMFEditorFilenameDefaultBase");
					String defaultModelFilenameExtension = FILE_EXTENSIONS
							.get(0);
					String modelFilename = defaultModelBaseFilename + "."
							+ defaultModelFilenameExtension;
					for (int i = 1; ((IContainer) selectedResource)
							.findMember(modelFilename) != null; ++i) {
						modelFilename = defaultModelBaseFilename + i + "."
								+ defaultModelFilenameExtension;
					}
					newFileCreationPage.setFileName(modelFilename);
				}
			}
		}
		initialObjectCreationPage = new PMFModelWizardInitialObjectCreationPage(
				"Whatever2");
		initialObjectCreationPage.setTitle(PmfEditorPlugin.INSTANCE
				.getString("_UI_PMFApplicationWizard_label"));
		initialObjectCreationPage.setDescription(PmfEditorPlugin.INSTANCE
				.getString("_UI_Wizard_initial_object_description"));
		addPage(initialObjectCreationPage);
	}

	/**
	 * Get the file from the page. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IFile getModelFile() {
		return newFileCreationPage.getModelFile();
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
