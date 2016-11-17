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

import java.util.Collection;
import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;


public class DataFormContentProvider implements ITreeContentProvider {
	static Object[] EMPTY = new Object[] {};

	public DataFormContentProvider() {
	}

	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof Collection) {
			Collection collection = (Collection) inputElement;
			return collection.toArray();
		} else if (inputElement instanceof Object[]) {
			return (Object[]) inputElement;
		} else if (inputElement instanceof DataFormContent) {
			DataFormContent element = (DataFormContent) inputElement;
			List<DataFormContent> map =  element.getChildren();
			return map.toArray();
		}
		return EMPTY;
	}

	public void dispose() {
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

	public Object[] getChildren(Object parentElement) {
		// TODO Auto-generated method stub
		 Object[] result = new Object[0];
		  if (parentElement instanceof DataFormContent) {
			  DataFormContent parent = (DataFormContent) parentElement;
		   List<DataFormContent> list = parent.getChildren();
		   result = list.toArray();
		  }
		  
	  return result;
	}

	public Object getParent(Object element) {
		// TODO Auto-generated method stub
		Object result = null;
		  if (element instanceof DataFormContent) {
			  DataFormContent dataElement = (DataFormContent) element;
			  DataFormContent parent = (DataFormContent) dataElement.getParent();
		   result = parent;
		  }
		 
	 return result;
	}

	public boolean hasChildren(Object element) {
		// TODO Auto-generated method stub
		 if (element instanceof DataFormContent) {
			 DataFormContent dataElement = (DataFormContent) element;
			 return (dataElement.getChildren().size() > 0);
		 }
		 return false;
	}

}
