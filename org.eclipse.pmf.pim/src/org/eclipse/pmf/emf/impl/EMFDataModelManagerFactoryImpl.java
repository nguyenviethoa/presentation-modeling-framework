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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.pmf.emf.EMFDataModelManagerFactory;
import org.eclipse.pmf.emf.PEMFFactory;
import org.eclipse.pmf.emf.PEMFPackage;
import org.eclipse.pmf.pim.data.DataModelManager;
import org.eclipse.pmf.pim.impl.DataModelManagerFactoryImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>EMF Data Model Manager Factory</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMFDataModelManagerFactoryImpl extends DataModelManagerFactoryImpl
		implements EMFDataModelManagerFactory {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EMFDataModelManagerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PEMFPackage.Literals.EMF_DATA_MODEL_MANAGER_FACTORY;
	}

	@Override
	public DataModelManager createDataModelManager() {
		return PEMFFactory.eINSTANCE.createEMFDataModelManager();
	}
} // EMFDataModelManagerFactoryImpl
