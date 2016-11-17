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

package org.eclipse.pmf.ui.properties.part;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.ui.views.properties.tabbed.AbstractSectionDescriptor;
import org.eclipse.ui.views.properties.tabbed.ISection;
import org.eclipse.xwt.IConstants;
import org.eclipse.xwt.ui.workbench.properties.XWTSection;

public class XWTSectionDescriptor extends AbstractSectionDescriptor {

	private String id;
	private String targetTab;
	private String sectionTypeName;

	public String getSectionTypeName() {
		return sectionTypeName;
	}

	public void setSectionTypeName(String sectionTypeName) {
		this.sectionTypeName = sectionTypeName;
	}

	private List<String> inputTypes;

	public XWTSectionDescriptor(String id, String targetTab,
			String sectionTypeName) {
		Assert.isNotNull(id, "Section id can not be null");
		Assert.isNotNull(targetTab, "Tab id can not be null");
		Assert.isNotNull(sectionTypeName,
				"URL for renderering section can not be null");
		this.id = id;
		this.targetTab = targetTab;
		this.sectionTypeName = sectionTypeName;
	}

	public String getId() {
		return id;
	}

	public ISection getSectionClass() {
		URL sectionURL = null;
		try {
			ClassLoader classLoader = Thread.currentThread()
					.getContextClassLoader();
			Class<?> type = classLoader.loadClass(sectionTypeName);
			// Class<?> type = Class.forName(sectionTypeName);
			sectionURL = type.getResource(type.getSimpleName()
					+ IConstants.XWT_EXTENSION_SUFFIX);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return new XWTSection(sectionURL);
	}

	public String getTargetTab() {
		return targetTab;
	}

	public List<String> getInputTypes() {
		if (inputTypes == null) {
			inputTypes = new ArrayList<String>();
		}
		return inputTypes;
	}

	public void addInputType(String inputType) {
		getInputTypes().add(inputType);
	}
}
