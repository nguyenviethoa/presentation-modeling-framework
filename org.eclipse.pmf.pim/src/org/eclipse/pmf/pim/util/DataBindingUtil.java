/*******************************************************************************
 * Copyright (c) 2006, 2016 Soyatec (http://www.soyatec.com) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Soyatec - initial API and implementation
 *******************************************************************************/
package org.eclipse.pmf.pim.util;

import org.eclipse.pmf.pim.data.DataProperty;
import org.eclipse.pmf.pim.databinding.DataBinding;
import org.eclipse.pmf.pim.databinding.DataBindingNode;
import org.eclipse.pmf.pim.databinding.DataBindingPath;

/**
 * 
 * @author yyang
 */
public class DataBindingUtil {

	/**
	 * Return the entire DataBinding path
	 * 
	 * @param dataBinding
	 * @return
	 */
	public static String getPath(DataBinding dataBinding) {
		StringBuilder stringBuilder = new StringBuilder();
		DataBindingPath abstractDataBindingPath = dataBinding.getPath();
		while (abstractDataBindingPath != null) {
			DataProperty property = abstractDataBindingPath.getFeature();
			if (property != null) {
				if (stringBuilder.length() != 0) {
					stringBuilder.append('.');
				}
				stringBuilder.append(property.getName());
			} else {
				stringBuilder.append("?");
				break;
			}
			if (abstractDataBindingPath instanceof DataBindingNode) {
				DataBindingNode bindingNode = (DataBindingNode) abstractDataBindingPath;
				abstractDataBindingPath = bindingNode.getNext();
				if (abstractDataBindingPath == null) {
					stringBuilder.append("?");
					break;
				}
			} else {
				break;
			}
		}
		if (stringBuilder.length() != 0) {
			return stringBuilder.toString();
		}
		return "";
	}

	/**
	 * Return the entire DataBinding path
	 * 
	 * @param dataBinding
	 * @return
	 */
	public static String getPath(DataBindingPath dataBindingPath) {
		DataProperty property = dataBindingPath.getFeature();
		if (property != null) {
			return property.getName();
		}
		return "?";
	}
}
