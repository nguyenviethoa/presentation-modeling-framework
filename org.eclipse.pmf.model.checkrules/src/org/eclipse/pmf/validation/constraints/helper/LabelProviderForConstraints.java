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

package org.eclipse.pmf.validation.constraints.helper;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.validation.internal.util.TextUtils;

@SuppressWarnings("restriction")
public class LabelProviderForConstraints implements
		EValidator.SubstitutionLabelProvider {
	// static final LabelProviderForConstraints INSTANCE = new
	// LabelProviderForConstraints();

	/** Cannot be instantiated by clients. */
	public LabelProviderForConstraints() {
		super();
	}

	public String getObjectLabel(EObject eObject) {
		return TextUtils.getText(eObject);
	}

	public String getFeatureLabel(EStructuralFeature eStructuralFeature) {
		return eStructuralFeature.getName();
	}

	public String getValueLabel(EDataType eDataType, Object value) {
		return EcoreUtil.convertToString(eDataType, value);
	}
}