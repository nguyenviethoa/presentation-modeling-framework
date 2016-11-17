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
package org.eclipse.pmf.pim.interactive.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.pmf.pim.interactive.Condition;
import org.eclipse.pmf.pim.interactive.InteractivePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Condition</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ConditionImpl extends EObjectImpl implements Condition {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractivePackage.Literals.CONDITION;
	}

} // ConditionImpl