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

import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.widgets.Event;
import org.eclipse.xwt.XWT;


/**
 * @author tguiu
 */

public class ChangeHandler {
	protected void modify(Event event) {
		ListViewer datatypes = (ListViewer) XWT.findElementByName(event.widget, "datatypes");
		if (datatypes != null) {
			datatypes.refresh();
		}
	}
}
