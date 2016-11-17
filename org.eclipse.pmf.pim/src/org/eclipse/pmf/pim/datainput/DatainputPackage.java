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
package org.eclipse.pmf.pim.datainput;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.pmf.pim.datainput.DatainputFactory
 * @model kind="package"
 * @generated
 */
public interface DatainputPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datainput";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/pmf/datainput";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "datainput";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	DatainputPackage eINSTANCE = org.eclipse.pmf.pim.datainput.impl.DatainputPackageImpl
			.init();

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.pmf.pim.datainput.impl.DataInputImpl
	 * <em>Data Input</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.pmf.pim.datainput.impl.DataInputImpl
	 * @see org.eclipse.pmf.pim.datainput.impl.DatainputPackageImpl#getDataInput()
	 * @generated
	 */
	int DATA_INPUT = 0;

	/**
	 * The number of structural features of the '<em>Data Input</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.pmf.pim.datainput.impl.SelectionInputImpl <em>Selection Input</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.eclipse.pmf.pim.datainput.impl.SelectionInputImpl
	 * @see org.eclipse.pmf.pim.datainput.impl.DatainputPackageImpl#getSelectionInput()
	 * @generated
	 */
	int SELECTION_INPUT = 1;

	/**
	 * The number of structural features of the '<em>Selection Input</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_INPUT_FEATURE_COUNT = DATA_INPUT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.pmf.pim.datainput.impl.FileInputImpl
	 * <em>File Input</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see org.eclipse.pmf.pim.datainput.impl.FileInputImpl
	 * @see org.eclipse.pmf.pim.datainput.impl.DatainputPackageImpl#getFileInput()
	 * @generated
	 */
	int FILE_INPUT = 2;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FILE_INPUT__FILE_NAME = DATA_INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Input</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_INPUT_FEATURE_COUNT = DATA_INPUT_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.datainput.DataInput <em>Data Input</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Input</em>'.
	 * @see org.eclipse.pmf.pim.datainput.DataInput
	 * @generated
	 */
	EClass getDataInput();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.datainput.SelectionInput <em>Selection Input</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Input</em>'.
	 * @see org.eclipse.pmf.pim.datainput.SelectionInput
	 * @generated
	 */
	EClass getSelectionInput();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pmf.pim.datainput.FileInput <em>File Input</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Input</em>'.
	 * @see org.eclipse.pmf.pim.datainput.FileInput
	 * @generated
	 */
	EClass getFileInput();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pmf.pim.datainput.FileInput#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see org.eclipse.pmf.pim.datainput.FileInput#getFileName()
	 * @see #getFileInput()
	 * @generated
	 */
	EAttribute getFileInput_FileName();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatainputFactory getDatainputFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.datainput.impl.DataInputImpl <em>Data Input</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.pim.datainput.impl.DataInputImpl
		 * @see org.eclipse.pmf.pim.datainput.impl.DatainputPackageImpl#getDataInput()
		 * @generated
		 */
		EClass DATA_INPUT = eINSTANCE.getDataInput();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.datainput.impl.SelectionInputImpl <em>Selection Input</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.pim.datainput.impl.SelectionInputImpl
		 * @see org.eclipse.pmf.pim.datainput.impl.DatainputPackageImpl#getSelectionInput()
		 * @generated
		 */
		EClass SELECTION_INPUT = eINSTANCE.getSelectionInput();

		/**
		 * The meta object literal for the '{@link org.eclipse.pmf.pim.datainput.impl.FileInputImpl <em>File Input</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.eclipse.pmf.pim.datainput.impl.FileInputImpl
		 * @see org.eclipse.pmf.pim.datainput.impl.DatainputPackageImpl#getFileInput()
		 * @generated
		 */
		EClass FILE_INPUT = eINSTANCE.getFileInput();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_INPUT__FILE_NAME = eINSTANCE.getFileInput_FileName();

	}

} // DatainputPackage
