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

package org.eclipse.pmf.ui.properties.views;

import org.eclipse.swt.widgets.Composite;

/**
 * @author
 * 
 */
public class DataTypeDataTypeView extends AbstractView {
	public DataTypeDataTypeView(Composite parent, int style) {
		super(parent, style);
	}

	public void addProperties(Object sender, org.eclipse.swt.widgets.Event event) {
		performAddEvent("properties");
	}

	public void removeProperties(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performRemoveEvent("properties");
	}

	public void moveUpProperties(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performMoveUpEvent("properties");
	}

	public void moveDownProperties(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performMoveDownEvent("properties");
	}

	public void addSuperTypes(Object sender, org.eclipse.swt.widgets.Event event) {
		performAddEvent("superTypes");
	}

	public void removeSuperTypes(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performRemoveEvent("superTypes");
	}

	public void moveUpSuperTypes(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performMoveUpEvent("superTypes");
	}

	public void moveDownSuperTypes(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performMoveDownEvent("superTypes");
	}

	public void addTypeParameters(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performAddEvent("typeParameters");
	}

	public void removeTypeParameters(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performRemoveEvent("typeParameters");
	}

	public void moveUpTypeParameters(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performMoveUpEvent("typeParameters");
	}

	public void moveDownTypeParameters(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performMoveDownEvent("typeParameters");
	}

	public void addGenericSuperTypes(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performAddEvent("genericSuperTypes");
	}

	public void removeGenericSuperTypes(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performRemoveEvent("genericSuperTypes");
	}

	public void moveUpGenericSuperTypes(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performMoveUpEvent("genericSuperTypes");
	}

	public void moveDownGenericSuperTypes(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performMoveDownEvent("genericSuperTypes");
	}
}