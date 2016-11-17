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
package org.eclipse.pmf.pim.transformation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.pmf.pim.transformation.CodeGenContext;
import org.eclipse.pmf.pim.transformation.ResourceResolver;
import org.eclipse.pmf.pim.transformation.TransformationPackage;
import org.eclipse.pmf.pim.util.UnmodifiableEMap;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code Gen Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.pmf.pim.transformation.impl.CodeGenContextImpl#getResourceResolvers <em>Resource Resolvers</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.transformation.impl.CodeGenContextImpl#getAllValidatorMap <em>All Validator Map</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.transformation.impl.CodeGenContextImpl#getAllDataConverterMap <em>All Data Converter Map</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.transformation.impl.CodeGenContextImpl#getAllCommandMap <em>All Command Map</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.transformation.impl.CodeGenContextImpl#getAllSystemActionMap <em>All System Action Map</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.transformation.impl.CodeGenContextImpl#getAllViewProfileMap <em>All View Profile Map</em>}</li>
 *   <li>{@link org.eclipse.pmf.pim.transformation.impl.CodeGenContextImpl#getAllImageMap <em>All Image Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodeGenContextImpl extends ResourceResolverImpl implements
		CodeGenContext {
	/**
	 * The cached value of the '{@link #getResourceResolvers() <em>Resource Resolvers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceResolvers()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceResolver> resourceResolvers;

	/**
	 * The cached value of the '{@link #getAllValidatorMap() <em>All Validator Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllValidatorMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> allValidatorMap;
	/**
	 * The cached value of the '{@link #getAllDataConverterMap() <em>All Data Converter Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllDataConverterMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> allDataConverterMap;
	/**
	 * The cached value of the '{@link #getAllCommandMap() <em>All Command Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllCommandMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> allCommandMap;
	/**
	 * The cached value of the '{@link #getAllSystemActionMap() <em>All System Action Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllSystemActionMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> allSystemActionMap;

	/**
	 * The cached value of the '{@link #getAllViewProfileMap() <em>All View Profile Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllViewProfileMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> allViewProfileMap;

	/**
	 * The cached value of the '{@link #getAllImageMap() <em>All Image Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllImageMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> allImageMap;

	private EContentAdapter adapter = new EContentAdapter() {
		@Override
		public void notifyChanged(Notification notification) {
			super.notifyChanged(notification);
			if (notification.isTouch()) {
				return;
			}
			Object feature = notification.getFeature();
			if (TransformationPackage.eINSTANCE
					.getResourceResolver_CommandMap() == feature) {
				allCommandMap = null;
			} else if (TransformationPackage.eINSTANCE
					.getResourceResolver_DataConverterMap() == feature) {
				allDataConverterMap = null;
			} else if (TransformationPackage.eINSTANCE
					.getResourceResolver_SystemActionMap() == feature) {
				allSystemActionMap = null;
			} else if (TransformationPackage.eINSTANCE
					.getResourceResolver_ValidatorMap() == feature) {
				allValidatorMap = null;
			} else if (TransformationPackage.eINSTANCE
					.getResourceResolver_ImageMap() == feature) {
				allImageMap = null;
			} else if (TransformationPackage.eINSTANCE
					.getResourceResolver_ViewProfileMap() == feature) {
				allViewProfileMap = null;
			}
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected CodeGenContextImpl() {
		super();
		eAdapters().add(adapter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransformationPackage.Literals.CODE_GEN_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ResourceResolver> getResourceResolvers() {
		if (resourceResolvers == null) {
			resourceResolvers = new EObjectResolvingEList<ResourceResolver>(
					ResourceResolver.class, this,
					TransformationPackage.CODE_GEN_CONTEXT__RESOURCE_RESOLVERS) {

				private static final long serialVersionUID = 8927590077852388681L;

				protected void didChange() {
					super.didChange();
					resetGlobalLists();
				}

				protected void didAdd(int index, ResourceResolver newObject) {
					super.didAdd(index, newObject);
					newObject.eAdapters().add(adapter);
				}

				protected void didRemove(int index, ResourceResolver oldObject) {
					super.didRemove(index, oldObject);
					oldObject.eAdapters().remove(adapter);
				}
			};
		}
		return resourceResolvers;
	}

	private void resetGlobalLists() {
		allCommandMap = null;
		allDataConverterMap = null;
		allSystemActionMap = null;
		allValidatorMap = null;
		allViewProfileMap = null;
		allImageMap = null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EMap<String, String> getAllValidatorMap() {
		if (allValidatorMap == null) {
			allValidatorMap = new EcoreEMap<String, String>(
					EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY,
					EStringToStringMapEntryImpl.class, this,
					TransformationPackage.CODE_GEN_CONTEXT__ALL_VALIDATOR_MAP);
			for (ResourceResolver resolver : getResourceResolvers()) {
				allValidatorMap.putAll(resolver.getValidatorMap());
			}
			allValidatorMap.putAll(this.getValidatorMap());
			allValidatorMap = new UnmodifiableEMap<String, String>(
					EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY,
					EStringToStringMapEntryImpl.class, allValidatorMap, this,
					TransformationPackage.eINSTANCE
							.getCodeGenContext_AllValidatorMap());
		}
		return allValidatorMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EMap<String, String> getAllDataConverterMap() {
		if (allDataConverterMap == null) {
			allDataConverterMap = new EcoreEMap<String, String>(
					EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY,
					EStringToStringMapEntryImpl.class,
					this,
					TransformationPackage.CODE_GEN_CONTEXT__ALL_DATA_CONVERTER_MAP);
			for (ResourceResolver resolver : getResourceResolvers()) {
				allDataConverterMap.putAll(resolver.getDataConverterMap());
			}
			allDataConverterMap.putAll(this.getDataConverterMap());
			allDataConverterMap = new UnmodifiableEMap<String, String>(
					EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY,
					EStringToStringMapEntryImpl.class, allDataConverterMap,
					this,
					TransformationPackage.eINSTANCE
							.getCodeGenContext_AllDataConverterMap());
		}
		return allDataConverterMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EMap<String, String> getAllCommandMap() {
		if (allCommandMap == null) {
			allCommandMap = new EcoreEMap<String, String>(
					EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY,
					EStringToStringMapEntryImpl.class, this,
					TransformationPackage.CODE_GEN_CONTEXT__ALL_COMMAND_MAP);
			for (ResourceResolver resolver : getResourceResolvers()) {
				allCommandMap.putAll(resolver.getCommandMap());
			}
			allCommandMap.putAll(this.getCommandMap());
			allCommandMap = new UnmodifiableEMap<String, String>(
					EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY,
					EStringToStringMapEntryImpl.class, allCommandMap, this,
					TransformationPackage.eINSTANCE
							.getCodeGenContext_AllCommandMap());
		}
		return allCommandMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EMap<String, String> getAllSystemActionMap() {
		if (allSystemActionMap == null) {
			allSystemActionMap = new EcoreEMap<String, String>(
					EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY,
					EStringToStringMapEntryImpl.class,
					this,
					TransformationPackage.CODE_GEN_CONTEXT__ALL_SYSTEM_ACTION_MAP);
			for (ResourceResolver resolver : getResourceResolvers()) {
				allSystemActionMap.putAll(resolver.getSystemActionMap());
			}
			allSystemActionMap.putAll(this.getSystemActionMap());
			allSystemActionMap = new UnmodifiableEMap<String, String>(
					EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY,
					EStringToStringMapEntryImpl.class, allSystemActionMap,
					this,
					TransformationPackage.eINSTANCE
							.getCodeGenContext_AllSystemActionMap());
		}
		return allSystemActionMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EMap<String, String> getAllViewProfileMap() {
		if (allViewProfileMap == null) {
			allViewProfileMap = new EcoreEMap<String, String>(
					EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY,
					EStringToStringMapEntryImpl.class,
					this,
					TransformationPackage.CODE_GEN_CONTEXT__ALL_VIEW_PROFILE_MAP);
			for (ResourceResolver resolver : getResourceResolvers()) {
				allViewProfileMap.putAll(resolver.getViewProfileMap());
			}
			allViewProfileMap.putAll(this.getViewProfileMap());
			allViewProfileMap = new UnmodifiableEMap<String, String>(
					EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY,
					EStringToStringMapEntryImpl.class, allViewProfileMap, this,
					TransformationPackage.eINSTANCE
							.getCodeGenContext_AllViewProfileMap());
		}
		return allViewProfileMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EMap<String, String> getAllImageMap() {
		if (allImageMap == null) {
			allImageMap = new EcoreEMap<String, String>(
					EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY,
					EStringToStringMapEntryImpl.class, this,
					TransformationPackage.CODE_GEN_CONTEXT__ALL_IMAGE_MAP);
			for (ResourceResolver resolver : getResourceResolvers()) {
				allImageMap.putAll(resolver.getImageMap());
			}
			allImageMap.putAll(this.getImageMap());
			allImageMap = new UnmodifiableEMap<String, String>(
					EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY,
					EStringToStringMapEntryImpl.class, allImageMap, this,
					TransformationPackage.eINSTANCE
							.getCodeGenContext_AllImageMap());
		}
		return allImageMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getDataConverter(String key) {
		return getAllDataConverterMap().get(key);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getValidator(String key) {
		return getAllValidatorMap().get(key);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getCommand(String key) {
		return getAllCommandMap().get(key);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getSystemAction(String key) {
		return getAllSystemActionMap().get(key);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getViewProfile(String key) {
		return getAllViewProfileMap().get(key);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getImage(String key) {
		return getAllImageMap().get(key);
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
		case TransformationPackage.CODE_GEN_CONTEXT__ALL_VALIDATOR_MAP:
			return ((InternalEList<?>) getAllValidatorMap()).basicRemove(
					otherEnd, msgs);
		case TransformationPackage.CODE_GEN_CONTEXT__ALL_DATA_CONVERTER_MAP:
			return ((InternalEList<?>) getAllDataConverterMap()).basicRemove(
					otherEnd, msgs);
		case TransformationPackage.CODE_GEN_CONTEXT__ALL_COMMAND_MAP:
			return ((InternalEList<?>) getAllCommandMap()).basicRemove(
					otherEnd, msgs);
		case TransformationPackage.CODE_GEN_CONTEXT__ALL_SYSTEM_ACTION_MAP:
			return ((InternalEList<?>) getAllSystemActionMap()).basicRemove(
					otherEnd, msgs);
		case TransformationPackage.CODE_GEN_CONTEXT__ALL_VIEW_PROFILE_MAP:
			return ((InternalEList<?>) getAllViewProfileMap()).basicRemove(
					otherEnd, msgs);
		case TransformationPackage.CODE_GEN_CONTEXT__ALL_IMAGE_MAP:
			return ((InternalEList<?>) getAllImageMap()).basicRemove(otherEnd,
					msgs);
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
		case TransformationPackage.CODE_GEN_CONTEXT__RESOURCE_RESOLVERS:
			return getResourceResolvers();
		case TransformationPackage.CODE_GEN_CONTEXT__ALL_VALIDATOR_MAP:
			if (coreType)
				return getAllValidatorMap();
			else
				return getAllValidatorMap().map();
		case TransformationPackage.CODE_GEN_CONTEXT__ALL_DATA_CONVERTER_MAP:
			if (coreType)
				return getAllDataConverterMap();
			else
				return getAllDataConverterMap().map();
		case TransformationPackage.CODE_GEN_CONTEXT__ALL_COMMAND_MAP:
			if (coreType)
				return getAllCommandMap();
			else
				return getAllCommandMap().map();
		case TransformationPackage.CODE_GEN_CONTEXT__ALL_SYSTEM_ACTION_MAP:
			if (coreType)
				return getAllSystemActionMap();
			else
				return getAllSystemActionMap().map();
		case TransformationPackage.CODE_GEN_CONTEXT__ALL_VIEW_PROFILE_MAP:
			if (coreType)
				return getAllViewProfileMap();
			else
				return getAllViewProfileMap().map();
		case TransformationPackage.CODE_GEN_CONTEXT__ALL_IMAGE_MAP:
			if (coreType)
				return getAllImageMap();
			else
				return getAllImageMap().map();
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
		case TransformationPackage.CODE_GEN_CONTEXT__RESOURCE_RESOLVERS:
			getResourceResolvers().clear();
			getResourceResolvers().addAll(
					(Collection<? extends ResourceResolver>) newValue);
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
		case TransformationPackage.CODE_GEN_CONTEXT__RESOURCE_RESOLVERS:
			getResourceResolvers().clear();
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
		case TransformationPackage.CODE_GEN_CONTEXT__RESOURCE_RESOLVERS:
			return resourceResolvers != null && !resourceResolvers.isEmpty();
		case TransformationPackage.CODE_GEN_CONTEXT__ALL_VALIDATOR_MAP:
			return allValidatorMap != null && !allValidatorMap.isEmpty();
		case TransformationPackage.CODE_GEN_CONTEXT__ALL_DATA_CONVERTER_MAP:
			return allDataConverterMap != null
					&& !allDataConverterMap.isEmpty();
		case TransformationPackage.CODE_GEN_CONTEXT__ALL_COMMAND_MAP:
			return allCommandMap != null && !allCommandMap.isEmpty();
		case TransformationPackage.CODE_GEN_CONTEXT__ALL_SYSTEM_ACTION_MAP:
			return allSystemActionMap != null && !allSystemActionMap.isEmpty();
		case TransformationPackage.CODE_GEN_CONTEXT__ALL_VIEW_PROFILE_MAP:
			return allViewProfileMap != null && !allViewProfileMap.isEmpty();
		case TransformationPackage.CODE_GEN_CONTEXT__ALL_IMAGE_MAP:
			return allImageMap != null && !allImageMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CodeGenContextImpl
