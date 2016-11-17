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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.pmf.pim.data.DataModelManager;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>PMF</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.PMF#getModelManagerFactories <em>Model Manager Factories</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.PMFPackage#getPMF()
 * @model
 * @generated
 */
public interface PMF extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Manager Factories</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.pmf.pim.DataModelManagerFactory}.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Model Manager Factories</em>' containment
	 * reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Manager Factories</em>' containment reference list.
	 * @see org.eclipse.pmf.pim.PMFPackage#getPMF_ModelManagerFactories()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataModelManagerFactory> getModelManagerFactories();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	DataModelManager getDataModelManager(EObject dataType);

} // PMF
