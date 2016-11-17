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

import java.util.Collection;

import org.eclipse.emf.codegen.ecore.genmodel.GenClassifier;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.pmf.emf.EMFProperty;
import org.eclipse.pmf.emf.EMFType;
import org.eclipse.pmf.emf.PEMFPackage;
import org.eclipse.pmf.pim.data.DataModelManager;
import org.eclipse.pmf.pim.data.DataProperty;
import org.eclipse.pmf.pim.data.DataType;
import org.eclipse.pmf.pim.data.GenericType;
import org.eclipse.pmf.pim.data.TypeParameter;
import org.eclipse.pmf.pim.impl.PMFObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>EMF Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.pmf.emf.impl.EMFTypeImpl#getManager <em>Manager</em>}</li>
 *   <li>{@link org.eclipse.pmf.emf.impl.EMFTypeImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.pmf.emf.impl.EMFTypeImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.eclipse.pmf.emf.impl.EMFTypeImpl#isPrimitive <em>Primitive</em>}</li>
 *   <li>{@link org.eclipse.pmf.emf.impl.EMFTypeImpl#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link org.eclipse.pmf.emf.impl.EMFTypeImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.eclipse.pmf.emf.impl.EMFTypeImpl#getGenericSuperTypes <em>Generic Super Types</em>}</li>
 *   <li>{@link org.eclipse.pmf.emf.impl.EMFTypeImpl#isEnum <em>Enum</em>}</li>
 *   <li>{@link org.eclipse.pmf.emf.impl.EMFTypeImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.eclipse.pmf.emf.impl.EMFTypeImpl#getGenmodel <em>Genmodel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMFTypeImpl extends PMFObjectImpl implements EMFType {
	/**
	 * The cached value of the '{@link #getManager() <em>Manager</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getManager()
	 * @generated
	 * @ordered
	 */
	protected DataModelManager manager;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<DataProperty> properties;

	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isPrimitive() <em>Primitive</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isPrimitive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRIMITIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #getSuperTypes() <em>Super Types</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSuperTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> superTypes;

	/**
	 * The cached value of the '{@link #getTypeParameters()
	 * <em>Type Parameters</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTypeParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeParameter> typeParameters;

	/**
	 * The cached value of the '{@link #getGenericSuperTypes()
	 * <em>Generic Super Types</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getGenericSuperTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<GenericType> genericSuperTypes;

	/**
	 * The default value of the '{@link #isEnum() <em>Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnum()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENUM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnum() <em>Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnum()
	 * @generated
	 * @ordered
	 */
	protected boolean enum_ = ENUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected EClassifier content;

	/**
	 * The cached value of the '{@link #getGenmodel() <em>Genmodel</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getGenmodel()
	 * @generated
	 * @ordered
	 */
	protected GenClassifier genmodel;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EMFTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PEMFPackage.Literals.EMF_TYPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getName() {
		return getContent().getName();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isAbstract() {
		EClassifier classifier = getContent();
		if (classifier instanceof EClass) {
			return ((EClass) classifier).isAbstract();
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isPrimitive() {
		return (getContent() instanceof EDataType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getSuperTypes() {
		if (superTypes == null) {
			superTypes = new EObjectResolvingEList<DataType>(DataType.class,
					this, PEMFPackage.EMF_TYPE__SUPER_TYPES);
		}
		return superTypes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeParameter> getTypeParameters() {
		if (typeParameters == null) {
			typeParameters = new EObjectContainmentEList<TypeParameter>(
					TypeParameter.class, this,
					PEMFPackage.EMF_TYPE__TYPE_PARAMETERS);
		}
		return typeParameters;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenericType> getGenericSuperTypes() {
		if (genericSuperTypes == null) {
			genericSuperTypes = new EObjectContainmentEList<GenericType>(
					GenericType.class, this,
					PEMFPackage.EMF_TYPE__GENERIC_SUPER_TYPES);
		}
		return genericSuperTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isEnum() {
		return getContent() instanceof EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnum(boolean newEnum) {
		boolean oldEnum = enum_;
		enum_ = newEnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PEMFPackage.EMF_TYPE__ENUM, oldEnum, enum_));
	}

	public String getRuntimeName() {
		GenClassifier classifier = getGenmodel();
		if (classifier != null) {
			return classifier.getRawInstanceClassName();
		}
		return null;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataModelManager getManager() {
		if (manager != null && manager.eIsProxy()) {
			InternalEObject oldManager = (InternalEObject) manager;
			manager = (DataModelManager) eResolveProxy(oldManager);
			if (manager != oldManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PEMFPackage.EMF_TYPE__MANAGER, oldManager, manager));
			}
		}
		return manager;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DataModelManager basicGetManager() {
		return manager;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setManager(DataModelManager newManager) {
		DataModelManager oldManager = manager;
		manager = newManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PEMFPackage.EMF_TYPE__MANAGER, oldManager, manager));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<DataProperty>(
					DataProperty.class, this, PEMFPackage.EMF_TYPE__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier getContent() {
		if (content != null && content.eIsProxy()) {
			InternalEObject oldContent = (InternalEObject) content;
			content = (EClassifier) eResolveProxy(oldContent);
			if (content != oldContent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PEMFPackage.EMF_TYPE__CONTENT, oldContent, content));
			}
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier basicGetContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(EClassifier newContent) {
		EClassifier oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PEMFPackage.EMF_TYPE__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GenClassifier getGenmodel() {
		if (genmodel != null && genmodel.eIsProxy()) {
			InternalEObject oldGenmodel = (InternalEObject) genmodel;
			genmodel = (GenClassifier) eResolveProxy(oldGenmodel);
			if (genmodel != oldGenmodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PEMFPackage.EMF_TYPE__GENMODEL, oldGenmodel,
							genmodel));
			}
		}
		return genmodel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GenClassifier basicGetGenmodel() {
		return genmodel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenmodel(GenClassifier newGenmodel) {
		GenClassifier oldGenmodel = genmodel;
		genmodel = newGenmodel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PEMFPackage.EMF_TYPE__GENMODEL, oldGenmodel, genmodel));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void updateGenmodel(GenClassifier genmodel) {
		this.setGenmodel(genmodel);

		// set properties
		for (EObject item : genmodel.eContents()) {
			if (item instanceof GenFeature) {
				GenFeature genFeature = (GenFeature) item;
				EStructuralFeature structuralFeature = genFeature
						.getEcoreFeature();
				for (DataProperty dataProperty : getProperties()) {
					EMFProperty property = (EMFProperty) dataProperty;
					if (property.getContent() == structuralFeature) {
						property.setGenmodel(genFeature);
						break;
					}
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PEMFPackage.EMF_TYPE__PROPERTIES:
			return ((InternalEList<?>) getProperties()).basicRemove(otherEnd,
					msgs);
		case PEMFPackage.EMF_TYPE__TYPE_PARAMETERS:
			return ((InternalEList<?>) getTypeParameters()).basicRemove(
					otherEnd, msgs);
		case PEMFPackage.EMF_TYPE__GENERIC_SUPER_TYPES:
			return ((InternalEList<?>) getGenericSuperTypes()).basicRemove(
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
		case PEMFPackage.EMF_TYPE__MANAGER:
			if (resolve)
				return getManager();
			return basicGetManager();
		case PEMFPackage.EMF_TYPE__PROPERTIES:
			return getProperties();
		case PEMFPackage.EMF_TYPE__ABSTRACT:
			return isAbstract();
		case PEMFPackage.EMF_TYPE__PRIMITIVE:
			return isPrimitive();
		case PEMFPackage.EMF_TYPE__SUPER_TYPES:
			return getSuperTypes();
		case PEMFPackage.EMF_TYPE__TYPE_PARAMETERS:
			return getTypeParameters();
		case PEMFPackage.EMF_TYPE__GENERIC_SUPER_TYPES:
			return getGenericSuperTypes();
		case PEMFPackage.EMF_TYPE__ENUM:
			return isEnum();
		case PEMFPackage.EMF_TYPE__CONTENT:
			if (resolve)
				return getContent();
			return basicGetContent();
		case PEMFPackage.EMF_TYPE__GENMODEL:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PEMFPackage.EMF_TYPE__MANAGER:
			setManager((DataModelManager) newValue);
			return;
		case PEMFPackage.EMF_TYPE__PROPERTIES:
			getProperties().clear();
			getProperties().addAll(
					(Collection<? extends DataProperty>) newValue);
			return;
		case PEMFPackage.EMF_TYPE__SUPER_TYPES:
			getSuperTypes().clear();
			getSuperTypes().addAll((Collection<? extends DataType>) newValue);
			return;
		case PEMFPackage.EMF_TYPE__TYPE_PARAMETERS:
			getTypeParameters().clear();
			getTypeParameters().addAll(
					(Collection<? extends TypeParameter>) newValue);
			return;
		case PEMFPackage.EMF_TYPE__GENERIC_SUPER_TYPES:
			getGenericSuperTypes().clear();
			getGenericSuperTypes().addAll(
					(Collection<? extends GenericType>) newValue);
			return;
		case PEMFPackage.EMF_TYPE__ENUM:
			setEnum((Boolean) newValue);
			return;
		case PEMFPackage.EMF_TYPE__CONTENT:
			setContent((EClassifier) newValue);
			return;
		case PEMFPackage.EMF_TYPE__GENMODEL:
			setGenmodel((GenClassifier) newValue);
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
		case PEMFPackage.EMF_TYPE__MANAGER:
			setManager((DataModelManager) null);
			return;
		case PEMFPackage.EMF_TYPE__PROPERTIES:
			getProperties().clear();
			return;
		case PEMFPackage.EMF_TYPE__SUPER_TYPES:
			getSuperTypes().clear();
			return;
		case PEMFPackage.EMF_TYPE__TYPE_PARAMETERS:
			getTypeParameters().clear();
			return;
		case PEMFPackage.EMF_TYPE__GENERIC_SUPER_TYPES:
			getGenericSuperTypes().clear();
			return;
		case PEMFPackage.EMF_TYPE__ENUM:
			setEnum(ENUM_EDEFAULT);
			return;
		case PEMFPackage.EMF_TYPE__CONTENT:
			setContent((EClassifier) null);
			return;
		case PEMFPackage.EMF_TYPE__GENMODEL:
			setGenmodel((GenClassifier) null);
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
		case PEMFPackage.EMF_TYPE__MANAGER:
			return manager != null;
		case PEMFPackage.EMF_TYPE__PROPERTIES:
			return properties != null && !properties.isEmpty();
		case PEMFPackage.EMF_TYPE__ABSTRACT:
			return isAbstract() != ABSTRACT_EDEFAULT;
		case PEMFPackage.EMF_TYPE__PRIMITIVE:
			return isPrimitive() != PRIMITIVE_EDEFAULT;
		case PEMFPackage.EMF_TYPE__SUPER_TYPES:
			return superTypes != null && !superTypes.isEmpty();
		case PEMFPackage.EMF_TYPE__TYPE_PARAMETERS:
			return typeParameters != null && !typeParameters.isEmpty();
		case PEMFPackage.EMF_TYPE__GENERIC_SUPER_TYPES:
			return genericSuperTypes != null && !genericSuperTypes.isEmpty();
		case PEMFPackage.EMF_TYPE__ENUM:
			return enum_ != ENUM_EDEFAULT;
		case PEMFPackage.EMF_TYPE__CONTENT:
			return content != null;
		case PEMFPackage.EMF_TYPE__GENMODEL:
			return genmodel != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (enum: ");
		result.append(enum_);
		result.append(')');
		return result.toString();
	}
} // EMFTypeImpl
