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

import org.eclipse.emf.common.util.Diagnostic;

public class DiagnosticUtil {
	public static String getErrorMessageFrom(Diagnostic diagnostic) {
		StringBuffer errorMessage = new StringBuffer("");
		for (Diagnostic subDiagnostic : diagnostic.getChildren()) {
			errorMessage.append("-" + subDiagnostic.getMessage()+ "\n");
		}
		
		return errorMessage.toString();
		
//		return ((Diagnostic)diagnostic.getChildren().get(0)).getMessage();
	}
}
