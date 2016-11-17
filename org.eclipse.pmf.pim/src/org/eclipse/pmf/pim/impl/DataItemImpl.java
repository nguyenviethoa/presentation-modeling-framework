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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.pmf.pim.DataItem;
import org.eclipse.pmf.pim.PMFPackage;
import org.eclipse.pmf.pim.data.DataProperty;
import org.eclipse.pmf.pim.databinding.DataBinding;
import org.eclipse.pmf.pim.databinding.DataBindingPath;
import org.eclipse.pmf.pim.ui.Control;
import org.eclipse.pmf.pim.ui.LayoutData;
import org.eclipse.pmf.pim.util.DataBindingUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Data Item</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.impl.DataItemImpl#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.DataItemImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.DataItemImpl#getHelp <em>Help</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.DataItemImpl#getLayoutData <em>Layout Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DataItemImpl extends DataElementImpl implements DataItem {
	/**
	 * The default value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANDATORY_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean mandatory = MANDATORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected Control label;

	/**
	 * The cached value of the '{@link #getHelp() <em>Help</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelp()
	 * @generated
	 * @ordered
	 */
	protected Control help;

	/**
	 * The cached value of the '{@link #getLayoutData() <em>Layout Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutData()
	 * @generated
	 * @ordered
	 */
	protected LayoutData layoutData;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DataItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PMFPackage.Literals.DATA_ITEM;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isMandatory() {
		if (isDataBindingModelMandatory()) {
			return true;
		}
		return mandatory;
	}

	protected boolean isDataBindingModelMandatory() {
		DataBinding dataBinding = getDataBinding();
		if (dataBinding != null) {
			DataBindingPath bindingPath = dataBinding.getPath();
			if (bindingPath != null) {
				DataProperty dataProperty = bindingPath.getFeature();
				if (dataProperty != null) {
					if (dataProperty.isMandatory()) {
						return true;
					}
				}
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMandatory(boolean newMandatory) {
		boolean oldMandatory = mandatory;
		mandatory = newMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PMFPackage.DATA_ITEM__MANDATORY, oldMandatory, mandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Control getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(Control newLabel,
			NotificationChain msgs) {
		Control oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, PMFPackage.DATA_ITEM__LABEL, oldLabel,
					newLabel);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(Control newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject) label).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PMFPackage.DATA_ITEM__LABEL,
						null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject) newLabel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PMFPackage.DATA_ITEM__LABEL,
						null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PMFPackage.DATA_ITEM__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Control getHelp() {
		return help;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHelp(Control newHelp,
			NotificationChain msgs) {
		Control oldHelp = help;
		help = newHelp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, PMFPackage.DATA_ITEM__HELP, oldHelp,
					newHelp);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHelp(Control newHelp) {
		if (newHelp != help) {
			NotificationChain msgs = null;
			if (help != null)
				msgs = ((InternalEObject) help).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PMFPackage.DATA_ITEM__HELP,
						null, msgs);
			if (newHelp != null)
				msgs = ((InternalEObject) newHelp).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PMFPackage.DATA_ITEM__HELP,
						null, msgs);
			msgs = basicSetHelp(newHelp, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PMFPackage.DATA_ITEM__HELP, newHelp, newHelp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutData getLayoutData() {
		return layoutData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayoutData(LayoutData newLayoutData,
			NotificationChain msgs) {
		LayoutData oldLayoutData = layoutData;
		layoutData = newLayoutData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, PMFPackage.DATA_ITEM__LAYOUT_DATA,
					oldLayoutData, newLayoutData);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutData(LayoutData newLayoutData) {
		if (newLayoutData != layoutData) {
			NotificationChain msgs = null;
			if (layoutData != null)
				msgs = ((InternalEObject) layoutData)
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
								- PMFPackage.DATA_ITEM__LAYOUT_DATA, null, msgs);
			if (newLayoutData != null)
				msgs = ((InternalEObject) newLayoutData)
						.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
								- PMFPackage.DATA_ITEM__LAYOUT_DATA, null, msgs);
			msgs = basicSetLayoutData(newLayoutData, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PMFPackage.DATA_ITEM__LAYOUT_DATA, newLayoutData,
					newLayoutData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PMFPackage.DATA_ITEM__LABEL:
			return basicSetLabel(null, msgs);
		case PMFPackage.DATA_ITEM__HELP:
			return basicSetHelp(null, msgs);
		case PMFPackage.DATA_ITEM__LAYOUT_DATA:
			return basicSetLayoutData(null, msgs);
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
		case PMFPackage.DATA_ITEM__MANDATORY:
			return isMandatory();
		case PMFPackage.DATA_ITEM__LABEL:
			return getLabel();
		case PMFPackage.DATA_ITEM__HELP:
			return getHelp();
		case PMFPackage.DATA_ITEM__LAYOUT_DATA:
			return getLayoutData();
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
		case PMFPackage.DATA_ITEM__MANDATORY:
			setMandatory((Boolean) newValue);
			return;
		case PMFPackage.DATA_ITEM__LABEL:
			setLabel((Control) newValue);
			return;
		case PMFPackage.DATA_ITEM__HELP:
			setHelp((Control) newValue);
			return;
		case PMFPackage.DATA_ITEM__LAYOUT_DATA:
			setLayoutData((LayoutData) newValue);
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
		case PMFPackage.DATA_ITEM__MANDATORY:
			setMandatory(MANDATORY_EDEFAULT);
			return;
		case PMFPackage.DATA_ITEM__LABEL:
			setLabel((Control) null);
			return;
		case PMFPackage.DATA_ITEM__HELP:
			setHelp((Control) null);
			return;
		case PMFPackage.DATA_ITEM__LAYOUT_DATA:
			setLayoutData((LayoutData) null);
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
		case PMFPackage.DATA_ITEM__MANDATORY:
			return mandatory != MANDATORY_EDEFAULT;
		case PMFPackage.DATA_ITEM__LABEL:
			return label != null;
		case PMFPackage.DATA_ITEM__HELP:
			return help != null;
		case PMFPackage.DATA_ITEM__LAYOUT_DATA:
			return layoutData != null;
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
		result.append(" (mandatory: ");
		result.append(mandatory);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getName() {
		DataBinding dataBinding = getDataBinding();
		if (dataBinding != null) {
			return DataBindingUtil.getPath(dataBinding);
		}
		return super.getName();
	}

} // DataItemImpl
