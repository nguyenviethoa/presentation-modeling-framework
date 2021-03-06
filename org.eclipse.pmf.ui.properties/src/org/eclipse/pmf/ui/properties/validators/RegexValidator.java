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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.xwt.validation.AbstractValidationRule;

public class RegexValidator extends AbstractValidationRule {

	private String PATTERN;

	public void setPattern(String p) {
		PATTERN = p;
	}

	public String getPattern() {
		return PATTERN;
	}

	private Pattern pattern;
	private Matcher matcher;

	public RegexValidator() {
	}

	@Override
	public Phase getPhase() {
		return Phase.BeforeSet;
	}

	@Override
	public Direction getBindingMode() {
		return Direction.TargetToSource;
	}

	public IStatus validate(Object value) {

		pattern = Pattern.compile(PATTERN);
		if (value == null || value.equals("")) {
			return ValidationStatus.error("expression can not be empty.");
		}
		matcher = pattern.matcher(value.toString());
		if (matcher.matches()) {
			return ValidationStatus.ok();
		}
		return ValidationStatus.error("'" + value.toString()
				+ "' is not a validate.");
	}

	public IStatus validateBack(Object value) {
		return validate(value);
	}

}
