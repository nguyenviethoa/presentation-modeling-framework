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
package org.eclipse.pmf.pim.util;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.pmf.emf.EMFDataModelManager;
import org.eclipse.pmf.emf.EMFProperty;
import org.eclipse.pmf.emf.EMFType;
import org.eclipse.pmf.emf.PEMFFactory;
import org.eclipse.pmf.pim.Application;
import org.eclipse.pmf.pim.DataElement;
import org.eclipse.pmf.pim.DataForm;
import org.eclipse.pmf.pim.DataFormFolder;
import org.eclipse.pmf.pim.DataInheritance;
import org.eclipse.pmf.pim.ElementalDataForm;
import org.eclipse.pmf.pim.Library;
import org.eclipse.pmf.pim.PMFFactory;
import org.eclipse.pmf.pim.PMFPackage;
import org.eclipse.pmf.pim.data.DataFactory;
import org.eclipse.pmf.pim.data.DataModelManager;
import org.eclipse.pmf.pim.data.DataProperty;
import org.eclipse.pmf.pim.data.DataType;
import org.eclipse.pmf.pim.data.GenericType;
import org.eclipse.pmf.pim.data.TypeParameter;
import org.eclipse.pmf.pim.databinding.DataBinding;
import org.eclipse.pmf.pim.databinding.DataBindingPath;

/**
 * 
 * @author yyang
 */
public class PMFUtil {
	public static Resource createLibraryResource(IFile modelFile, String name,
			String econding, IProgressMonitor progressMonitor)
			throws IOException {
		EClass eClass = (EClass) PMFPackage.eINSTANCE.getLibrary();
		Library rootObject = (Library) PMFFactory.eINSTANCE.create(eClass);
		rootObject.setName(name);
		return createResource(modelFile, rootObject, econding, progressMonitor);
	}

	public static Resource createApplicationResource(IFile modelFile,
			String name, String econding, IProgressMonitor progressMonitor)
			throws IOException {
		EClass eClass = (EClass) PMFPackage.eINSTANCE.getApplication();
		Application rootObject = (Application) PMFFactory.eINSTANCE
				.create(eClass);
		rootObject.setName(name);
		return createResource(modelFile, rootObject, econding, progressMonitor);
	}

	public static Resource createResource(IFile modelFile, EObject rootObject,
			String econding, IProgressMonitor progressMonitor)
			throws IOException {
		try {
			// Create a resource set
			//
			ResourceSet resourceSet = new ResourceSetImpl();

			// Get the URI of the model file.
			//
			URI fileURI = URI.createPlatformResourceURI(modelFile.getFullPath()
					.toString(), true);

			// Create a resource for this file.
			//
			Resource resource = resourceSet.createResource(fileURI);

			// Add the initial model object to the contents.
			//
			resource.getContents().add(rootObject);

			// Save the contents of the resource to the file system.
			//
			Map<Object, Object> options = new HashMap<Object, Object>();
			options.put(XMLResource.OPTION_ENCODING, econding);
			resource.save(options);
			return resource;
		} finally {
			if (progressMonitor != null) {
				progressMonitor.done();
			}
		}
	}

	public static DataForm getResolvedDataForm(DataInheritance dataInheritance) {
		DataForm dataForm = dataInheritance.getDataForm();
		if (dataForm == null) {
			Application application = PMFUtil.getApplication(dataInheritance);
			if (application != null) {
				DataFormFolder folder = application.getDataFormFolders().get(
						dataInheritance.getDataType());
				if (folder != null) {
					dataForm = folder.getDefaultDataForm();
				}
			}
		}
		return dataForm;
	}

	public static Collection<DataForm> getAllPossibleDataForms(DataType dataType) {
		Application application = PMFUtil.getApplication(dataType);
		if (application != null) {
			DataFormFolder folder = application.getDataFormFolders().get(
					dataType);
			return folder.getDataForms();
		}
		return Collections.EMPTY_LIST;
	}

	public static EMFType mapEMFType(EMFDataModelManager dataModelManager,
			EClassifier classifier) {
		EMap<EClassifier, EMFType> map = dataModelManager.getTypeMap();
		EMFType type = map.get(classifier);
		if (type != null) {
			return type;
		}

		type = PEMFFactory.eINSTANCE.createEMFType();
		type.setContent(classifier);
		type.setName(classifier.getName());
		if (classifier.getInstanceClass() != null) {
			type.setId(classifier.getInstanceClass().getName());
		}
		map.put(classifier, type);

		if (classifier instanceof EEnum){
			type.setEnum(true);
		}
		if (classifier instanceof EClass) {
			EClass eClass = (EClass) classifier;
			for (EClass superType : eClass.getESuperTypes()) {
				EMFType emfType = mapEMFType(dataModelManager, superType);
				if (emfType != null) {
					type.getSuperTypes().add(emfType);
				}
			}

			HashMap<ETypeParameter, TypeParameter> typeParameterMap = new HashMap<ETypeParameter, TypeParameter>();
			for (ETypeParameter parameter : eClass.getETypeParameters()) {
				TypeParameter typeParameter = mapEMFTypeParameter(
						dataModelManager, typeParameterMap, parameter);
				type.getTypeParameters().add(typeParameter);
				typeParameterMap.put(parameter, typeParameter);
			}

			for (EGenericType emfGenericType : eClass.getEGenericSuperTypes()) {
				GenericType pmfGenericType = mapEMFGenericType(
						dataModelManager, typeParameterMap, emfGenericType);
				type.getGenericSuperTypes().add(pmfGenericType);
			}

			for (EStructuralFeature structuralFeature : eClass
					.getEStructuralFeatures()) {
				EMFProperty emfProperty = PEMFFactory.eINSTANCE
						.createEMFProperty();
				emfProperty.setName(structuralFeature.getName());
				emfProperty.setContent(structuralFeature);
				type.getProperties().add(emfProperty);
				EClassifier featureType = structuralFeature.getEType();
				EMFType emfType = mapEMFType(dataModelManager, featureType);
				emfProperty.setType(emfType);

				EGenericType emfGenericType = structuralFeature
						.getEGenericType();
				if (emfGenericType != null) {
					GenericType lowerBound = mapEMFGenericType(
							dataModelManager, typeParameterMap, emfGenericType);
					emfProperty.setGenericType(lowerBound);
				}
			}

		}
		return type;
	}

	public static TypeParameter mapEMFTypeParameter(
			EMFDataModelManager dataModelManager,
			HashMap<ETypeParameter, TypeParameter> typeParameterMap,
			ETypeParameter parameter) {
		String name = parameter.getName();
		TypeParameter typeParameter = DataFactory.eINSTANCE
				.createTypeParameter();
		typeParameter.setName(name);

		for (EGenericType emfGenericType : parameter.getEBounds()) {
			GenericType pmfGenericType = mapEMFGenericType(dataModelManager,
					typeParameterMap, emfGenericType);
			typeParameter.getBounds().add(pmfGenericType);
		}
		return typeParameter;
	}

	public static GenericType mapEMFGenericType(
			EMFDataModelManager dataModelManager,
			HashMap<ETypeParameter, TypeParameter> typeParameterMap,
			EGenericType genericType) {
		GenericType pmfGenericType = DataFactory.eINSTANCE.createGenericType();

		EClassifier eClassifier = genericType.getEClassifier();
		if (eClassifier != null) {
			pmfGenericType.setType(mapEMFType(dataModelManager, eClassifier));
		}

		// upper bound
		EGenericType emfUpperBound = genericType.getEUpperBound();
		if (emfUpperBound != null) {
			GenericType upperBound = mapEMFGenericType(dataModelManager,
					typeParameterMap, emfUpperBound);
			pmfGenericType.setUpperBound(upperBound);
		}

		// lower bound
		EGenericType emfLowerBound = genericType.getELowerBound();
		if (emfLowerBound != null) {
			GenericType lowerBound = mapEMFGenericType(dataModelManager,
					typeParameterMap, emfLowerBound);
			pmfGenericType.setLowerBound(lowerBound);
		}

		ETypeParameter parameter = genericType.getETypeParameter();
		if (parameter != null) {
			TypeParameter typeParameter = typeParameterMap.get(parameter);
			pmfGenericType.setTypeParameter(typeParameter);
		}

		for (EGenericType emfGenericType : genericType.getETypeArguments()) {
			GenericType pmfArgumentGenericType = mapEMFGenericType(
					dataModelManager, typeParameterMap, emfGenericType);
			pmfGenericType.getTypeArguments().add(pmfArgumentGenericType);
		}

		return pmfGenericType;
	}

	public static void applicationInitialize(Application application) {
		EMFDataModelManager dataModelManager = dataModelManager(application);
		// mapEMFType(dataModelManager,
		// PMFPackage.eINSTANCE.getBindingContext());
	}

	public static EMFDataModelManager dataModelManager(Application application) {
		EMFDataModelManager dataModelManager = null;
		for (DataModelManager manager : application.getDataModelManagers()) {
			if (manager.isTargetFor(EcorePackage.eINSTANCE.getEClass())
					&& manager instanceof EMFDataModelManager) {
				dataModelManager = (EMFDataModelManager) manager;
				break;
			}
		}
		if (dataModelManager == null) {
			dataModelManager = PEMFFactory.eINSTANCE
					.createEMFDataModelManager();
			application.getDataModelManagers().add(dataModelManager);
		}
		return dataModelManager;
	}

	// public static System getSystem(EObject pmfObject) {
	// Application application = getApplication(pmfObject);
	// return application.getSystem();
	// }

	public static Application getApplication(EObject context) {
		EObject current = context;
		while (current != null && !(current instanceof Application)) {
			current = current.eContainer();
		}
		if (current == null) {
			return getApplication(context.eResource());
		}
		return (Application) current;
	}

	public static Application getApplication(Resource resource) {
		if (resource != null) {
			for (TreeIterator<EObject> iterator = resource.getAllContents(); iterator
					.hasNext();) {
				EObject element = iterator.next();
				if (element instanceof Application) {
					return (Application) element;
				}
			}
		}
		return null;
	}

	public static boolean hasRootPropertyItem(ElementalDataForm dataForm,
			DataProperty property) {
		for (DataElement dataElement : dataForm.getChildren()) {
			DataBinding dataBinding = dataElement.getDataBinding();
			DataBindingPath bindingPath = dataBinding.getPath();
			if (bindingPath.getFeature() == property) {
				return true;
			}
		}
		return false;
	}
}
