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
 * <em><b>Data Binding Leaf</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.databinding.DataBindingLeaf#getAggregationNext <em>Aggregation Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.pmf.pim.databinding.DatabindingPackage#getDataBindingLeaf()
 * @model
 * @generated
 */
public interface DataBindingLeaf extends DataBindingPath {
	/**
	 * Returns the value of the '<em><b>Aggregation Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregation Next</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Next</em>' containment reference.
	 * @see #setAggregationNext(DataBindingLeaf)
	 * @see org.eclipse.pmf.pim.databinding.DatabindingPackage#getDataBindingLeaf_AggregationNext()
	 * @model containment="true"
	 * @generated
	 */
	DataBindingLeaf getAggregationNext();

	/**
	 * Sets the value of the '{@link org.eclipse.pmf.pim.databinding.DataBindingLeaf#getAggregationNext <em>Aggregation Next</em>}' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Next</em>' containment reference.
	 * @see #getAggregationNext()
	 * @generated
	 */
	void setAggregationNext(DataBindingLeaf value);

} // DataBindingLeaf
