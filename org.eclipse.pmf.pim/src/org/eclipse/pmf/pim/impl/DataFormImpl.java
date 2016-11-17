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
package org.eclipse.pmf.pim.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.pmf.pim.DataForm;
import org.eclipse.pmf.pim.PMFPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Data Form</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class DataFormImpl extends DataElementImpl implements DataForm {

	/**
	 * The indication of the validation tool
	 * 
	 * @generated NOT
	 */
	protected StringBuffer indication = new StringBuffer();

	public StringBuffer getIndication() {
		return indication;
	}

	public void setIndication(StringBuffer indication) {
		this.indication = indication;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PMFPackage.Literals.DATA_FORM;
	}
} // DataFormImpl
