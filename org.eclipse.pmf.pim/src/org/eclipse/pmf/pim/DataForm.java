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
package org.eclipse.pmf.pim;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Data Form</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.pmf.pim.PMFPackage#getDataForm()
 * @model abstract="true"
 * @generated
 */
public interface DataForm extends DataElement {
	StringBuffer getIndication();

	void setIndication(StringBuffer indication);

	public boolean validate_nameConflict(DiagnosticChain diagnostic,
			Map<Object, Object> context);

} // DataForm
