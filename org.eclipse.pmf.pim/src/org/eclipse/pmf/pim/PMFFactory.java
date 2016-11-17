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
package org.eclipse.pmf.pim;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see org.eclipse.pmf.pim.PMFPackage
 * @generated
 */
public interface PMFFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	PMFFactory eINSTANCE = org.eclipse.pmf.pim.impl.PMFFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Elemental Data Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elemental Data Form</em>'.
	 * @generated
	 */
	ElementalDataForm createElementalDataForm();

	/**
	 * Returns a new object of class '<em>Data Form Selector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Form Selector</em>'.
	 * @generated
	 */
	DataFormSelector createDataFormSelector();

	/**
	 * Returns a new object of class '<em>Data Field</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Field</em>'.
	 * @generated
	 */
	DataField createDataField();

	/**
	 * Returns a new object of class '<em>Data Collection</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Data Collection</em>'.
	 * @generated
	 */
	DataCollection createDataCollection();

	/**
	 * Returns a new object of class '<em>Application</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Application</em>'.
	 * @generated
	 */
	Application createApplication();

	/**
	 * Returns a new object of class '<em>Data Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Group</em>'.
	 * @generated
	 */
	DataGroup createDataGroup();

	/**
	 * Returns a new object of class '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command</em>'.
	 * @generated
	 */
	Command createCommand();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>System Action</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>System Action</em>'.
	 * @generated
	 */
	SystemAction createSystemAction();

	/**
	 * Returns a new object of class '<em>Application Action</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Application Action</em>'.
	 * @generated
	 */
	ApplicationAction createApplicationAction();

	/**
	 * Returns a new object of class '<em>Data Form Folder</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Data Form Folder</em>'.
	 * @generated
	 */
	DataFormFolder createDataFormFolder();

	/**
	 * Returns a new object of class '<em>PMF</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PMF</em>'.
	 * @generated
	 */
	PMF createPMF();

	/**
	 * Returns a new object of class '<em>Data Converter</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Data Converter</em>'.
	 * @generated
	 */
	DataConverter createDataConverter();

	/**
	 * Returns a new object of class '<em>Validator</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Validator</em>'.
	 * @generated
	 */
	Validator createValidator();

	/**
	 * Returns a new object of class '<em>View Profile</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>View Profile</em>'.
	 * @generated
	 */
	ViewProfile createViewProfile();

	/**
	 * Returns a new object of class '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object</em>'.
	 * @generated
	 */
	PMFObject createPMFObject();

	/**
	 * Returns a new object of class '<em>Sorter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sorter</em>'.
	 * @generated
	 */
	Sorter createSorter();

	/**
	 * Returns a new object of class '<em>Data Inheritance</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Data Inheritance</em>'.
	 * @generated
	 */
	DataInheritance createDataInheritance();

	/**
	 * Returns a new object of class '<em>Data Assocication</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Data Assocication</em>'.
	 * @generated
	 */
	DataAssocication createDataAssocication();

	/**
	 * Returns a new object of class '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library</em>'.
	 * @generated
	 */
	Library createLibrary();

	/**
	 * Returns a new object of class '<em>Regex Validator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regex Validator</em>'.
	 * @generated
	 */
	RegexValidator createRegexValidator();

	/**
	 * Returns a new object of class '<em>Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authentication</em>'.
	 * @generated
	 */
	Authentication createAuthentication();

	/**
	 * Returns a new object of class '<em>Wizard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wizard</em>'.
	 * @generated
	 */
	Wizard createWizard();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PMFPackage getPMFPackage();

} // PMFFactory
