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

import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.xwt.XWT;


public class MenuHandler {
//	protected void open(Event event) {
//		Shell shell = XWT.findShell(event.widget);
//		FileDialog dialog = new FileDialog(shell, SWT.APPLICATION_MODAL | SWT.OPEN);
//		String path = dialog.open();
//		if (path != null) {
//			try {
//				Company loadModel = Main.loadModel(path);
//				((ListViewer) XWT.findElementByName(event.widget, "contacts")).setInput(loadModel);
//			} catch (FileNotFoundException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//	}

	private Shell getShell(Event event) {
		return (Shell) XWT.findElementByName(event.widget, "shell");
	}

//	protected void save(Event event) {
//		Shell shell = XWT.findShell(event.widget);
//		FileDialog dialog = new FileDialog(shell, SWT.APPLICATION_MODAL | SWT.SAVE);
//		String path = dialog.open();
//		if (path != null) {
//			try {
//				Object input = ((ListViewer) XWT.findElementByName(event.widget, "contacts")).getInput();
//				Main.saveModel((Company) input, path);
//			} catch (FileNotFoundException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//	}

	protected void exit(Event event) {
		Shell shell = XWT.findShell(event.widget);
		shell.close();
//		System.exit(0);
	}

//	protected void newContact(Event event) {
//		Employee newEmployee = null;
//		ListViewer contacts = (ListViewer) XWT.findElementByName(event.widget, "contacts");
//		if (contacts == null) {
//			return;
//		} else {
//			Company input = (Company) contacts.getInput();
//			newEmployee = Demo_modelFactory.eINSTANCE.createEmployee();
//			newEmployee.setFirstname("New");
//			newEmployee.setLastname("Employee");
//			newEmployee.setBirthday(new Date());
//			newEmployee.setEmail("");
//			newEmployee.setPhone("");
//			newEmployee.setPosition("");
//			Address address = Demo_modelFactory.eINSTANCE.createAddress();
//			address.setCity("");
//			address.setCountry("");
//			address.setState("");
//			address.setStreet("");
//			address.setZipcode(0);
//			newEmployee.setAddress(address);
//			input.getEmployees().add(newEmployee);
//
//			contacts.refresh();
//		}
//		Button writable = (Button) XWT.findElementByName(event.widget, "writable");
//		if (writable != null) {
//			writable.setSelection(true);
//		}
//		if (contacts != null && newEmployee != null) {
//			contacts.setSelection(new StructuredSelection(newEmployee));
//			contacts.getControl().notifyListeners(SWT.Selection, new Event());
//		}
//	}
}
