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
public class DataCollectionDataCollectionView extends AbstractView {
	public DataCollectionDataCollectionView(Composite parent, int style) {
		super(parent, style);
	}

	public void addColumns(Object sender, org.eclipse.swt.widgets.Event event) {
		performAddEvent("columns");
	}

	public void removeColumns(Object sender, org.eclipse.swt.widgets.Event event) {
		performRemoveEvent("columns");
	}

	public void moveUpColumns(Object sender, org.eclipse.swt.widgets.Event event) {
		performMoveUpEvent("columns");
	}

	public void moveDownColumns(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performMoveDownEvent("columns");
	}

	public void addSorters(Object sender, org.eclipse.swt.widgets.Event event) {
		performAddEvent("sorters");
	}

	public void removeSorters(Object sender, org.eclipse.swt.widgets.Event event) {
		performRemoveEvent("sorters");
	}

	public void moveUpSorters(Object sender, org.eclipse.swt.widgets.Event event) {
		performMoveUpEvent("sorters");
	}

	public void moveDownSorters(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performMoveDownEvent("sorters");
	}
}