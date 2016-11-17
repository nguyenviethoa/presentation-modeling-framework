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

import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.pmf.emf.EMFProperty;
import org.eclipse.pmf.emf.PEMFPackage;
import org.eclipse.pmf.pim.data.impl.DataPropertyImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>EMF Property</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.pmf.emf.impl.EMFPropertyImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.eclipse.pmf.emf.impl.EMFPropertyImpl#getGenmodel <em>Genmodel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMFPropertyImpl extends DataPropertyImpl implements EMFProperty {
	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature content;

	/**
	 * The cached value of the '{@link #getGenmodel() <em>Genmodel</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getGenmodel()
	 * @generated
	 * @ordered
	 */
	protected GenFeature genmodel;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EMFPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PEMFPackage.Literals.EMF_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getName() {
		return getContent().getName();
	}

	@Override
	public boolean isMany() {
		return getContent().isMany();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getContent() {
		if (content != null && content.eIsProxy()) {
			InternalEObject oldContent = (InternalEObject) content;
			content = (EStructuralFeature) eResolveProxy(oldContent);
			if (content != oldContent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PEMFPackage.EMF_PROPERTY__CONTENT, oldContent,
							content));
			}
		}
		return content;
	}

	@Override
	public boolean isMandatory() {
		return getContent().isRequired();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(EStructuralFeature newContent) {
		EStructuralFeature oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PEMFPackage.EMF_PROPERTY__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GenFeature getGenmodel() {
		if (genmodel != null && genmodel.eIsProxy()) {
			InternalEObject oldGenmodel = (InternalEObject) genmodel;
			genmodel = (GenFeature) eResolveProxy(oldGenmodel);
			if (genmodel != oldGenmodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PEMFPackage.EMF_PROPERTY__GENMODEL, oldGenmodel,
							genmodel));
			}
		}
		return genmodel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GenFeature basicGetGenmodel() {
		return genmodel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenmodel(GenFeature newGenmodel) {
		GenFeature oldGenmodel = genmodel;
		genmodel = newGenmodel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PEMFPackage.EMF_PROPERTY__GENMODEL, oldGenmodel, genmodel));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PEMFPackage.EMF_PROPERTY__CONTENT:
			if (resolve)
				return getContent();
			return basicGetContent();
		case PEMFPackage.EMF_PROPERTY__GENMODEL:
			if (resolve)
				return getGenmodel();
			return basicGetGenmodel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PEMFPackage.EMF_PROPERTY__CONTENT:
			setContent((EStructuralFeature) newValue);
			return;
		case PEMFPackage.EMF_PROPERTY__GENMODEL:
			setGenmodel((GenFeature) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PEMFPackage.EMF_PROPERTY__CONTENT:
			setContent((EStructuralFeature) null);
			return;
		case PEMFPackage.EMF_PROPERTY__GENMODEL:
			setGenmodel((GenFeature) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PEMFPackage.EMF_PROPERTY__CONTENT:
			return content != null;
		case PEMFPackage.EMF_PROPERTY__GENMODEL:
			return genmodel != null;
		}
		return super.eIsSet(featureID);
	}

} // EMFPropertyImpl
