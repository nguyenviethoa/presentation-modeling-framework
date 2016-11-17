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
package org.eclipse.pmf.pim.transformation;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.pmf.pim.PMFObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Code Gen Context</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.transformation.ResourceResolver#getValidatorMap <em>Validator Map</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.transformation.ResourceResolver#getDataConverterMap <em>Data Converter Map</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.transformation.ResourceResolver#getCommandMap <em>Command Map</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.transformation.ResourceResolver#getViewProfileMap <em>View Profile Map</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.transformation.ResourceResolver#getImageMap <em>Image Map</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.transformation.ResourceResolver#getSystemActionMap <em>System Action Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.transformation.TransformationPackage#getResourceResolver()
 * @model
 * @generated
 */
public interface ResourceResolver extends PMFObject {
	/**
	 * Returns the value of the '<em><b>Validator Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validator Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validator Map</em>' map.
	 * @see org.eclipse.pmf.pim.transformation.TransformationPackage#getResourceResolver_ValidatorMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getValidatorMap();

	/**
	 * Returns the value of the '<em><b>Data Converter Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Converter Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Converter Map</em>' map.
	 * @see org.eclipse.pmf.pim.transformation.TransformationPackage#getResourceResolver_DataConverterMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getDataConverterMap();

	/**
	 * Returns the value of the '<em><b>Command Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command Map</em>' map.
	 * @see org.eclipse.pmf.pim.transformation.TransformationPackage#getResourceResolver_CommandMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getCommandMap();

	/**
	 * Returns the value of the '<em><b>View Profile Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Profile Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Profile Map</em>' map.
	 * @see org.eclipse.pmf.pim.transformation.TransformationPackage#getResourceResolver_ViewProfileMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getViewProfileMap();

	/**
	 * Returns the value of the '<em><b>System Action Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Action Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Action Map</em>' map.
	 * @see org.eclipse.pmf.pim.transformation.TransformationPackage#getResourceResolver_SystemActionMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getSystemActionMap();

	/**
	 * Returns the value of the '<em><b>Image Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Map</em>' map.
	 * @see org.eclipse.pmf.pim.transformation.TransformationPackage#getResourceResolver_ImageMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getImageMap();

} // ResourceResolver
