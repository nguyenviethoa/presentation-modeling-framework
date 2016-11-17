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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see org.eclipse.pmf.pim.databinding.DatabindingPackage
 * @generated
 */
public interface DatabindingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	DatabindingFactory eINSTANCE = org.eclipse.pmf.pim.databinding.impl.DatabindingFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Data Binding Node</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Data Binding Node</em>'.
	 * @generated
	 */
	DataBindingNode createDataBindingNode();

	/**
	 * Returns a new object of class '<em>Data Binding Leaf</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Data Binding Leaf</em>'.
	 * @generated
	 */
	DataBindingLeaf createDataBindingLeaf();

	/**
	 * Returns a new object of class '<em>Data Binding</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Data Binding</em>'.
	 * @generated
	 */
	DataBinding createDataBinding();

	/**
	 * Returns a new object of class '<em>Data Binding Path</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Data Binding Path</em>'.
	 * @generated
	 */
	DataBindingPath createDataBindingPath();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DatabindingPackage getDatabindingPackage();

} // DatabindingFactory
