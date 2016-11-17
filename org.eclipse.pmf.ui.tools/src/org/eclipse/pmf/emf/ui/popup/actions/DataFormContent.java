
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

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class DataFormContent {
	String name;
	String id;
	List<DataFormContent> children = new ArrayList<DataFormContent>();
	DataFormContent parent;
	
	/* package */PropertyChangeSupport changeSupport = new PropertyChangeSupport(
			this);
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		changeSupport.addPropertyChangeListener(listener);
	}

	public void removePropertyChangeListener(PropertyChangeListener listener) {
		changeSupport.removePropertyChangeListener(listener);
	}
	
	public DataFormContent getParent() {
		return parent;
	}

	public void setParent(DataFormContent parent) {
		this.parent = parent;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		changeSupport.firePropertyChange("name", this.name,
				this.name = name);
	}
	
	public DataFormContent(String text){
		super();
		this.name = text;
	}
	
	public DataFormContent(String text, String id){
		super();
		this.name = text;
		this.id = id;
	}

	public List<DataFormContent> getChildren() {
		return children;
	}

	public void setChildren(List<DataFormContent> children) {
		this.children = children;
		changeSupport.firePropertyChange("children", this.children,
				this.children = children);
	}

	public boolean hasListeners(String propertyName) {
		return changeSupport.hasListeners(propertyName);
	}
	
	
}
