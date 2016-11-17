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
public class LibraryLibraryView extends AbstractView {
	public LibraryLibraryView(Composite parent, int style) {
		super(parent, style);
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

	public void addSystemActions(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performAddEvent("systemActions");
	}

	public void removeSystemActions(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performRemoveEvent("systemActions");
	}

	public void moveUpSystemActions(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performMoveUpEvent("systemActions");
	}

	public void moveDownSystemActions(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performMoveDownEvent("systemActions");
	}

	public void addCommands(Object sender, org.eclipse.swt.widgets.Event event) {
		performAddEvent("commands");
	}

	public void removeCommands(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performRemoveEvent("commands");
	}

	public void moveUpCommands(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performMoveUpEvent("commands");
	}

	public void moveDownCommands(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performMoveDownEvent("commands");
	}

	public void addConverters(Object sender, org.eclipse.swt.widgets.Event event) {
		performAddEvent("converters");
	}

	public void removeConverters(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performRemoveEvent("converters");
	}

	public void moveUpConverters(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performMoveUpEvent("converters");
	}

	public void moveDownConverters(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performMoveDownEvent("converters");
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

	public void addTypes(Object sender, org.eclipse.swt.widgets.Event event) {
		performAddEvent("types");
	}

	public void removeTypes(Object sender, org.eclipse.swt.widgets.Event event) {
		performRemoveEvent("types");
	}

	public void moveUpTypes(Object sender, org.eclipse.swt.widgets.Event event) {
		performMoveUpEvent("types");
	}

	public void moveDownTypes(Object sender, org.eclipse.swt.widgets.Event event) {
		performMoveDownEvent("types");
	}

	public void addImages(Object sender, org.eclipse.swt.widgets.Event event) {
		performAddEvent("images");
	}

	public void removeImages(Object sender, org.eclipse.swt.widgets.Event event) {
		performRemoveEvent("images");
	}

	public void moveUpImages(Object sender, org.eclipse.swt.widgets.Event event) {
		performMoveUpEvent("images");
	}

	public void moveDownImages(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performMoveDownEvent("images");
	}
}