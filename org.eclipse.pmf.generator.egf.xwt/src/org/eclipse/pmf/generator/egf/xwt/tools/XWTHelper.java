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

package org.eclipse.pmf.generator.egf.xwt.tools;

import java.util.Map;
import java.util.Random;

import org.eclipse.egf.model.pattern.PatternContext;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.pmf.generator.egf.xwt.Constants;
import org.eclipse.pmf.pim.DataForm;
import org.eclipse.pmf.pim.DataItem;
import org.eclipse.pmf.pim.ElementalDataForm;
import org.eclipse.pmf.pim.ui.ViewPart;

/**
 * @author Thomas Guiu
 * 
 */
public class XWTHelper {
	private static final String PREFIXES = "qwertyuiopasdfghjklzcvbnm";

	public static String getViewClass(ViewPart part, String applicationName) {
		return applicationName + ".views." + part.getDataForm().getName()
				+ "View";
	}

	/**
	 * Return "ns->nsPrefix" pair.
	 */
	public static String[] addNamespace(PatternContext ctx,
			String classifierName) {
		if (classifierName == null) {
			return null;
		}
		@SuppressWarnings("unchecked")
		Map<String, String> namespaces = (Map<String, String>) ctx
				.getValue(Constants.NAMESPACES);
		if (namespaces == null) {
			return null;
		}
		String ns = classifierName;
		String nsPrefix = "n";
		int lastIndex = classifierName.lastIndexOf(".");
		if (lastIndex != -1) {
			ns = classifierName.substring(0, lastIndex);
			nsPrefix = classifierName.substring(lastIndex + 1, lastIndex + 2)
					.toLowerCase();
			if (nsPrefix.equals("*")) {
				nsPrefix = "j";
			}
		}
		addNamespace(ctx, ns, nsPrefix);
		return new String[] { ns, namespaces.get(ns) };
	}

	public static void addNamespace(PatternContext ctx, String ns,
			String nsPrefix) {
		if (ctx == null || ns == null || nsPrefix == null) {
			return;
		}

		@SuppressWarnings("unchecked")
		Map<String, String> namespaces = (Map<String, String>) ctx
				.getValue(Constants.NAMESPACES);
		if (namespaces == null) {
			return;
		}

		if (namespaces.containsKey(ns)) {
			return;
		}
		while (namespaces.containsValue(nsPrefix)) {
			Random r = new Random();
			int i = r.nextInt(PREFIXES.length());
			nsPrefix = Character.toString(PREFIXES.charAt(i));
		}
		// move to "end" method of DataForm
		// StringBuffer insertBuffer = new StringBuffer();
		// insertBuffer.append("	xmlns:");
		// insertBuffer.append(nsPrefix);
		// insertBuffer.append("=\"clr-namespace:");
		// insertBuffer.append(ns);
		// insertBuffer.append("\"");
		// insertBuffer.append("\n");
		// EGFHelper.insertNode(ctx, "namespace", insertBuffer.toString());
		namespaces.put(ns, nsPrefix);
	}

	/**
	 * check if the classifierName should be included in the name space
	 * @param ctx
	 * @param classifierName
	 * @return
	 */
	public static boolean addedNamespace(PatternContext ctx, String classifierName){
		if (classifierName == null) {
			return false;
		}
		@SuppressWarnings("unchecked")
		Map<String, String> namespaces = (Map<String, String>) ctx
				.getValue(Constants.NAMESPACES);
		if (namespaces == null) {
			return false;
		}
		String ns = classifierName;
		int lastIndex = classifierName.lastIndexOf(".");
		if (lastIndex != -1) {
			ns = classifierName.substring(0, lastIndex);
			}
		if (namespaces.containsKey(ns)) {
			return false;
		}
		else 
			return true;
	}
	public static String getXWTElementName(PatternContext ctx,
			String fullClassName) {
		if (fullClassName == null) {
			return null;
		}
		Boolean checkNamespace = addedNamespace(ctx, fullClassName);
		String[] nsPair = addNamespace(ctx, fullClassName);
		@SuppressWarnings("unchecked")
		Map<String, String> namespaces = (Map<String, String>) ctx
				.getValue(Constants.NAMESPACES);
		if (checkNamespace)
			namespaces.remove(nsPair[0]);
		String elementName = fullClassName;
		if (fullClassName.indexOf(".") != -1) {
			elementName = fullClassName.substring(fullClassName
					.lastIndexOf(".") + 1);
		}
		return nsPair[1] + ":" + elementName;
	}

	public static String getDataItemViewName(DataItem item) {
		if (item == null) {
			return null;
		}
		String name = item.getName();
		String dataFormName = null;
		DataForm dataForm = (DataForm) item.eContainer();
		if (dataForm != null) {
			dataFormName = dataForm.getName();
			if (name == null || name.equals("")) {
				name = "Item" + ((ElementalDataForm) dataForm).getChildren().indexOf(item);
			}
		} else {
			dataFormName = "DataForm";
			if (name == null || name.equals("")) {
				name = "Item" + System.currentTimeMillis();
			}
		}
		name = Character.toUpperCase(name.charAt(0)) + name.substring(1);
		String prefix = dataFormName + name;
		// Fix bug about generated dataItem name, such as DataItem with name
		// DataBinding.path and DataForm with name DataBindingPath.
		Resource eResource = item.eResource();
		if (eResource != null) {
			TreeIterator<EObject> allContents = eResource.getAllContents();
			while (allContents.hasNext()) {
				EObject next = allContents.next();
				if (!(next instanceof DataForm)) {
					continue;
				}
				if (prefix.equals(((DataForm) next).getName())) {
					prefix = dataFormName + "_" + name;
				}
			}
		}
		return prefix + "View";
	}
}
