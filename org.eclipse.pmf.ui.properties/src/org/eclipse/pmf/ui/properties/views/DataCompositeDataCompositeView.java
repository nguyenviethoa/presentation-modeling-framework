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
public class DataCompositeDataCompositeView extends AbstractView {
	public DataCompositeDataCompositeView(Composite parent, int style) {
		super(parent, style);
	}

	public void addItems(Object sender, org.eclipse.swt.widgets.Event event) {
		performAddEvent("items");
	}

	public void removeItems(Object sender, org.eclipse.swt.widgets.Event event) {
		performRemoveEvent("items");
	}

	public void moveUpItems(Object sender, org.eclipse.swt.widgets.Event event) {
		performMoveUpEvent("items");
	}

	public void moveDownItems(Object sender, org.eclipse.swt.widgets.Event event) {
		performMoveDownEvent("items");
	}
}