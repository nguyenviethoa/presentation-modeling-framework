package org.eclipse.pmf.pim.generation;

import org.eclipse.pmf.pim.data.DataProperty;
import org.eclipse.pmf.pim.data.DataType;
import org.eclipse.pmf.pim.databinding.DataBinding;
import org.eclipse.pmf.pim.databinding.DataBindingNode;
import org.eclipse.pmf.pim.databinding.DataBindingPath;

public class PMFUtil {

	// public static FactoryNames getFactoryNames(UIObject object) {
	// DataElement dataElement = (DataElement) findAncestor(object,
	// PMFPackage.eINSTANCE.getDataElement());
	// if (dataElement == null) {
	// throw new IllegalStateException("Not DataElement.");
	// }
	// EClassifier classifier = dataElement.getResolvedTargetContextType();
	// if (classifier == null) {
	// throw new IllegalStateException("Data type missing.");
	// }
	//
	// Application application = (Application) findAncestor(object,
	// PMFPackage.eINSTANCE.getApplication());
	// GenModel genModel = application.getGenModel();
	// EPackage ePackage = (EPackage) findAncestor(classifier,
	// EcorePackage.eINSTANCE.getEPackage());
	// GenPackage genPackage = genModel.findGenPackage(ePackage);
	//
	// return new FactoryNames(genPackage.getInterfacePackageName() + "."
	// + genPackage.getFactoryInterfaceName(), genPackage
	// .getFactoryInstanceName());
	// }
	//
	// public static EClassifier getHostClassifier(UIObject object) {
	// View type = (View) PMFUtil.findAncestor(object,
	// org.eclipse.pmf.PMFPackage.eINSTANCE.getView());
	// return type.getContent().getDataContextType();
	// }
	//
	// public static View findEditor(UIObject object, EClassifier target) {
	// if (object instanceof Collection) {
	// Collection collection = (Collection) object;
	// View editor = collection.getEditor();
	// if (editor != null) {
	// return editor;
	// }
	// }
	//
	// int level = Integer.MAX_VALUE;
	// View candidate = null;
	// for (TreeIterator<EObject> iterator = object.eResource()
	// .getAllContents(); iterator.hasNext();) {
	// Object element = iterator.next();
	// if (element instanceof View) {
	// View type = (View) element;
	// EClassifier classifier = type.getContent().getDataContextType();
	// int localLevel = EMFUtil
	// .getInheritanceLevel(classifier, target);
	// if (localLevel == 0) {
	// return type;
	// }
	// if (localLevel < level) {
	// candidate = type;
	// }
	// }
	// }
	// return candidate;
	// }
	//
	// public static String getHostClassName(UIObject object) {
	// View type = (View) PMFUtil.findAncestor(object,
	// org.eclipse.pmf.PMFPackage.eINSTANCE.getView());
	// EClassifier classifier = type.getContent().getDataContextType();
	// if (!(classifier instanceof EClass)) {
	// throw new IllegalStateException("Not EClass.");
	// }
	// return getClassName(object, classifier);
	// }
	//
	// public static String getTargetClassName(UIObject object) {
	// DataElement dataElement = (DataElement) findAncestor(object,
	// PMFPackage.eINSTANCE.getDataElement());
	// if (dataElement == null) {
	// throw new IllegalStateException("Not DataElement.");
	// }
	// EClassifier classifier = dataElement.getResolvedTargetContextType();
	// if (!(classifier instanceof EClass)) {
	// throw new IllegalStateException("Not EClass.");
	// }
	// return getClassName(object, (EClass) classifier);
	// }
	//
	// public static String capName(String name) {
	// if (name == null) {
	// return "";
	// }
	// if (name.length() <= 1) {
	// return name;
	// }
	// char first = name.charAt(0);
	// if (Character.isUpperCase(first)) {
	// return name;
	// }
	// return Character.toUpperCase(first) + name.substring(1);
	// }
	//
	// public static String variableName(String name) {
	// if (name == null) {
	// return "";
	// }
	// if (name.length() <= 1) {
	// return name;
	// }
	// char first = name.charAt(0);
	// if (Character.isLowerCase(first)) {
	// return name;
	// }
	// return Character.toLowerCase(first) + name.substring(1);
	// }
	//
	// public static String getClassName(UIObject object, EClassifier type) {
	// Application presentation = (Application) findAncestor(object,
	// PMFPackage.eINSTANCE.getApplication());
	// GenModel genModel = presentation.getGenModel();
	// GenClassifier genClassifier = genModel.findGenClassifier(type);
	// if (genClassifier instanceof GenClass) {
	// GenClass genClass = (GenClass) genClassifier;
	// return genClass.getQualifiedInterfaceName();
	// } else if (genClassifier instanceof GenEnum) {
	// GenEnum genClass = (GenEnum) genClassifier;
	// return genClass.getQualifiedName();
	// }
	// throw new IllegalStateException("Not EClass or EEnum.");
	// }
	//
	// public static String getSetterName(UIObject object,
	// EStructuralFeature feature) {
	// Application presentation = (Application) findAncestor(object,
	// PMFPackage.eINSTANCE.getApplication());
	// GenModel genModel = presentation.getGenModel();
	//
	// GenClassifier genClassifier = genModel
	// .findGenClassifier((EClassifier) feature.eContainer());
	// if (genClassifier instanceof GenClass) {
	// GenClass genClass = (GenClass) genClassifier;
	// for (GenFeature genFeature : genClass.getAllGenFeatures()) {
	// if (genFeature.getEcoreFeature() == feature) {
	// return "set" + genFeature.getAccessorName();
	// }
	// }
	// }
	// return capName(feature.getName());
	// }
	//
	// public static String getGetterName(UIObject object,
	// EStructuralFeature feature) {
	// Application presentation = (Application) findAncestor(object,
	// PMFPackage.eINSTANCE.getApplication());
	// GenModel genModel = presentation.getGenModel();
	//
	// GenClassifier genClassifier = genModel
	// .findGenClassifier((EClassifier) feature.eContainer());
	// if (genClassifier instanceof GenClass) {
	// GenClass genClass = (GenClass) genClassifier;
	// for (GenFeature genFeature : genClass.getAllGenFeatures()) {
	// if (genFeature.getEcoreFeature() == feature) {
	// if (feature.getEType() == EcorePackage.eINSTANCE
	// .getEBoolean()) {
	// return "is" + genFeature.getAccessorName();
	// }
	// return "get" + genFeature.getAccessorName();
	// }
	// }
	// }
	// return capName(feature.getName());
	// }
	//
	// public static Object findAncestor(EObject object, EClass type) {
	// EObject current = object;
	// while (current != null) {
	// if (current instanceof View) {
	// View viewType = (View) current;
	// Group group = viewType.getContent();
	// if (type.isInstance(group)) {
	// return group;
	// }
	// }
	// if (type.isInstance(current)) {
	// return current;
	// }
	// current = current.eContainer();
	// }
	// return null;
	// }
	//
	// public static String getDataBindingPath(DataElement dataElement) {
	// StringBuffer buffer = new StringBuffer();
	// BindingPath current = dataElement.getBindingPath();
	// while (current != null) {
	// if (buffer.length() != 0) {
	// buffer.append(".");
	// }
	// buffer.append(current.getFeature().getName());
	// current = current.getNext();
	// }
	// return buffer.toString();
	// }

	public static DataType getResolvedContextType(DataType type,
			DataBinding dataBinding) {
		DataBindingPath node = dataBinding.getPath();
		DataType classifier = type;
		while (node != null) {
			DataProperty structuralFeature = node.getFeature();
			if (structuralFeature == null) {
				return null;
			}
			classifier = structuralFeature.getType();
			if (node instanceof DataBindingNode) {
				DataBindingNode bindingStep = (DataBindingNode) node;
				node = bindingStep.getNext();
			} else {
				break;
			}
		}
		return classifier;
	}

	public static DataType getResolvedContextDataType(DataType dataType,
			DataBinding dataBinding) {
		DataBindingPath node = dataBinding.getPath();
		DataType target = dataType;
		while (node != null) {
			DataProperty structuralFeature = node.getFeature();
			if (structuralFeature == null) {
				return null;
			}
			DataType propertyType = structuralFeature.getType();
			if (propertyType instanceof DataType) {
				target = (DataType) propertyType;
			}
			if (node instanceof DataBindingNode) {
				DataBindingNode bindingStep = (DataBindingNode) node;
				node = bindingStep.getNext();
			} else {
				break;
			}
		}
		return target;
	}
}
