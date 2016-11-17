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
package org.eclipse.pmf.pim.data.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.pmf.pim.Application;
import org.eclipse.pmf.pim.DataCollection;
import org.eclipse.pmf.pim.DataForm;
import org.eclipse.pmf.pim.DataFormFolder;
import org.eclipse.pmf.pim.DataItem;
import org.eclipse.pmf.pim.DataReference;
import org.eclipse.pmf.pim.ElementalDataForm;
import org.eclipse.pmf.pim.PMFFactory;
import org.eclipse.pmf.pim.data.DataModelManager;
import org.eclipse.pmf.pim.data.DataPackage;
import org.eclipse.pmf.pim.data.DataProperty;
import org.eclipse.pmf.pim.data.DataType;
import org.eclipse.pmf.pim.databinding.DataBinding;
import org.eclipse.pmf.pim.databinding.DataBindingLeaf;
import org.eclipse.pmf.pim.databinding.DatabindingFactory;
import org.eclipse.pmf.pim.ui.Label;
import org.eclipse.pmf.pim.ui.UiFactory;
import org.eclipse.pmf.pim.util.PMFUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Model Manager</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class DataModelManagerImpl extends EObjectImpl implements
		DataModelManager {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DataModelManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.DATA_MODEL_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTargetFor(EObject type) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDataModelType(EObject type) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void loadFor(ElementalDataForm dataForm, DataType dataType) {
		Application application = (Application) PMFUtil.getApplication(this);
		for (DataProperty property : dataType.getProperties()) {
			if (!(property instanceof DataProperty)) {
				continue;
			}
			if (PMFUtil.hasRootPropertyItem(dataForm, property)) {
				continue;
			}

			DataItem dataItem = createDataItem(application, property);
			if (dataItem == null) {
				continue;
			}

			dataForm.getChildren().add(dataItem);
		}

		for (DataType superType : dataType.getSuperTypes()) {
			DataReference inheritance = PMFFactory.eINSTANCE
					.createDataInheritance();
			inheritance.setDataType(superType);
			DataBinding dataBinding = DatabindingFactory.eINSTANCE
					.createDataBinding();
			inheritance.setDataBinding(dataBinding);
			DataFormFolder dataFormFolder = application.getDataFormFolders()
					.get(superType);
			if (dataFormFolder != null) {
				inheritance.setDataForm(dataFormFolder.getDefaultDataForm());
			}
			dataForm.getChildren().add(inheritance);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void loadFor(DataForm dataForm, DataType dataType) {
		/* Need to be modified
		Application application = (Application) PMFUtil.getApplication(this);
		for (DataProperty property : dataType.getProperties()) {
			if (!(property instanceof DataProperty)) {
				continue;
			}
			if (PMFUtil.hasRootPropertyItem(dataForm, property)) {
				continue;
			}
		
			DataItem dataItem = createDataItem(application, property);
			if (dataItem == null) {
				continue;
			}
		
			dataForm.getChildren().add(dataItem);
		}
		
		for (DataType superType : dataType.getSuperTypes()) {
			DataReference inheritance = PMFFactory.eINSTANCE
					.createDataInheritance();
			inheritance.setDataType(superType);
			DataBinding dataBinding = DatabindingFactory.eINSTANCE
					.createDataBinding();
			inheritance.setDataBinding(dataBinding);
			DataFormFolder dataFormFolder = application.getDataFormFolders()
					.get(superType);
			if (dataFormFolder != null) {
				inheritance.setDataForm(dataFormFolder.getDefaultDataForm());
			}
			dataForm.getChildren().add(inheritance);
		}
		 */
		// for (DataType superType : dataType.getSuperTypes()) {
		// if (superType instanceof DataType) {
		// loadFor(dataForm, (DataType) superType);
		// }
		// }
	}

	protected DataItem createDataItem(Application application,
			DataProperty property) {
		if (application == null || property == null) {
			return null;
		}
		DataType propertType = property.getType();
		DataItem dataItem = null;
		if (!property.isMany()) {
			if (propertType.isPrimitive()) {
				dataItem = PMFFactory.eINSTANCE.createDataField();
			} else {
				DataReference reference = PMFFactory.eINSTANCE
						.createDataAssocication();
				DataFormFolder dataFormFolder = application
						.getDataFormFolders().get(propertType);
				reference.setDataType(propertType);
				reference.setDataForm(dataFormFolder.getDefaultDataForm());
				dataItem = reference;
			}
		} else {
			DataCollection collection = PMFFactory.eINSTANCE
					.createDataCollection();
			collection.setDataContextType(propertType);
			dataItem = collection;
		}

		// create data binding.
		DataBinding dataBinding = DatabindingFactory.eINSTANCE
				.createDataBinding();
		DataBindingLeaf path = DatabindingFactory.eINSTANCE
				.createDataBindingLeaf();
		dataItem.setDataBinding(dataBinding);
		path.setFeature(property);
		dataBinding.setPath(path);
		Label label = UiFactory.eINSTANCE.createLabel();
		label.setText(property.getName());
		label.setName(dataItem.getName() + "_label");
		dataItem.setLabel(label);
		return dataItem;
	}

} // DataModelManagerImpl
