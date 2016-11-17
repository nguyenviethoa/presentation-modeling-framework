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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.pmf.pim.data.DataModelManager;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Data Model Manager Factory</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.pmf.pim.PMFPackage#getDataModelManagerFactory()
 * @model abstract="true"
 * @generated
 */
public interface DataModelManagerFactory extends EObject {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	DataModelManager createDataModelManager();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isTargetFor(Object dataType);

} // DataModelManagerFactory
