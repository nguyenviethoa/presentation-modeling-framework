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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalCommandStack;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.pmf.pim.Application;
import org.eclipse.pmf.pim.DataElement;
import org.eclipse.pmf.pim.DataForm;
import org.eclipse.pmf.pim.DataItem;
import org.eclipse.pmf.pim.ElementalDataForm;
import org.eclipse.pmf.pim.data.DataType;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.xwt.XWT;

public class DataFormListHandler {
	private Map<Object, Control> controls = new HashMap<Object, Control>();
	private ListViewer datatypes;
	private Composite parent;
	private Button insert;
	private Button cancel;
	private Button save, up, down, delete;

	private TreeViewer dataforms;
	private TreeViewer dataformTests;
	private ListViewer datafields, content;
	// modified by ksun
	private ElementalDataForm dataContext;
	private Widget widget;
	private Label dataFormListViewerLabel;
	private Map<DataFormContent, DataElement> map;
	private Set<DataElement> addedElement;
	private Set<DataFormContent> insertedList;

	private void init(Widget widget) {
		if (datatypes == null)
			datatypes = (ListViewer) XWT.findElementByName(widget, "datatypes");
		if (parent == null)
			parent = (Composite) XWT.findElementByName(widget, "dataforms");
		if (insert == null)
			insert = (Button) XWT.findElementByName(widget, "Insert");
		if (save == null)
			save = (Button) XWT.findElementByName(widget, "Save");
		save.setEnabled(false);
		if (up == null)
			up = (Button) XWT.findElementByName(widget, "Up");
		if (down == null)
			down = (Button) XWT.findElementByName(widget, "Down");
		if (delete == null)
			delete = (Button) XWT.findElementByName(widget, "Delete");
		if (cancel == null)
			cancel = (Button) XWT.findElementByName(widget, "Cancel");
		if (dataforms == null)
			dataforms = (TreeViewer) XWT.findElementByName(widget,
					"TreeViewerTest");
		if (dataformTests == null)
			dataformTests = (TreeViewer) XWT.findElementByName(widget,
					"TreeViewerTest");
		if (dataFormListViewerLabel == null)
			dataFormListViewerLabel = (Label) XWT.findElementByName(widget,
					"labelDataforms");
		if (content == null)
			content = (ListViewer) XWT.findElementByName(widget, "content");
		// modified by ksun
		dataContext = (ElementalDataForm) XWT.getDataContext(widget);
		if (null == widget)
			this.widget = widget;
		addedElement = new HashSet<DataElement>();
		insertedList = new HashSet<DataFormContent>();
	}

	protected void insert(Event event) {

		if (null == dataforms || dataforms.getSelection().isEmpty()) {
			MessageDialog
					.openInformation(widget.getDisplay().getActiveShell(),
							"Information",
							"you have to select an available Dataform from the dataform list");
			return;
		}
		Object[] selections = ((IStructuredSelection) dataforms.getSelection())
				.toArray();
		for (Object selection : selections) {
			DataFormContent element = (DataFormContent) selection;
			if (!insertedList.contains(element)) {
				insertedList.add(element);
				DataElement dataElement = map.get(element);
				// Load
				if (dataElement instanceof ElementalDataForm) {
					ElementalDataForm data = (ElementalDataForm) dataElement;
					for (DataElement d : data.getChildren()) {
						DataElement clonedElement = EcoreUtil.copy(d);
						clonedElement.setDataContextType(dataContext
								.getDataContextType());

						addedElement.add(clonedElement);
						content.add(clonedElement);

					}
				} else {
					DataElement clonedElement = EcoreUtil.copy(dataElement);
					clonedElement.setDataContextType(dataContext
							.getDataContextType());
					addedElement.add(clonedElement);
					content.add(clonedElement);

				}
			}
		}
		if ((addedElement != null) || !(addedElement.isEmpty())) {
			save.setEnabled(true);
		}

	}

	protected void updateDataforms(Event event) {
		init(event.widget);
		perform();

	}

	protected void selection(Event event) {

	}

	private void dataformSelection(Event event) {

	}

	private void perform() {

		if (datatypes.getSelection().isEmpty()) {
			dataFormListViewerLabel
					.setText("Select a data type to view its coresspond dataforms");
			save.setEnabled(false);
			return;
		}

		Object selection = ((IStructuredSelection) datatypes.getSelection())
				.getFirstElement();
		DataType dataType = null;
		if (selection instanceof DataType) {
			dataType = (DataType) selection;
		} else
			return;
		// init the content of the treeviewer
		map = new HashMap<DataFormContent, DataElement>();
		dataFormListViewerLabel.setText("Dataforms : ");
		Application application = (Application) dataType.eContainer();
		List<DataForm> listDataForm = application.getDataFormFolder(dataType)
				.getDataForms();
		// root element
		DataFormContent root = new DataFormContent("root");
		for (DataForm dataForm : listDataForm) {
			DataFormContent child = new DataFormContent(dataForm.getName(),
					dataForm.getId());
			map.put(child, dataForm);
			// commented by ksun
			//findChildren(child, dataForm);
			root.getChildren().add(child);
		}

		Control control = controls.get(computeKey(selection));
		if (control == null) {

			// Load
			try {
				dataformTests.setInput(root);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	private void findChildren(DataFormContent child, ElementalDataForm dataForm) {

		for (DataItem item : dataForm.getChildren()) {
			DataFormContent next = new DataFormContent(item.getName(),
					item.getId());
			map.put(next, item);
			
			child.getChildren().add(next);
		}
	}
	
	public void treeSelection() {
		
	}

	private Object computeKey(Object selection) {
		return selection.toString();
	}

	public void cancel(Event event) {
		if (!addedElement.isEmpty()) {
			for (DataElement data : addedElement) {
				List<DataItem> l = dataContext.getChildren();
				boolean b = dataContext.getChildren().remove(data);
			}

		}
		save.setEnabled(true);
	}

	public void up(Event event) {
		if (null == content || content.getSelection().isEmpty()) {
			MessageDialog.openInformation(widget.getDisplay().getActiveShell(),
					"Information",
					"you have to select an element from the content list");
			return;
		}
		int index = content.getList().getSelectionIndex();
		Object selection = ((IStructuredSelection) content.getSelection())
				.getFirstElement();
		org.eclipse.swt.widgets.List list = content.getList();
		if (index > 0) {
			content.remove(((IStructuredSelection) content.getSelection())
					.getFirstElement());
			content.insert(selection, index - 1);
		}

	}

	public void down(Event event) {
		if (null == content || content.getSelection().isEmpty()) {
			MessageDialog.openInformation(widget.getDisplay().getActiveShell(),
					"Information",
					"you have to select an element from the content list");
			return;
		}
		int index = content.getList().getSelectionIndex();
		Object selection = ((IStructuredSelection) content.getSelection())
				.getFirstElement();
		if (index < content.getList().getItems().length - 1) {
			content.remove(((IStructuredSelection) content.getSelection())
					.getFirstElement());
			content.insert(selection, index + 1);
		}
	}

	public void delete(Event event) {
		if (null == content || content.getSelection().isEmpty()) {
			MessageDialog.openInformation(widget.getDisplay().getActiveShell(),
					"Information",
					"you have to select an element from the content list");
			return;
		}
		DataElement element = (DataElement) ((IStructuredSelection) content
				.getSelection()).getFirstElement();
		DataFormContent dataFromContent = getKeyByValue(map, element);
		insertedList.remove(dataFromContent);
		// addedElement.remove((DataElement)((IStructuredSelection)
		// content.getSelection()).getFirstElement());
		content.remove(((IStructuredSelection) content.getSelection())
				.getFirstElement());
	}

	public static <T, E> T getKeyByValue(Map<T, E> map, E value) {
		for (Entry<T, E> entry : map.entrySet()) {
			if (value.equals(entry.getValue())) {
				return entry.getKey();
			}
		}
		return null;
	}

	public void save(Event event) {

		Resource resource = dataContext.eResource();
		ResourceSet resourceSet = resource.getResourceSet();
		TransactionalEditingDomain domain = TransactionalEditingDomain.Factory.INSTANCE
				.createEditingDomain(resourceSet);

		TransactionalCommandStack tstack = (TransactionalCommandStack) domain
				.getCommandStack();

		domain.getCommandStack().execute(new RecordingCommand(domain) {

			@Override
			protected void doExecute() {
				for (int i = 0; i <= content.getList().getItems().length - 1; i++) {
					Object insertion = content.getElementAt(i);
					DataItem dataItem = (DataItem) insertion;
					if (!dataContext.getChildren().contains(dataItem)) {
						dataContext.getChildren().add(dataItem);
					}

				}
			}

		});

		for (int i = 0; i <= content.getList().getItems().length - 1; i++) {
			Object insertion = content.getElementAt(i);
			DataItem dataItem = (DataItem) insertion;
			if (!dataContext.getChildren().contains(dataItem)) {
				dataContext.getChildren().add(dataItem);
				// Command cmd = domain.createCommand(
				// SetCommand.class,
				// new CommandParameter(dataContext,
				// PMFPackage.Literals.DATA_FORM__CHILDREN, dataElement));
				// try {
				// tstack.execute(cmd, Collections.EMPTY_MAP);
				// } catch (InterruptedException e) {
				// System.out.println("transaction interupted");
				// } catch (RollbackException e) {
				// System.out.println("rollback interupted");
				// }
			}

		}

		save.setEnabled(false);
		cancel.setEnabled(true);
	}
}
