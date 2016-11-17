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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.pmf.pim.transformation.CodeGenContext;
import org.eclipse.pmf.pim.transformation.Context;
import org.eclipse.pmf.pim.transformation.ResourceResolver;
import org.eclipse.pmf.pim.transformation.TransformationFactory;
import org.eclipse.pmf.pim.transformation.TransformationPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class TransformationFactoryImpl extends EFactoryImpl implements
		TransformationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static TransformationFactory init() {
		try {
			TransformationFactory theTransformationFactory = (TransformationFactory) EPackage.Registry.INSTANCE
					.getEFactory(TransformationPackage.eNS_URI);
			if (theTransformationFactory != null) {
				return theTransformationFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TransformationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public TransformationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case TransformationPackage.CONTEXT:
			return createContext();
		case TransformationPackage.RESOURCE_RESOLVER:
			return createResourceResolver();
		case TransformationPackage.CODE_GEN_CONTEXT:
			return createCodeGenContext();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceResolver createResourceResolver() {
		ResourceResolverImpl resourceResolver = new ResourceResolverImpl();
		return resourceResolver;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CodeGenContext createCodeGenContext() {
		CodeGenContextImpl codeGenContext = new CodeGenContextImpl();
		return codeGenContext;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationPackage getTransformationPackage() {
		return (TransformationPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TransformationPackage getPackage() {
		return TransformationPackage.eINSTANCE;
	}

} // TransformationFactoryImpl
