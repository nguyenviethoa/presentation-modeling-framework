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
package org.eclipse.pmf.pim.metamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.pmf.pim.impl.PMFObjectImpl;
import org.eclipse.pmf.pim.metamodel.GenericType;
import org.eclipse.pmf.pim.metamodel.MetamodelPackage;
import org.eclipse.pmf.pim.metamodel.Property;
import org.eclipse.pmf.pim.metamodel.Type;
import org.eclipse.pmf.pim.metamodel.TypeParameter;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.pmf.pim.metamodel.impl.TypeImpl#getProperties <em>
 * Properties</em>}</li>
 * <li>{@link org.eclipse.pmf.pim.metamodel.impl.TypeImpl#isAbstract <em>
 * Abstract</em>}</li>
 * <li>{@link org.eclipse.pmf.pim.metamodel.impl.TypeImpl#isPrimitive <em>
 * Primitive</em>}</li>
 * <li>{@link org.eclipse.pmf.pim.metamodel.impl.TypeImpl#getSuperTypes <em>
 * Super Types</em>}</li>
 * <li>{@link org.eclipse.pmf.pim.metamodel.impl.TypeImpl#getTypeParameters <em>
 * Type Parameters</em>}</li>
 * <li>{@link org.eclipse.pmf.pim.metamodel.impl.TypeImpl#getGenericSuperTypes
 * <em>Generic Super Types</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class TypeImpl extends PMFObjectImpl implements Type {
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isPrimitive() <em>Primitive</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isPrimitive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRIMITIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #getSuperTypes() <em>Super Types</em>}'
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSuperTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> superTypes;

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.TYPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class,
					this, MetamodelPackage.TYPE__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isAbstract() {
		// TODO: implement this method to return the 'Abstract' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isPrimitive() {
		// TODO: implement this method to return the 'Primitive' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Type> getSuperTypes() {
		if (superTypes == null) {
			superTypes = new EObjectResolvingEList<Type>(Type.class, this,
					MetamodelPackage.TYPE__SUPER_TYPES);
		}
		return superTypes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<TypeParameter> getTypeParameters() {
		if (typeParameters == null) {
			typeParameters = new EObjectContainmentEList<TypeParameter>(
					TypeParameter.class, this,
					MetamodelPackage.TYPE__TYPE_PARAMETERS);
		}
		return typeParameters;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<GenericType> getGenericSuperTypes() {
		if (genericSuperTypes == null) {
			genericSuperTypes = new EObjectContainmentEList<GenericType>(
					GenericType.class, this,
					MetamodelPackage.TYPE__GENERIC_SUPER_TYPES);
		}
		return genericSuperTypes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.TYPE__PROPERTIES:
			return ((InternalEList<?>) getProperties()).basicRemove(otherEnd,
					msgs);
		case MetamodelPackage.TYPE__TYPE_PARAMETERS:
			return ((InternalEList<?>) getTypeParameters()).basicRemove(
					otherEnd, msgs);
		case MetamodelPackage.TYPE__GENERIC_SUPER_TYPES:
			return ((InternalEList<?>) getGenericSuperTypes()).basicRemove(
					otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.TYPE__PROPERTIES:
			return getProperties();
		case MetamodelPackage.TYPE__ABSTRACT:
			return isAbstract();
		case MetamodelPackage.TYPE__PRIMITIVE:
			return isPrimitive();
		case MetamodelPackage.TYPE__SUPER_TYPES:
			return getSuperTypes();
		case MetamodelPackage.TYPE__TYPE_PARAMETERS:
			return getTypeParameters();
		case MetamodelPackage.TYPE__GENERIC_SUPER_TYPES:
			return getGenericSuperTypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MetamodelPackage.TYPE__PROPERTIES:
			getProperties().clear();
			getProperties().addAll((Collection<? extends Property>) newValue);
			return;
		case MetamodelPackage.TYPE__SUPER_TYPES:
			getSuperTypes().clear();
			getSuperTypes().addAll((Collection<? extends Type>) newValue);
			return;
		case MetamodelPackage.TYPE__TYPE_PARAMETERS:
			getTypeParameters().clear();
			getTypeParameters().addAll(
					(Collection<? extends TypeParameter>) newValue);
			return;
		case MetamodelPackage.TYPE__GENERIC_SUPER_TYPES:
			getGenericSuperTypes().clear();
			getGenericSuperTypes().addAll(
					(Collection<? extends GenericType>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MetamodelPackage.TYPE__PROPERTIES:
			getProperties().clear();
			return;
		case MetamodelPackage.TYPE__SUPER_TYPES:
			getSuperTypes().clear();
			return;
		case MetamodelPackage.TYPE__TYPE_PARAMETERS:
			getTypeParameters().clear();
			return;
		case MetamodelPackage.TYPE__GENERIC_SUPER_TYPES:
			getGenericSuperTypes().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MetamodelPackage.TYPE__PROPERTIES:
			return properties != null && !properties.isEmpty();
		case MetamodelPackage.TYPE__ABSTRACT:
			return isAbstract() != ABSTRACT_EDEFAULT;
		case MetamodelPackage.TYPE__PRIMITIVE:
			return isPrimitive() != PRIMITIVE_EDEFAULT;
		case MetamodelPackage.TYPE__SUPER_TYPES:
			return superTypes != null && !superTypes.isEmpty();
		case MetamodelPackage.TYPE__TYPE_PARAMETERS:
			return typeParameters != null && !typeParameters.isEmpty();
		case MetamodelPackage.TYPE__GENERIC_SUPER_TYPES:
			return genericSuperTypes != null && !genericSuperTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // TypeImpl
