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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.pmf.pim.Application;
import org.eclipse.pmf.pim.DataForm;
import org.eclipse.pmf.pim.data.DataType;


public class DataTypeContentProvider implements IStructuredContentProvider {
	static Object[] EMPTY = new Object[] {};
	Application application;
	public DataTypeContentProvider() {
	}

	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof Collection) {
			Collection collection = (Collection) inputElement;
			return collection.toArray();
		} else if (inputElement instanceof Object[]) {
			return (Object[]) inputElement;
		} else if (inputElement instanceof DataForm) {
			DataForm dataForm = (DataForm) inputElement;
//			DataFormFolder dataFormFolder = (DataFormFolder) dataForm.eContainer();
//			TypeToDataFormFolderEntryMapImpl typeToDataFormFolder = (TypeToDataFormFolderEntryMapImpl) dataFormFolder.eContainer();
			EObject container = dataForm.eContainer();
			while (!(container instanceof Application)){
				container = container.eContainer();
			}
			application = (Application) container;
			List<DataType> map = application.getTypes();
			
			List<DataType> content = new ArrayList<DataType>();
			content = dataForm.getDataContextType().getSuperTypes();
			return content.toArray();
			
		}
		return EMPTY;
	}

	public void dispose() {
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

}
