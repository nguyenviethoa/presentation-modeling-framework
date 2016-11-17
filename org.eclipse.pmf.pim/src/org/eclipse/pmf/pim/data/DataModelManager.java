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
package org.eclipse.pmf.pim.data;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.pmf.pim.ElementalDataForm;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Model Manager</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.pmf.pim.data.DataPackage#getDataModelManager()
 * @model abstract="true"
 * @generated
 */
public interface DataModelManager extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isTargetFor(EObject type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	DataType getDataModelType(EObject type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void loadFor(ElementalDataForm view, DataType dataType);

} // DataModelManager
