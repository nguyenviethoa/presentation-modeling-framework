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
package org.eclipse.pmf.pim.presentation;

import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.xwt.ui.workbench.properties.ApplicationPropertySheetPage;

public class PMFXWTEditor extends PMFEditor implements ITabbedPropertySheetPageContributor {

	public PMFXWTEditor() {
	}

	public String getContributorId() {
		return "org.eclipse.pmf.ui.properties";
	}
	
	@Override
	public IPropertySheetPage getPropertySheetPage() {
		return new ApplicationPropertySheetPage(getEditingDomain(), this);
	}

}
