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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see org.eclipse.pmf.emf.PEMFPackage
 * @generated
 */
public interface PEMFFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	PEMFFactory eINSTANCE = org.eclipse.pmf.emf.impl.PEMFFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EMF Data Model Manager Factory</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>EMF Data Model Manager Factory</em>'.
	 * @generated
	 */
	EMFDataModelManagerFactory createEMFDataModelManagerFactory();

	/**
	 * Returns a new object of class '<em>EMF Data Model Manager</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>EMF Data Model Manager</em>'.
	 * @generated
	 */
	EMFDataModelManager createEMFDataModelManager();

	/**
	 * Returns a new object of class '<em>EMF Type</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return a new object of class '<em>EMF Type</em>'.
	 * @generated
	 */
	EMFType createEMFType();

	/**
	 * Returns a new object of class '<em>EMF Property</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>EMF Property</em>'.
	 * @generated
	 */
	EMFProperty createEMFProperty();

	/**
	 * Returns a new object of class '<em>EMF File Input</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>EMF File Input</em>'.
	 * @generated
	 */
	EMFFileInput createEMFFileInput();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PEMFPackage getPEMFPackage();

} // PEMFFactory
