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
public class CodeGenContextCodeGenContextView extends AbstractView {
	public CodeGenContextCodeGenContextView(Composite parent, int style) {
		super(parent, style);
	}

	public void addResourceResolvers(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performAddEvent("resourceResolvers");
	}

	public void removeResourceResolvers(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performRemoveEvent("resourceResolvers");
	}

	public void moveUpResourceResolvers(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performMoveUpEvent("resourceResolvers");
	}

	public void moveDownResourceResolvers(Object sender,
			org.eclipse.swt.widgets.Event event) {
		performMoveDownEvent("resourceResolvers");
	}
}