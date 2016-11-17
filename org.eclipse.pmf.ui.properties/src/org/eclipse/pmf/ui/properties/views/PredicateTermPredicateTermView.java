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
public class PredicateTermPredicateTermView extends AbstractView {
	public PredicateTermPredicateTermView(Composite parent, int style) {
		super(parent, style);
	}

	public void addTerms(Object sender, org.eclipse.swt.widgets.Event event) {
		performAddEvent("terms");
	}

	public void removeTerms(Object sender, org.eclipse.swt.widgets.Event event) {
		performRemoveEvent("terms");
	}

	public void moveUpTerms(Object sender, org.eclipse.swt.widgets.Event event) {
		performMoveUpEvent("terms");
	}

	public void moveDownTerms(Object sender, org.eclipse.swt.widgets.Event event) {
		performMoveDownEvent("terms");
	}
}