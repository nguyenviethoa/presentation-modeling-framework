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
package org.eclipse.pmf.pim.databinding;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Data Binding Node</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.databinding.DataBindingNode#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.databinding.DatabindingPackage#getDataBindingNode()
 * @model
 * @generated
 */
public interface DataBindingNode extends DataBindingPath {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' containment reference.
	 * @see #setNext(DataBindingPath)
	 * @see org.eclipse.pmf.pim.databinding.DatabindingPackage#getDataBindingNode_Next()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataBindingPath getNext();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.databinding.DataBindingNode#getNext <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' containment reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(DataBindingPath value);

} // DataBindingNode
