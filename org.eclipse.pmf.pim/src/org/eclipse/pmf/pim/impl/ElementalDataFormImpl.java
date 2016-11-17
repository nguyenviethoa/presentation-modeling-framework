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

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.pmf.pim.DataElement;
import org.eclipse.pmf.pim.DataForm;
import org.eclipse.pmf.pim.DataItem;
import org.eclipse.pmf.pim.ElementalDataForm;
import org.eclipse.pmf.pim.PMFPackage;
import org.eclipse.pmf.pim.Validator;
import org.eclipse.pmf.pim.ViewProfile;
import org.eclipse.pmf.pim.ui.Layout;
import org.eclipse.pmf.pim.util.PMFValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elemental Data Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.impl.ElementalDataFormImpl#getValidators <em>Validators</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.ElementalDataFormImpl#getLocalValidators <em>Local Validators</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.ElementalDataFormImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.ElementalDataFormImpl#getViewProfiles <em>View Profiles</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.impl.ElementalDataFormImpl#getLayout <em>Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementalDataFormImpl extends DataFormImpl implements
		ElementalDataForm {
	/**
	 * The cached value of the '{@link #getValidators() <em>Validators</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidators()
	 * @generated
	 * @ordered
	 */
	protected EList<Validator> validators;

	/**
	 * The cached value of the '{@link #getLocalValidators() <em>Local Validators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalValidators()
	 * @generated
	 * @ordered
	 */
	protected EList<Validator> localValidators;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<DataItem> children;

	/**
	 * The cached value of the '{@link #getViewProfiles() <em>View Profiles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewProfiles()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewProfile> viewProfiles;

	/**
	 * The cached value of the '{@link #getLayout() <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected Layout layout;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementalDataFormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PMFPackage.Literals.ELEMENTAL_DATA_FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Validator> getValidators() {
		if (validators == null) {
			validators = new EObjectResolvingEList<Validator>(Validator.class,
					this, PMFPackage.ELEMENTAL_DATA_FORM__VALIDATORS);
		}
		return validators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Validator> getLocalValidators() {
		if (localValidators == null) {
			localValidators = new EObjectContainmentEList<Validator>(
					Validator.class, this,
					PMFPackage.ELEMENTAL_DATA_FORM__LOCAL_VALIDATORS);
		}
		return localValidators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataItem> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<DataItem>(DataItem.class,
					this, PMFPackage.ELEMENTAL_DATA_FORM__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViewProfile> getViewProfiles() {
		if (viewProfiles == null) {
			viewProfiles = new EObjectResolvingEList<ViewProfile>(
					ViewProfile.class, this,
					PMFPackage.ELEMENTAL_DATA_FORM__VIEW_PROFILES);
		}
		return viewProfiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout getLayout() {
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayout(Layout newLayout,
			NotificationChain msgs) {
		Layout oldLayout = layout;
		layout = newLayout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, PMFPackage.ELEMENTAL_DATA_FORM__LAYOUT,
					oldLayout, newLayout);
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
	public void setLayout(Layout newLayout) {
		if (newLayout != layout) {
			NotificationChain msgs = null;
			if (layout != null)
				msgs = ((InternalEObject) layout).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- PMFPackage.ELEMENTAL_DATA_FORM__LAYOUT, null,
						msgs);
			if (newLayout != null)
				msgs = ((InternalEObject) newLayout).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- PMFPackage.ELEMENTAL_DATA_FORM__LAYOUT, null,
						msgs);
			msgs = basicSetLayout(newLayout, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PMFPackage.ELEMENTAL_DATA_FORM__LAYOUT, newLayout,
					newLayout));
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
		case PMFPackage.ELEMENTAL_DATA_FORM__LOCAL_VALIDATORS:
			return ((InternalEList<?>) getLocalValidators()).basicRemove(
					otherEnd, msgs);
		case PMFPackage.ELEMENTAL_DATA_FORM__CHILDREN:
			return ((InternalEList<?>) getChildren()).basicRemove(otherEnd,
					msgs);
		case PMFPackage.ELEMENTAL_DATA_FORM__LAYOUT:
			return basicSetLayout(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PMFPackage.ELEMENTAL_DATA_FORM__VALIDATORS:
			return getValidators();
		case PMFPackage.ELEMENTAL_DATA_FORM__LOCAL_VALIDATORS:
			return getLocalValidators();
		case PMFPackage.ELEMENTAL_DATA_FORM__CHILDREN:
			return getChildren();
		case PMFPackage.ELEMENTAL_DATA_FORM__VIEW_PROFILES:
			return getViewProfiles();
		case PMFPackage.ELEMENTAL_DATA_FORM__LAYOUT:
			return getLayout();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PMFPackage.ELEMENTAL_DATA_FORM__VALIDATORS:
			getValidators().clear();
			getValidators().addAll((Collection<? extends Validator>) newValue);
			return;
		case PMFPackage.ELEMENTAL_DATA_FORM__LOCAL_VALIDATORS:
			getLocalValidators().clear();
			getLocalValidators().addAll(
					(Collection<? extends Validator>) newValue);
			return;
		case PMFPackage.ELEMENTAL_DATA_FORM__CHILDREN:
			getChildren().clear();
			getChildren().addAll((Collection<? extends DataItem>) newValue);
			return;
		case PMFPackage.ELEMENTAL_DATA_FORM__VIEW_PROFILES:
			getViewProfiles().clear();
			getViewProfiles().addAll(
					(Collection<? extends ViewProfile>) newValue);
			return;
		case PMFPackage.ELEMENTAL_DATA_FORM__LAYOUT:
			setLayout((Layout) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PMFPackage.ELEMENTAL_DATA_FORM__VALIDATORS:
			getValidators().clear();
			return;
		case PMFPackage.ELEMENTAL_DATA_FORM__LOCAL_VALIDATORS:
			getLocalValidators().clear();
			return;
		case PMFPackage.ELEMENTAL_DATA_FORM__CHILDREN:
			getChildren().clear();
			return;
		case PMFPackage.ELEMENTAL_DATA_FORM__VIEW_PROFILES:
			getViewProfiles().clear();
			return;
		case PMFPackage.ELEMENTAL_DATA_FORM__LAYOUT:
			setLayout((Layout) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PMFPackage.ELEMENTAL_DATA_FORM__VALIDATORS:
			return validators != null && !validators.isEmpty();
		case PMFPackage.ELEMENTAL_DATA_FORM__LOCAL_VALIDATORS:
			return localValidators != null && !localValidators.isEmpty();
		case PMFPackage.ELEMENTAL_DATA_FORM__CHILDREN:
			return children != null && !children.isEmpty();
		case PMFPackage.ELEMENTAL_DATA_FORM__VIEW_PROFILES:
			return viewProfiles != null && !viewProfiles.isEmpty();
		case PMFPackage.ELEMENTAL_DATA_FORM__LAYOUT:
			return layout != null;
		}
		return super.eIsSet(featureID);
	}

	public boolean validate_nameConflict(DiagnosticChain diagnostic,
			Map<Object, Object> context) {
		// TODO Auto-generated method stub
		Boolean valid = true;
		Set<String> name_collection = new HashSet<String>();

		if (context.get("names") == null) {
			context.put("names", name_collection);
		} else {
			name_collection = (Set<String>) context.get("names");
		}
		StringBuffer notification = new StringBuffer();

		for (DataElement dataElement : this.getChildren()) {
			if (dataElement instanceof DataItem) {

				String controlName = "";
				String labelName = "";
				String helpName = "";

				if (dataElement.getControl() == null) {
					controlName = dataElement.getName();
				} else {
					controlName = dataElement.getControl().getName();
				}
				if ((controlName != null) && (controlName != "")) {
					if (name_collection.contains(controlName)) {
						valid = false;
						notification.append(dataElement.getName() + "."
								+ controlName);
					} else {
						name_collection.add(controlName);
					}
				}

				if (((DataItem) dataElement).getLabel() != null) {
					if (((DataItem) dataElement).getLabel().getName() != "")
						labelName = ((DataItem) dataElement).getLabel()
								.getName();
					else {
						labelName = dataElement.getName() + "_label";
					}
				}
				if ((labelName != null) && (labelName != "")) {
					if (name_collection.contains(labelName)) {
						valid = false;
						notification.append(dataElement.getName() + "."
								+ labelName);
					} else {
						name_collection.add(controlName);
					}
				}

				if (((DataItem) dataElement).getHelp() != null) {
					if (((DataItem) dataElement).getHelp().getName() != "")
						helpName = ((DataItem) dataElement).getHelp().getName();
					else {
						helpName = dataElement.getName() + "_help";
					}
				}
				if ((helpName != null) && (helpName != "")) {
					if (name_collection.contains(helpName)) {
						valid = false;
						notification.append(dataElement.getName() + "."
								+ helpName);
					} else {
						name_collection.add(helpName);
					}
				}

			} else if (dataElement instanceof DataForm) {

				context.put("names", name_collection);
				((DataForm) dataElement).validate_nameConflict(diagnostic,
						context);
			}
		}

		if (diagnostic != null) {
			if (!valid) {

				diagnostic.add(new BasicDiagnostic(Diagnostic.ERROR,
						PMFValidator.DIAGNOSTIC_SOURCE,
						PMFValidator.DATAFORM__NO_CIRCULAR_CONTAINMENT,

						"Naming conflict: " + this.getName() + ": "
								+ notification.toString(),
						new Object[] { this }));
			}
		}

		return valid;

	}

} //ElementalDataFormImpl
