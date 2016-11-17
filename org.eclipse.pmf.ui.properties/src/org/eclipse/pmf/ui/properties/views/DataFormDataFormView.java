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
public class DataFormDataFormView extends AbstractView {
	public DataFormDataFormView(Composite parent, int style) {
		super(parent, style);
	}

	public void addValidators(Object sender, org.eclipse.swt.widgets.Event event) {
		performAddEvent("validators");
	}

	public void removeValidators(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performRemoveEvent("validators");
	}

	public void moveUpValidators(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performMoveUpEvent("validators");
	}

	public void moveDownValidators(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performMoveDownEvent("validators");
	}

	public void addLocalValidators(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performAddEvent("localValidators");
	}

	public void removeLocalValidators(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performRemoveEvent("localValidators");
	}

	public void moveUpLocalValidators(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performMoveUpEvent("localValidators");
	}

	public void moveDownLocalValidators(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performMoveDownEvent("localValidators");
	}

	public void addChildren(Object sender, org.eclipse.swt.widgets.Event event) {
		performAddEvent("children");
	}

	public void removeChildren(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performRemoveEvent("children");
	}

	public void moveUpChildren(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performMoveUpEvent("children");
	}

	public void moveDownChildren(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performMoveDownEvent("children");
	}

	public void addViewProfiles(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performAddEvent("viewProfiles");
	}

	public void removeViewProfiles(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performRemoveEvent("viewProfiles");
	}

	public void moveUpViewProfiles(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performMoveUpEvent("viewProfiles");
	}

	public void moveDownViewProfiles(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performMoveDownEvent("viewProfiles");
	}
}