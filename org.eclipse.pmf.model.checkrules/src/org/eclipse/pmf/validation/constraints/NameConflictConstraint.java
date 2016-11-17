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
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.pmf.pim.DataElement;
import org.eclipse.pmf.pim.DataForm;
import org.eclipse.pmf.pim.DataItem;
import org.eclipse.pmf.pim.ElementalDataForm;

public class NameConflictConstraint extends AbstractModelConstraint {

	StringBuffer buffer = new StringBuffer();

	@Override
	public IStatus validate(IValidationContext ctx) {
		// TODO Auto-generated method stub

		EObject eObj = ctx.getTarget();
		EMFEventType eType = ctx.getEventType();

		Map<Object, Object> context = new HashMap<Object, Object>();
		// In the case of batch mode.
		if (eType == EMFEventType.NULL) {

			if (eObj instanceof ElementalDataForm) {
				ElementalDataForm dataForm = (ElementalDataForm) eObj;

				if (!validate_name_conflict(dataForm, context)) {
					return ctx.createFailureStatus(buffer.toString());
				}
			}
			// In the case of live mode.
		} else {
			ElementalDataForm dataForm = (ElementalDataForm) eObj;
			if (!validate_name_conflict(dataForm, context)) {
				return ctx.createFailureStatus(buffer.toString());
			}
		}

		return ctx.createSuccessStatus();

	}

	@SuppressWarnings("unchecked")
	public boolean validate_name_conflict(ElementalDataForm dataForm,
			Map<Object, Object> context) {

		Boolean valid = true;
		Set<String> name_collection = new HashSet<String>();

		if (context.get("names") == null) {
			context.put("names", name_collection);
		} else {
			name_collection = (Set<String>) context.get("names");
		}
		StringBuffer notification = new StringBuffer();

		for (DataElement dataElement : dataForm.getChildren()) {
			if (dataElement instanceof DataItem) {

				String controlName = "";
				String labelName = "";
				String helpName = "";

				if (dataElement.getControl() == null) {
					controlName = dataElement.getName();
				} else {
					controlName = dataElement.getControl().getName();
				}
				if ((controlName != null) && (controlName != "")) {
					if (name_collection.contains(controlName)) {
						valid = false;
						notification.append(dataElement.getName() + "."
								+ controlName);
					} else {
						name_collection.add(controlName);
					}
				}

				if (((DataItem) dataElement).getLabel() != null) {
					if (((DataItem) dataElement).getLabel().getName() != "")
						labelName = ((DataItem) dataElement).getLabel()
								.getName();
					else {
						labelName = dataElement.getName() + "_label";
					}
				}
				if ((labelName != null) && (labelName != "")) {
					if (name_collection.contains(labelName)) {
						valid = false;
						notification.append(dataElement.getName() + "."
								+ labelName);
					} else {
						name_collection.add(controlName);
					}
				}

				if (((DataItem) dataElement).getHelp() != null) {
					if (((DataItem) dataElement).getHelp().getName() != "")
						helpName = ((DataItem) dataElement).getHelp().getName();
					else {
						helpName = dataElement.getName() + "_help";
					}
				}
				if ((helpName != null) && (helpName != "")) {
					if (name_collection.contains(helpName)) {
						valid = false;
						notification.append(dataElement.getName() + "."
								+ helpName);
					} else {
						name_collection.add(helpName);
					}
				}

			} else if (dataElement instanceof DataForm) {

				context.put("names", name_collection);
				// ((DataForm) dataElement).validate_nameConflict(diagnostic,
				// context);
				validate_name_conflict((ElementalDataForm) dataElement, context);
			}
		}
		if (!valid) {
			buffer.append(System.getProperty("line.seperator"));
			buffer.append("Naming conflict: " + dataForm.getName() + ": "
					+ notification.toString());

		}

		return valid;
	}
}
