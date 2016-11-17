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
package org.eclipse.pmf.pim.interactive;

import org.eclipse.pmf.pim.databinding.DataBinding;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Data Predicate</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.interactive.DataPredicate#getBinding <em>Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.interactive.InteractivePackage#getDataPredicate()
 * @model
 * @generated
 */
public interface DataPredicate extends LogicPredicate {

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' containment reference.
	 * @see #setBinding(DataBinding)
	 * @see org.eclipse.pmf.pim.interactive.InteractivePackage#getDataPredicate_Binding()
	 * @model containment="true"
	 * @generated
	 */
	DataBinding getBinding();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.interactive.DataPredicate#getBinding <em>Binding</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' containment reference.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(DataBinding value);
} // DataPredicate
