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
package org.eclipse.pmf.emf;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.pmf.pim.data.DataModelManager;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>EMF Data Model Manager</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.emf.EMFDataModelManager#getTypeMap <em>Type Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.emf.PEMFPackage#getEMFDataModelManager()
 * @model
 * @generated
 */
public interface EMFDataModelManager extends DataModelManager {

	/**
	 * Returns the value of the '<em><b>Type Map</b></em>' map.
	 * The key is of type {@link org.eclipse.emf.ecore.EClassifier},
	 * and the value is of type {@link org.eclipse.pmf.emf.EMFType},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Map</em>' map isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Map</em>' map.
	 * @see org.eclipse.pmf.emf.PEMFPackage#getEMFDataModelManager_TypeMap()
	 * @model mapType="org.eclipse.pmf.emf.EClassToDataTypeMapEntry<org.eclipse.emf.ecore.EClassifier, org.eclipse.pmf.emf.EMFType>"
	 * @generated
	 */
	EMap<EClassifier, EMFType> getTypeMap();
} // EMFDataModelManager
