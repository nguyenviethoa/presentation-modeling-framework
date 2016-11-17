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
package org.eclipse.pmf.emf.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.pmf.emf.EMFDataModelManager;
import org.eclipse.pmf.emf.EMFDataModelManagerFactory;
import org.eclipse.pmf.emf.EMFFileInput;
import org.eclipse.pmf.emf.EMFProperty;
import org.eclipse.pmf.emf.EMFType;
import org.eclipse.pmf.emf.PEMFFactory;
import org.eclipse.pmf.emf.PEMFPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class PEMFFactoryImpl extends EFactoryImpl implements PEMFFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static PEMFFactory init() {
		try {
			PEMFFactory thePEMFFactory = (PEMFFactory) EPackage.Registry.INSTANCE
					.getEFactory(PEMFPackage.eNS_URI);
			if (thePEMFFactory != null) {
				return thePEMFFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PEMFFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public PEMFFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case PEMFPackage.EMF_DATA_MODEL_MANAGER_FACTORY:
			return createEMFDataModelManagerFactory();
		case PEMFPackage.EMF_DATA_MODEL_MANAGER:
			return createEMFDataModelManager();
		case PEMFPackage.EMF_TYPE:
			return createEMFType();
		case PEMFPackage.EMF_PROPERTY:
			return createEMFProperty();
		case PEMFPackage.ECLASS_TO_DATA_TYPE_MAP_ENTRY:
			return (EObject) createEClassToDataTypeMapEntry();
		case PEMFPackage.EMF_FILE_INPUT:
			return createEMFFileInput();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EMFDataModelManagerFactory createEMFDataModelManagerFactory() {
		EMFDataModelManagerFactoryImpl emfDataModelManagerFactory = new EMFDataModelManagerFactoryImpl();
		return emfDataModelManagerFactory;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EMFDataModelManager createEMFDataModelManager() {
		EMFDataModelManagerImpl emfDataModelManager = new EMFDataModelManagerImpl();
		return emfDataModelManager;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EMFType createEMFType() {
		EMFTypeImpl emfType = new EMFTypeImpl();
		return emfType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EMFProperty createEMFProperty() {
		EMFPropertyImpl emfProperty = new EMFPropertyImpl();
		return emfProperty;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<EClassifier, EMFType> createEClassToDataTypeMapEntry() {
		EClassToDataTypeMapEntryImpl eClassToDataTypeMapEntry = new EClassToDataTypeMapEntryImpl();
		return eClassToDataTypeMapEntry;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EMFFileInput createEMFFileInput() {
		EMFFileInputImpl emfFileInput = new EMFFileInputImpl();
		return emfFileInput;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PEMFPackage getPEMFPackage() {
		return (PEMFPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PEMFPackage getPackage() {
		return PEMFPackage.eINSTANCE;
	}

} // PEMFFactoryImpl
