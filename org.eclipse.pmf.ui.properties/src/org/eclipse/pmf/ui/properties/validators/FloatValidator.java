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

package org.eclipse.pmf.ui.properties.validators;

import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.xwt.validation.AbstractValidationRule;

public class FloatValidator extends AbstractValidationRule {

	public Phase getPhase() {
		return Phase.BeforeSet;
	}

	public Direction getBindingMode() {
		return Direction.TargetToSource;
	}

	public IStatus validate(Object value) {
		if (value == null || value.equals("")) {
			return ValidationStatus.ok();
		}
		try {
			Float.valueOf(value.toString().trim());
		} catch (NumberFormatException e) {
			return ValidationStatus.error("'" + value.toString()
					+ "' is not a validate float number.");
		}
		return ValidationStatus.ok();
	}

	public IStatus validateBack(Object value) {
		return validate(value);
	}

}
