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
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Generic Type</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.data.GenericType#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.data.GenericType#getTypeParameter <em>Type Parameter</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.data.GenericType#getTypeArguments <em>Type Arguments</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.data.GenericType#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.data.GenericType#getLowerBound <em>Lower Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.data.DataPackage#getGenericType()
 * @model
 * @generated
 */
public interface GenericType extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DataType)
	 * @see org.eclipse.pmf.pim.data.DataPackage#getGenericType_Type()
	 * @model
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.data.GenericType#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

	/**
	 * Returns the value of the '<em><b>Type Parameter</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type Parameter</em>' reference.
	 * @see #setTypeParameter(TypeParameter)
	 * @see org.eclipse.pmf.pim.data.DataPackage#getGenericType_TypeParameter()
	 * @model
	 * @generated
	 */
	TypeParameter getTypeParameter();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.data.GenericType#getTypeParameter <em>Type Parameter</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Type Parameter</em>' reference.
	 * @see #getTypeParameter()
	 * @generated
	 */
	void setTypeParameter(TypeParameter value);

	/**
	 * Returns the value of the '<em><b>Type Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.pmf.pim.data.GenericType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Arguments</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Arguments</em>' containment reference list.
	 * @see org.eclipse.pmf.pim.data.DataPackage#getGenericType_TypeArguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenericType> getTypeArguments();

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' containment reference.
	 * @see #setUpperBound(GenericType)
	 * @see org.eclipse.pmf.pim.data.DataPackage#getGenericType_UpperBound()
	 * @model containment="true"
	 * @generated
	 */
	GenericType getUpperBound();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.data.GenericType#getUpperBound <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' containment reference.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(GenericType value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' containment reference.
	 * @see #setLowerBound(GenericType)
	 * @see org.eclipse.pmf.pim.data.DataPackage#getGenericType_LowerBound()
	 * @model containment="true"
	 * @generated
	 */
	GenericType getLowerBound();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.data.GenericType#getLowerBound <em>Lower Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' containment reference.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(GenericType value);

} // GenericType
