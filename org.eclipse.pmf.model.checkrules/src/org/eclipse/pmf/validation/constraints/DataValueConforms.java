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

package org.eclipse.pmf.validation.constraints;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.pmf.pim.PMFObject;
import org.eclipse.pmf.pim.util.PMFValidator;
import org.eclipse.pmf.validation.constraints.helper.DiagnosticUtil;
import org.eclipse.pmf.validation.constraints.helper.LabelProviderForConstraints;

public class DataValueConforms extends AbstractModelConstraint {
	// TODO delegate to the PMFValidator.validate_DataValueConform()
	@Override
	public IStatus validate(IValidationContext ctx) {
		EObject eObj = ctx.getTarget();
		EMFEventType eType = ctx.getEventType();

		Map<Object, Object> context = new HashMap<Object, Object>();
		context.put(EValidator.SubstitutionLabelProvider.class,
				new LabelProviderForConstraints());
		BasicDiagnostic dc = new BasicDiagnostic();
		// In the case of batch mode.
		if (eType == EMFEventType.NULL) {

			if (eObj instanceof PMFObject) {
				PMFObject pmfObj = (PMFObject) eObj;
				dc.getMessage();
				if (!PMFValidator.INSTANCE.validate_EveryDataValueConforms(
						pmfObj, dc, context)) {
					return ctx.createFailureStatus(DiagnosticUtil
							.getErrorMessageFrom(dc));
				}
			}
			// In the case of live mode.
		} else {

		}

		return ctx.createSuccessStatus();
	}
}
