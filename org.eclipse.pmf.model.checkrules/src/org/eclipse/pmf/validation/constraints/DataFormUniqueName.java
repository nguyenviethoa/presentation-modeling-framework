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

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.pmf.pim.DataForm;
import org.eclipse.pmf.pim.impl.DataFormFolderImpl;

public class DataFormUniqueName extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext ctx) {

		EObject eObj = ctx.getTarget();
		EMFEventType eType = ctx.getEventType();

		// In the case of batch mode.
		if (eType == EMFEventType.NULL) {

			if (eObj instanceof DataForm) {
				DataForm dataForm = (DataForm) eObj;

				if (!validateDataFormUnicityName(dataForm, ctx)) {
					return ctx.createFailureStatus(eObj.eClass().getName());
				}
			}

			// In the case of live mode.
		} else {

			DataForm dataForm = (DataForm) eObj;

			if (!validateDataFormUnicityName(dataForm, ctx)) {
				return ctx.createFailureStatus(eObj.eClass().getName());
			}
		}

		return ctx.createSuccessStatus();
	}

	public boolean validateDataFormUnicityName(DataForm dataForm,
			IValidationContext ctx) {

		Boolean valid = true;

		DataFormFolderImpl dataFormFolder = (DataFormFolderImpl) dataForm
				.eContainer();

		for (DataForm dataF : dataFormFolder.getDataForms()) {

			if (dataF != dataForm && dataF.getName().equals(dataForm.getName())) {
				valid = false;
				break;
			}
		}

		return valid;

	}

}
