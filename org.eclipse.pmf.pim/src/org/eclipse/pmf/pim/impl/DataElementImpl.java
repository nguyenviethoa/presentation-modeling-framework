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

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.pmf.pim.DataElement;
import org.eclipse.pmf.pim.PMFPackage;
import org.eclipse.pmf.pim.UIObject;
import org.eclipse.pmf.pim.data.DataProperty;
import org.eclipse.pmf.pim.data.DataType;
import org.eclipse.pmf.pim.databinding.DataBinding;
import org.eclipse.pmf.pim.generation.PMFUtil;
import org.eclipse.pmf.pim.ui.UIElement;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Data Element</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.impl.DataElementImpl#getDataContextType <em>Data Context Type</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.DataElementImpl#getDataBinding <em>Data Binding</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.DataElementImpl#getResolvedTargetContextType <em>Resolved Target Context Type</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.DataElementImpl#getResolvedDataContextType <em>Resolved Data Context Type</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.DataElementImpl#isChangeable <em>Changeable</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.DataElementImpl#getPropertyChanged <em>Property Changed</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.DataElementImpl#getControl <em>Control</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DataElementImpl extends UIObjectImpl implements
		DataElement {
	/**
	 * The cached value of the '{@link #getDataContextType() <em>Data Context Type</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getDataContextType()
	 * @generated
	 * @ordered
	 */
	protected DataType dataContextType;

	/**
	 * The cached value of the '{@link #getDataBinding() <em>Data Binding</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDataBinding()
	 * @generated
	 * @ordered
	 */
	protected DataBinding dataBinding;

	/**
	 * The default value of the '{@link #isChangeable() <em>Changeable</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isChangeable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHANGEABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isChangeable() <em>Changeable</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isChangeable()
	 * @generated
	 * @ordered
	 */
	protected boolean changeable = CHANGEABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropertyChanged() <em>Property Changed</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getPropertyChanged()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_CHANGED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyChanged() <em>Property Changed</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getPropertyChanged()
	 * @generated
	 * @ordered
	 */
	protected String propertyChanged = PROPERTY_CHANGED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getControl() <em>Control</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getControl()
	 * @generated
	 * @ordered
	 */
	protected UIElement control;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DataElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PMFPackage.Literals.DATA_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDataContextType() {
		if (dataContextType != null && dataContextType.eIsProxy()) {
			InternalEObject oldDataContextType = (InternalEObject) dataContextType;
			dataContextType = (DataType) eResolveProxy(oldDataContextType);
			if (dataContextType != oldDataContextType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PMFPackage.DATA_ELEMENT__DATA_CONTEXT_TYPE,
							oldDataContextType, dataContextType));
			}
		}
		return dataContextType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetDataContextType() {
		return dataContextType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataContextType(DataType newDataContextType) {
		DataType oldDataContextType = dataContextType;
		dataContextType = newDataContextType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PMFPackage.DATA_ELEMENT__DATA_CONTEXT_TYPE,
					oldDataContextType, dataContextType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataBinding getDataBinding() {
		return dataBinding;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataBinding(DataBinding newDataBinding,
			NotificationChain msgs) {
		DataBinding oldDataBinding = dataBinding;
		dataBinding = newDataBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, PMFPackage.DATA_ELEMENT__DATA_BINDING,
					oldDataBinding, newDataBinding);
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
	public void setDataBinding(DataBinding newDataBinding) {
		if (newDataBinding != dataBinding) {
			NotificationChain msgs = null;
			if (dataBinding != null)
				msgs = ((InternalEObject) dataBinding).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- PMFPackage.DATA_ELEMENT__DATA_BINDING, null,
						msgs);
			if (newDataBinding != null)
				msgs = ((InternalEObject) newDataBinding).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- PMFPackage.DATA_ELEMENT__DATA_BINDING, null,
						msgs);
			msgs = basicSetDataBinding(newDataBinding, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PMFPackage.DATA_ELEMENT__DATA_BINDING, newDataBinding,
					newDataBinding));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getResolvedTargetContextType() {
		DataType resolvedTargetContextType = basicGetResolvedTargetContextType();
		return resolvedTargetContextType != null
				&& resolvedTargetContextType.eIsProxy() ? (DataType) eResolveProxy((InternalEObject) resolvedTargetContextType)
				: resolvedTargetContextType;
	}

	protected DataType getParentResolvedContextType() {
		EObject parent = eContainer();
		while (parent != null) {
			if (parent instanceof DataElement) {
				DataElement dataElement = (DataElement) parent;
				return dataElement.getResolvedTargetContextType();
			}
			parent = parent.eContainer();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public DataType basicGetResolvedTargetContextType() {
		DataType type = getDataContextType();
		if (type == null) {
			type = getParentResolvedContextType();
		}
		if (getDataBinding() != null) {
			return PMFUtil.getResolvedContextDataType(type, getDataBinding());
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getResolvedDataContextType() {
		DataType resolvedDataContextType = basicGetResolvedDataContextType();
		return resolvedDataContextType != null
				&& resolvedDataContextType.eIsProxy() ? (DataType) eResolveProxy((InternalEObject) resolvedDataContextType)
				: resolvedDataContextType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public DataType basicGetResolvedDataContextType() {
		if (getDataContextType() != null) {
			return getDataContextType();
		}
		return getParentResolvedContextType();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getId() {
		String id = getName();
		if (id.length() == 0) {
			EObject parent = eContainer();
			if (parent instanceof DataElement) {
				DataElement dataElement = (DataElement) parent;
				id = dataElement.getId();
			} else if (parent instanceof UIObject) {
				UIObject object = (UIObject) parent;
				id = object.getName();
			}
			DataBinding dataBinding = getDataBinding();
			if (dataBinding != null && dataBinding.getPath() != null) {
				DataProperty feature = dataBinding.getPath().getFeature();
				if (feature != null) {
					if (id.length() == 0) {
						id += feature.getName();
					} else {
						id += "." + feature.getName();
					}
				}
			}
		}
		return id;
	}

	@Override
	public String getName() {
		// Allow to custom it?
		String name = super.getName();
		if (name == null || "".equals(name)) {
			DataType type = getResolvedDataContextType();
			if (type != null) {
				return type.getName();
			}
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isChangeable() {
		return changeable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeable(boolean newChangeable) {
		boolean oldChangeable = changeable;
		changeable = newChangeable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PMFPackage.DATA_ELEMENT__CHANGEABLE, oldChangeable,
					changeable));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyChanged() {
		return propertyChanged;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyChanged(String newPropertyChanged) {
		String oldPropertyChanged = propertyChanged;
		propertyChanged = newPropertyChanged;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PMFPackage.DATA_ELEMENT__PROPERTY_CHANGED,
					oldPropertyChanged, propertyChanged));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UIElement getControl() {
		return control;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControl(UIElement newControl,
			NotificationChain msgs) {
		UIElement oldControl = control;
		control = newControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, PMFPackage.DATA_ELEMENT__CONTROL,
					oldControl, newControl);
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
	public void setControl(UIElement newControl) {
		if (newControl != control) {
			NotificationChain msgs = null;
			if (control != null)
				msgs = ((InternalEObject) control).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- PMFPackage.DATA_ELEMENT__CONTROL, null, msgs);
			if (newControl != null)
				msgs = ((InternalEObject) newControl).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- PMFPackage.DATA_ELEMENT__CONTROL, null, msgs);
			msgs = basicSetControl(newControl, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PMFPackage.DATA_ELEMENT__CONTROL, newControl, newControl));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public DataType findBindingContextType() {
		DataType dataType = getDataContextType();
		if (dataType != null) {
			return dataType;
		}
		EObject container = eContainer();
		while (container != null && !(container instanceof DataElement)) {
			container = container.eContainer();
		}
		if (container != null) {
			DataElement ancestor = (DataElement) container;
			return ancestor.findBindingContextType();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PMFPackage.DATA_ELEMENT__DATA_BINDING:
			return basicSetDataBinding(null, msgs);
		case PMFPackage.DATA_ELEMENT__CONTROL:
			return basicSetControl(null, msgs);
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
		case PMFPackage.DATA_ELEMENT__DATA_CONTEXT_TYPE:
			if (resolve)
				return getDataContextType();
			return basicGetDataContextType();
		case PMFPackage.DATA_ELEMENT__DATA_BINDING:
			return getDataBinding();
		case PMFPackage.DATA_ELEMENT__RESOLVED_TARGET_CONTEXT_TYPE:
			if (resolve)
				return getResolvedTargetContextType();
			return basicGetResolvedTargetContextType();
		case PMFPackage.DATA_ELEMENT__RESOLVED_DATA_CONTEXT_TYPE:
			if (resolve)
				return getResolvedDataContextType();
			return basicGetResolvedDataContextType();
		case PMFPackage.DATA_ELEMENT__CHANGEABLE:
			return isChangeable();
		case PMFPackage.DATA_ELEMENT__PROPERTY_CHANGED:
			return getPropertyChanged();
		case PMFPackage.DATA_ELEMENT__CONTROL:
			return getControl();
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
		case PMFPackage.DATA_ELEMENT__DATA_CONTEXT_TYPE:
			setDataContextType((DataType) newValue);
			return;
		case PMFPackage.DATA_ELEMENT__DATA_BINDING:
			setDataBinding((DataBinding) newValue);
			return;
		case PMFPackage.DATA_ELEMENT__CHANGEABLE:
			setChangeable((Boolean) newValue);
			return;
		case PMFPackage.DATA_ELEMENT__PROPERTY_CHANGED:
			setPropertyChanged((String) newValue);
			return;
		case PMFPackage.DATA_ELEMENT__CONTROL:
			setControl((UIElement) newValue);
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
		case PMFPackage.DATA_ELEMENT__DATA_CONTEXT_TYPE:
			setDataContextType((DataType) null);
			return;
		case PMFPackage.DATA_ELEMENT__DATA_BINDING:
			setDataBinding((DataBinding) null);
			return;
		case PMFPackage.DATA_ELEMENT__CHANGEABLE:
			setChangeable(CHANGEABLE_EDEFAULT);
			return;
		case PMFPackage.DATA_ELEMENT__PROPERTY_CHANGED:
			setPropertyChanged(PROPERTY_CHANGED_EDEFAULT);
			return;
		case PMFPackage.DATA_ELEMENT__CONTROL:
			setControl((UIElement) null);
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
		case PMFPackage.DATA_ELEMENT__DATA_CONTEXT_TYPE:
			return dataContextType != null;
		case PMFPackage.DATA_ELEMENT__DATA_BINDING:
			return dataBinding != null;
		case PMFPackage.DATA_ELEMENT__RESOLVED_TARGET_CONTEXT_TYPE:
			return basicGetResolvedTargetContextType() != null;
		case PMFPackage.DATA_ELEMENT__RESOLVED_DATA_CONTEXT_TYPE:
			return basicGetResolvedDataContextType() != null;
		case PMFPackage.DATA_ELEMENT__CHANGEABLE:
			return changeable != CHANGEABLE_EDEFAULT;
		case PMFPackage.DATA_ELEMENT__PROPERTY_CHANGED:
			return PROPERTY_CHANGED_EDEFAULT == null ? propertyChanged != null
					: !PROPERTY_CHANGED_EDEFAULT.equals(propertyChanged);
		case PMFPackage.DATA_ELEMENT__CONTROL:
			return control != null;
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
		result.append(" (changeable: ");
		result.append(changeable);
		result.append(", propertyChanged: ");
		result.append(propertyChanged);
		result.append(')');
		return result.toString();
	}

	private PropertyChangeSupport changeSupport = new PropertyChangeSupport(
			this);

	public void addPropertyChangeListener(String propertyName,
			PropertyChangeListener listener) {
		changeSupport.addPropertyChangeListener(propertyName, listener);
	}

	public void removePropertyChangeListener(String propertyName,
			PropertyChangeListener listener) {
		changeSupport.removePropertyChangeListener(propertyName, listener);
	}

	public void firePropertyChange(PropertyChangeEvent evt) {
		changeSupport.firePropertyChange(evt);
	}

} // DataElementImpl
