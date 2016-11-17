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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.pmf.emf.EMFDataModelManager;
import org.eclipse.pmf.emf.EMFProperty;
import org.eclipse.pmf.emf.EMFType;
import org.eclipse.pmf.emf.PEMFPackage;
import org.eclipse.pmf.pim.Application;
import org.eclipse.pmf.pim.DataCollection;
import org.eclipse.pmf.pim.DataItem;
import org.eclipse.pmf.pim.data.DataProperty;
import org.eclipse.pmf.pim.data.DataType;
import org.eclipse.pmf.pim.data.impl.DataModelManagerImpl;
import org.eclipse.pmf.pim.exception.PMFException;
import org.eclipse.pmf.pim.util.PMFUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>EMF Data Model Manager</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.pmf.emf.impl.EMFDataModelManagerImpl#getTypeMap <em>Type Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMFDataModelManagerImpl extends DataModelManagerImpl implements
		EMFDataModelManager {
	/**
	 * The cached value of the '{@link #getTypeMap() <em>Type Map</em>}' map.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTypeMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<EClassifier, EMFType> typeMap;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected List<String> classifierNameList=new ArrayList<String>();
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EMFDataModelManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PEMFPackage.Literals.EMF_DATA_MODEL_MANAGER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<EClassifier, EMFType> getTypeMap() {
		if (typeMap == null) {
			typeMap = new EcoreEMap<EClassifier, EMFType>(
					PEMFPackage.Literals.ECLASS_TO_DATA_TYPE_MAP_ENTRY,
					EClassToDataTypeMapEntryImpl.class, this,
					PEMFPackage.EMF_DATA_MODEL_MANAGER__TYPE_MAP);
		}
		return typeMap;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PEMFPackage.EMF_DATA_MODEL_MANAGER__TYPE_MAP:
			return ((InternalEList<?>) getTypeMap())
					.basicRemove(otherEnd, msgs);
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
		case PEMFPackage.EMF_DATA_MODEL_MANAGER__TYPE_MAP:
			if (coreType)
				return getTypeMap();
			else
				return getTypeMap().map();
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
		case PEMFPackage.EMF_DATA_MODEL_MANAGER__TYPE_MAP:
			((EStructuralFeature.Setting) getTypeMap()).set(newValue);
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
		case PEMFPackage.EMF_DATA_MODEL_MANAGER__TYPE_MAP:
			getTypeMap().clear();
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
		case PEMFPackage.EMF_DATA_MODEL_MANAGER__TYPE_MAP:
			return typeMap != null && !typeMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public boolean isTargetFor(EObject type) {
		return (type instanceof EClass || type instanceof EObject);
	}

	@Override
	public DataType getDataModelType(EObject dataType) {
		EClassifier eClass = null;
		if (dataType instanceof EClassifier) {
			eClass = (EClassifier) dataType;
		} else if (dataType instanceof EObject) {
			EObject object = (EObject) dataType;
			eClass = object.eClass();
		} else {
			throw new PMFException("Type unsupported");
		}

		  for(int i=0; i<this.getTypeMap().size();i++){
	        	classifierNameList.add(this.getTypeMap().get(i).getKey().getName());
	         }	
			    if (!classifierNameList.contains(eClass.getName())){ 
				    return PMFUtil.mapEMFType(this, eClass);
	             }	
			    else return null;
	     }

	@Override
	protected DataItem createDataItem(Application application,
			DataProperty property) {
		//Avoid Map support.
		if (property instanceof EMFProperty) {
			EStructuralFeature feature = ((EMFProperty) property).getContent();
			if (FeatureMapUtil.isFeatureMap(feature)
					|| FeatureMapUtil.isFeatureMapEntry(feature.getEType())
					|| Map.Entry.class.getName().equals(
							feature.getEType().getInstanceClassName())) {
				return null;
			}
		}
		DataItem dataItem = super.createDataItem(application, property);
		if (dataItem == null) {
			return null;
		}
		if (property instanceof EMFProperty) {
			EStructuralFeature feature = ((EMFProperty) property).getContent();
			if (dataItem instanceof DataCollection) {
				DataCollection collection = (DataCollection) dataItem;
				collection.setEditable(feature.isChangeable());
				collection.setRemovable(feature.isChangeable());
				collection.setAddNew(feature.isChangeable());
				collection.setReorderable(feature.isOrdered());
			}
			dataItem.setChangeable(feature.isChangeable());
			dataItem.setName(feature.getName());
		}
		return dataItem;
	}

} // EMFDataModelManagerImpl
