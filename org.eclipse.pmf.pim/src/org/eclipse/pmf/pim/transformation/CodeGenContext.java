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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Gen Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.transformation.CodeGenContext#getResourceResolvers <em>Resource Resolvers</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.transformation.CodeGenContext#getAllValidatorMap <em>All Validator Map</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.transformation.CodeGenContext#getAllDataConverterMap <em>All Data Converter Map</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.transformation.CodeGenContext#getAllCommandMap <em>All Command Map</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.transformation.CodeGenContext#getAllSystemActionMap <em>All System Action Map</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.transformation.CodeGenContext#getAllViewProfileMap <em>All View Profile Map</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.transformation.CodeGenContext#getAllImageMap <em>All Image Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.transformation.TransformationPackage#getCodeGenContext()
 * @model
 * @generated
 */
public interface CodeGenContext extends ResourceResolver {
	/**
	 * Returns the value of the '<em><b>Resource Resolvers</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.pmf.pim.transformation.ResourceResolver}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Resolvers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Resolvers</em>' reference list.
	 * @see org.eclipse.pmf.pim.transformation.TransformationPackage#getCodeGenContext_ResourceResolvers()
	 * @model
	 * @generated
	 */
	EList<ResourceResolver> getResourceResolvers();

	/**
	 * Returns the value of the '<em><b>All Validator Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Validator Map</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Validator Map</em>' map.
	 * @see org.eclipse.pmf.pim.transformation.TransformationPackage#getCodeGenContext_AllValidatorMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true" changeable="false"
	 * @generated
	 */
	EMap<String, String> getAllValidatorMap();

	/**
	 * Returns the value of the '<em><b>All Data Converter Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Data Converter Map</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Data Converter Map</em>' map.
	 * @see org.eclipse.pmf.pim.transformation.TransformationPackage#getCodeGenContext_AllDataConverterMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true" changeable="false"
	 * @generated
	 */
	EMap<String, String> getAllDataConverterMap();

	/**
	 * Returns the value of the '<em><b>All Command Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Command Map</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Command Map</em>' map.
	 * @see org.eclipse.pmf.pim.transformation.TransformationPackage#getCodeGenContext_AllCommandMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true" changeable="false"
	 * @generated
	 */
	EMap<String, String> getAllCommandMap();

	/**
	 * Returns the value of the '<em><b>All System Action Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All System Action Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All System Action Map</em>' map.
	 * @see org.eclipse.pmf.pim.transformation.TransformationPackage#getCodeGenContext_AllSystemActionMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true" changeable="false"
	 * @generated
	 */
	EMap<String, String> getAllSystemActionMap();

	/**
	 * Returns the value of the '<em><b>All View Profile Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All View Profile Map</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All View Profile Map</em>' map.
	 * @see org.eclipse.pmf.pim.transformation.TransformationPackage#getCodeGenContext_AllViewProfileMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true" changeable="false"
	 * @generated
	 */
	EMap<String, String> getAllViewProfileMap();

	/**
	 * Returns the value of the '<em><b>All Image Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Image Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Image Map</em>' map.
	 * @see org.eclipse.pmf.pim.transformation.TransformationPackage#getCodeGenContext_AllImageMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true" changeable="false"
	 * @generated
	 */
	EMap<String, String> getAllImageMap();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getDataConverter(String key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getValidator(String key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getCommand(String key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getSystemAction(String key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getViewProfile(String key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getImage(String key);

} // CodeGenContext
