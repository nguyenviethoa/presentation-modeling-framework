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

import org.eclipse.emf.common.util.EList;
import org.eclipse.pmf.pim.PMFObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Type</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.data.DataType#getManager <em>Manager</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.data.DataType#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.data.DataType#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.data.DataType#isPrimitive <em>Primitive</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.data.DataType#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.data.DataType#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.data.DataType#getGenericSuperTypes <em>Generic Super Types</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.data.DataType#isEnum <em>Enum</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.data.DataPackage#getDataType()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DataType extends PMFObject {
	/**
	 * Returns the value of the '<em><b>Manager</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Manager</em>' reference.
	 * @see #setManager(DataModelManager)
	 * @see org.eclipse.pmf.pim.data.DataPackage#getDataType_Manager()
	 * @model
	 * @generated
	 */
	DataModelManager getManager();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.data.DataType#getManager <em>Manager</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager</em>' reference.
	 * @see #getManager()
	 * @generated
	 */
	void setManager(DataModelManager value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.pmf.pim.data.DataProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.eclipse.pmf.pim.data.DataPackage#getDataType_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataProperty> getProperties();

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see org.eclipse.pmf.pim.data.DataPackage#getDataType_Abstract()
	 * @model transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Returns the value of the '<em><b>Primitive</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Primitive</em>' attribute.
	 * @see org.eclipse.pmf.pim.data.DataPackage#getDataType_Primitive()
	 * @model transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	boolean isPrimitive();

	/**
	 * Returns the value of the '<em><b>Super Types</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.pmf.pim.data.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Types</em>' reference list.
	 * @see org.eclipse.pmf.pim.data.DataPackage#getDataType_SuperTypes()
	 * @model
	 * @generated
	 */
	EList<DataType> getSuperTypes();

	/**
	 * Returns the value of the '<em><b>Type Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.pmf.pim.data.TypeParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Parameters</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Parameters</em>' containment reference list.
	 * @see org.eclipse.pmf.pim.data.DataPackage#getDataType_TypeParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeParameter> getTypeParameters();

	/**
	 * Returns the value of the '<em><b>Generic Super Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.pmf.pim.data.GenericType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Super Types</em>' containment
	 * reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Super Types</em>' containment reference list.
	 * @see org.eclipse.pmf.pim.data.DataPackage#getDataType_GenericSuperTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenericType> getGenericSuperTypes();

	/**
	 * Returns the value of the '<em><b>Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum</em>' attribute.
	 * @see #setEnum(boolean)
	 * @see org.eclipse.pmf.pim.data.DataPackage#getDataType_Enum()
	 * @model
	 * @generated
	 */
	boolean isEnum();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.data.DataType#isEnum <em>Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum</em>' attribute.
	 * @see #isEnum()
	 * @generated
	 */
	void setEnum(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getRuntimeName();

} // Type
