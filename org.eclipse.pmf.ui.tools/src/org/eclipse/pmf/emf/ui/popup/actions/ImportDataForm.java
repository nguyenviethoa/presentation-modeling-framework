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

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.pmf.pim.Application;
import org.eclipse.pmf.pim.DataForm;
import org.eclipse.pmf.pim.data.DataType;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.xwt.Tracking;
import org.eclipse.xwt.XWT;

public class ImportDataForm implements IObjectActionDelegate {
	static final String[] FILE_EXTENSIONS = new String[] { "genmodel", "ecore" };
	static final String[] FILE_SUFIXES = new String[] { "*.genmodel", "*.ecore" };
	protected DataForm dataForm;

	private Shell shell;
	protected Application application;

	/**
	 * Constructor for Action1.
	 */
	public ImportDataForm() {
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
		XWT.addTracking(Tracking.DATABINDING);
		URL url = ImportDataForm.class.getResource("main.xwt");
		try {
			EObject container = dataForm.eContainer();
			while (!(container instanceof Application)){
				container = container.eContainer();
			}
			application = (Application) container;
			
//			org.eclipse.pmf.pim.ui.BooleanButton button = UiFactory.eINSTANCE.createBooleanButton();
//			System.out.println(application.getUIEvents(button.eClass()));
			if (null != application.getTypes() && !application.getTypes().isEmpty()) {
				List<DataType> map = application.getTypes();
				if (null != dataForm.getDataContextType()){
					List<DataType> content = new ArrayList<DataType>();
					if (null != dataForm.getDataContextType().getSuperTypes() && !dataForm.getDataContextType().getSuperTypes().isEmpty())
						{
							content = dataForm.getDataContextType().getSuperTypes();
							XWT.open(url, dataForm);
						}
				}
				else {
					MessageBox messageBox = new MessageBox(shell, SWT.ICON_WARNING | SWT.ABORT | SWT.RETRY | SWT.IGNORE);
					messageBox.setText("Warning");
					messageBox.setMessage("You have to set the Data Context Type for the " + dataForm.getName() + " dataform.");
					messageBox.open();
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
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
			if (element instanceof DataForm) {
				dataForm = (DataForm) element;
			}
		}
		
		EObject container = dataForm.eContainer();
		while (!(container instanceof Application)){
			container = container.eContainer();
		}
		application = (Application) container;
		if (null != application.getTypes() && !application.getTypes().isEmpty()) {
			List<DataType> map = application.getTypes();
			if (null != dataForm.getDataContextType()){
				List<DataType> content = new ArrayList<DataType>();
				if (null == dataForm.getDataContextType().getSuperTypes() || dataForm.getDataContextType().getSuperTypes().isEmpty())
				{
					action.setEnabled(false);
				}
				else {
					action.setEnabled(true);
				}
			}		
		}
	}
}
