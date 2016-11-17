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
public class ApplicationApplicationView extends AbstractView {
	public ApplicationApplicationView(Composite parent, int style) {
		super(parent, style);
	}

	public void addDataModelManagers(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performAddEvent("dataModelManagers");
	}

	public void removeDataModelManagers(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performRemoveEvent("dataModelManagers");
	}

	public void moveUpDataModelManagers(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performMoveUpEvent("dataModelManagers");
	}

	public void moveDownDataModelManagers(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performMoveDownEvent("dataModelManagers");
	}

	public void addLibraries(Object sender, org.eclipse.swt.widgets.Event event) {
		performAddEvent("libraries");
	}

	public void removeLibraries(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performRemoveEvent("libraries");
	}

	public void moveUpLibraries(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performMoveUpEvent("libraries");
	}

	public void moveDownLibraries(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performMoveDownEvent("libraries");
	}
}