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
package org.eclipse.pmf.pim.databinding.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.pmf.pim.DataConverter;
import org.eclipse.pmf.pim.Validator;
import org.eclipse.pmf.pim.data.DataType;
import org.eclipse.pmf.pim.databinding.BindingMode;
import org.eclipse.pmf.pim.databinding.DataBinding;
import org.eclipse.pmf.pim.databinding.DataBindingPath;
import org.eclipse.pmf.pim.databinding.DatabindingPackage;
import org.eclipse.pmf.pim.ui.UIElement;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Data Binding</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.databinding.impl.DataBindingImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.databinding.impl.DataBindingImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.databinding.impl.DataBindingImpl#getConverter <em>Converter</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.databinding.impl.DataBindingImpl#getLocalConverter <em>Local Converter</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.databinding.impl.DataBindingImpl#getValidators <em>Validators</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.databinding.impl.DataBindingImpl#getLocalValidators <em>Local Validators</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.databinding.impl.DataBindingImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.databinding.impl.DataBindingImpl#getUpdateSourceTrigger <em>Update Source Trigger</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.databinding.impl.DataBindingImpl#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataBindingImpl extends EObjectImpl implements DataBinding {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DataType type;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected DataBindingPath path;

	/**
	 * The cached value of the '{@link #getConverter() <em>Converter</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getConverter()
	 * @generated
	 * @ordered
	 */
	protected DataConverter converter;

	/**
	 * The cached value of the '{@link #getLocalConverter() <em>Local Converter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalConverter()
	 * @generated
	 * @ordered
	 */
	protected DataConverter localConverter;

	/**
	 * The cached value of the '{@link #getValidators() <em>Validators</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getValidators()
	 * @generated
	 * @ordered
	 */
	protected EList<Validator> validators;

	/**
	 * The cached value of the '{@link #getLocalValidators()
	 * <em>Local Validators</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLocalValidators()
	 * @generated
	 * @ordered
	 */
	protected EList<Validator> localValidators;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final BindingMode MODE_EDEFAULT = BindingMode.TWO_WAY;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected BindingMode mode = MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdateSourceTrigger() <em>Update Source Trigger</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getUpdateSourceTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final String UPDATE_SOURCE_TRIGGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpdateSourceTrigger() <em>Update Source Trigger</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getUpdateSourceTrigger()
	 * @generated
	 * @ordered
	 */
	protected String updateSourceTrigger = UPDATE_SOURCE_TRIGGER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected UIElement status;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DataBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabindingPackage.Literals.DATA_BINDING;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (DataType) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DatabindingPackage.DATA_BINDING__TYPE, oldType,
							type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DataType newType) {
		DataType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DatabindingPackage.DATA_BINDING__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataBindingPath getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(DataBindingPath newPath,
			NotificationChain msgs) {
		DataBindingPath oldPath = path;
		path = newPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, DatabindingPackage.DATA_BINDING__PATH,
					oldPath, newPath);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(DataBindingPath newPath) {
		if (newPath != path) {
			NotificationChain msgs = null;
			if (path != null)
				msgs = ((InternalEObject) path).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- DatabindingPackage.DATA_BINDING__PATH, null,
						msgs);
			if (newPath != null)
				msgs = ((InternalEObject) newPath).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- DatabindingPackage.DATA_BINDING__PATH, null,
						msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DatabindingPackage.DATA_BINDING__PATH, newPath, newPath));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataConverter getConverter() {
		if (converter != null && converter.eIsProxy()) {
			InternalEObject oldConverter = (InternalEObject) converter;
			converter = (DataConverter) eResolveProxy(oldConverter);
			if (converter != oldConverter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DatabindingPackage.DATA_BINDING__CONVERTER,
							oldConverter, converter));
			}
		}
		return converter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataConverter basicGetConverter() {
		return converter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setConverter(DataConverter newConverter) {
		DataConverter oldConverter = converter;
		converter = newConverter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DatabindingPackage.DATA_BINDING__CONVERTER, oldConverter,
					converter));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataConverter getLocalConverter() {
		return localConverter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalConverter(
			DataConverter newLocalConverter, NotificationChain msgs) {
		DataConverter oldLocalConverter = localConverter;
		localConverter = newLocalConverter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					DatabindingPackage.DATA_BINDING__LOCAL_CONVERTER,
					oldLocalConverter, newLocalConverter);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalConverter(DataConverter newLocalConverter) {
		if (newLocalConverter != localConverter) {
			NotificationChain msgs = null;
			if (localConverter != null)
				msgs = ((InternalEObject) localConverter)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- DatabindingPackage.DATA_BINDING__LOCAL_CONVERTER,
								null, msgs);
			if (newLocalConverter != null)
				msgs = ((InternalEObject) newLocalConverter)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- DatabindingPackage.DATA_BINDING__LOCAL_CONVERTER,
								null, msgs);
			msgs = basicSetLocalConverter(newLocalConverter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DatabindingPackage.DATA_BINDING__LOCAL_CONVERTER,
					newLocalConverter, newLocalConverter));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Validator> getValidators() {
		if (validators == null) {
			validators = new EObjectResolvingEList<Validator>(Validator.class,
					this, DatabindingPackage.DATA_BINDING__VALIDATORS);
		}
		return validators;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Validator> getLocalValidators() {
		if (localValidators == null) {
			localValidators = new EObjectContainmentEList<Validator>(
					Validator.class, this,
					DatabindingPackage.DATA_BINDING__LOCAL_VALIDATORS);
		}
		return localValidators;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BindingMode getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(BindingMode newMode) {
		BindingMode oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DatabindingPackage.DATA_BINDING__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpdateSourceTrigger() {
		return updateSourceTrigger;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateSourceTrigger(String newUpdateSourceTrigger) {
		String oldUpdateSourceTrigger = updateSourceTrigger;
		updateSourceTrigger = newUpdateSourceTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DatabindingPackage.DATA_BINDING__UPDATE_SOURCE_TRIGGER,
					oldUpdateSourceTrigger, updateSourceTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIElement getStatus() {
		if (status != null && status.eIsProxy()) {
			InternalEObject oldStatus = (InternalEObject) status;
			status = (UIElement) eResolveProxy(oldStatus);
			if (status != oldStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DatabindingPackage.DATA_BINDING__STATUS, oldStatus,
							status));
			}
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIElement basicGetStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(UIElement newStatus) {
		UIElement oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DatabindingPackage.DATA_BINDING__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DatabindingPackage.DATA_BINDING__PATH:
			return basicSetPath(null, msgs);
		case DatabindingPackage.DATA_BINDING__LOCAL_CONVERTER:
			return basicSetLocalConverter(null, msgs);
		case DatabindingPackage.DATA_BINDING__LOCAL_VALIDATORS:
			return ((InternalEList<?>) getLocalValidators()).basicRemove(
					otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DatabindingPackage.DATA_BINDING__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case DatabindingPackage.DATA_BINDING__PATH:
			return getPath();
		case DatabindingPackage.DATA_BINDING__CONVERTER:
			if (resolve)
				return getConverter();
			return basicGetConverter();
		case DatabindingPackage.DATA_BINDING__LOCAL_CONVERTER:
			return getLocalConverter();
		case DatabindingPackage.DATA_BINDING__VALIDATORS:
			return getValidators();
		case DatabindingPackage.DATA_BINDING__LOCAL_VALIDATORS:
			return getLocalValidators();
		case DatabindingPackage.DATA_BINDING__MODE:
			return getMode();
		case DatabindingPackage.DATA_BINDING__UPDATE_SOURCE_TRIGGER:
			return getUpdateSourceTrigger();
		case DatabindingPackage.DATA_BINDING__STATUS:
			if (resolve)
				return getStatus();
			return basicGetStatus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DatabindingPackage.DATA_BINDING__TYPE:
			setType((DataType) newValue);
			return;
		case DatabindingPackage.DATA_BINDING__PATH:
			setPath((DataBindingPath) newValue);
			return;
		case DatabindingPackage.DATA_BINDING__CONVERTER:
			setConverter((DataConverter) newValue);
			return;
		case DatabindingPackage.DATA_BINDING__LOCAL_CONVERTER:
			setLocalConverter((DataConverter) newValue);
			return;
		case DatabindingPackage.DATA_BINDING__VALIDATORS:
			getValidators().clear();
			getValidators().addAll((Collection<? extends Validator>) newValue);
			return;
		case DatabindingPackage.DATA_BINDING__LOCAL_VALIDATORS:
			getLocalValidators().clear();
			getLocalValidators().addAll(
					(Collection<? extends Validator>) newValue);
			return;
		case DatabindingPackage.DATA_BINDING__MODE:
			setMode((BindingMode) newValue);
			return;
		case DatabindingPackage.DATA_BINDING__UPDATE_SOURCE_TRIGGER:
			setUpdateSourceTrigger((String) newValue);
			return;
		case DatabindingPackage.DATA_BINDING__STATUS:
			setStatus((UIElement) newValue);
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
		case DatabindingPackage.DATA_BINDING__TYPE:
			setType((DataType) null);
			return;
		case DatabindingPackage.DATA_BINDING__PATH:
			setPath((DataBindingPath) null);
			return;
		case DatabindingPackage.DATA_BINDING__CONVERTER:
			setConverter((DataConverter) null);
			return;
		case DatabindingPackage.DATA_BINDING__LOCAL_CONVERTER:
			setLocalConverter((DataConverter) null);
			return;
		case DatabindingPackage.DATA_BINDING__VALIDATORS:
			getValidators().clear();
			return;
		case DatabindingPackage.DATA_BINDING__LOCAL_VALIDATORS:
			getLocalValidators().clear();
			return;
		case DatabindingPackage.DATA_BINDING__MODE:
			setMode(MODE_EDEFAULT);
			return;
		case DatabindingPackage.DATA_BINDING__UPDATE_SOURCE_TRIGGER:
			setUpdateSourceTrigger(UPDATE_SOURCE_TRIGGER_EDEFAULT);
			return;
		case DatabindingPackage.DATA_BINDING__STATUS:
			setStatus((UIElement) null);
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
		case DatabindingPackage.DATA_BINDING__TYPE:
			return type != null;
		case DatabindingPackage.DATA_BINDING__PATH:
			return path != null;
		case DatabindingPackage.DATA_BINDING__CONVERTER:
			return converter != null;
		case DatabindingPackage.DATA_BINDING__LOCAL_CONVERTER:
			return localConverter != null;
		case DatabindingPackage.DATA_BINDING__VALIDATORS:
			return validators != null && !validators.isEmpty();
		case DatabindingPackage.DATA_BINDING__LOCAL_VALIDATORS:
			return localValidators != null && !localValidators.isEmpty();
		case DatabindingPackage.DATA_BINDING__MODE:
			return mode != MODE_EDEFAULT;
		case DatabindingPackage.DATA_BINDING__UPDATE_SOURCE_TRIGGER:
			return UPDATE_SOURCE_TRIGGER_EDEFAULT == null ? updateSourceTrigger != null
					: !UPDATE_SOURCE_TRIGGER_EDEFAULT
							.equals(updateSourceTrigger);
		case DatabindingPackage.DATA_BINDING__STATUS:
			return status != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mode: ");
		result.append(mode);
		result.append(", updateSourceTrigger: ");
		result.append(updateSourceTrigger);
		result.append(')');
		return result.toString();
	}

} // DataBindingImpl
