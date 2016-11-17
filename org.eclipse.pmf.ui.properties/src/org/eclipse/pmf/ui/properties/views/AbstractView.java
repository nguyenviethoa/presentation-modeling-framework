/******************************************************************************* 
 * Copyright (c) 2006, 2016 Soyatec (http://www.soyatec.com) and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Soyatec - initial API and implementation 
 *******************************************************************************/

package org.eclipse.pmf.ui.properties.views;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.AbstractOverrideableCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.MoveCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.xwt.XWT;

public class AbstractView extends Composite {

	public AbstractView(Composite parent, int style) {
		super(parent, style);
	}

	protected EditingDomain getEditingDomain(EObject owner) {
		return AdapterFactoryEditingDomain.getEditingDomainFor(owner);
	}

	protected void performAddEvent(String featureName) {
		Object dataContext = XWT.getDataContext(this);
		if (dataContext instanceof EObject) {
			EObject eObj = (EObject) dataContext;
			EStructuralFeature sf = eObj.eClass().getEStructuralFeature(
					featureName);

			if (sf != null && sf.isMany() && sf.isChangeable()) {
				EClassifier eType = sf.getEType();
				if (eType instanceof EClass
						&& !(((EClass) eType).isAbstract() || ((EClass) eType)
								.isInterface())) {
					EObject newObject = eType.getEPackage()
							.getEFactoryInstance().create((EClass) eType);
					boolean hasResource = true;
					if (!((EReference) sf).isContainment()) {
						// hasResource = doAddResource(eObj.eResource(),
						// newObject);
						final Collection<?> choiceOfValues = getChoiceOfValues(
								eObj, eType);
						FeatureEditorDialog dialog = new FeatureEditorDialog(
								getDisplay().getActiveShell(),
								new LabelProvider(), eObj, eType,
								new ArrayList<Object>(), Display.getAppName(),
								new ArrayList<Object>(choiceOfValues), false,
								true, true);
						dialog.open();
						doAdd(eObj, sf, dialog.getResult());
					} else if (hasResource) {
						doAdd(eObj, sf,
								(EList<?>) Collections.singletonList(newObject));
					}
				}
			}
		}
	}

	private Collection<?> getChoiceOfValues(EObject eObj, EClassifier type) {
		return ItemPropertyDescriptor.getReachableObjectsOfType(eObj, type);
	}

	protected boolean doAddResource(Resource resource, EObject newObject) {
		// TODO: find the eContainer and perform add.
		return false;
	}

	protected boolean doAdd(EObject owner, EStructuralFeature feature,
			EList<?> newChild) {
		if (owner == null || feature == null || newChild == null) {
			return false;
		}
		EditingDomain editingDomain = getEditingDomain(owner);
		if (editingDomain != null) {
			Command command = AddCommand.create(editingDomain, owner, feature,
					newChild);
			if (command != null && command.canExecute()) {
				CommandStack commandStack = editingDomain.getCommandStack();
				if (commandStack != null) {
					commandStack.execute(command);
				} else {
					command.execute();
				}
				return true;
			}
		} else {
			EList<Object> ownerList = AddCommand.getOwnerList(owner, feature);
			if (ownerList != null) {
				return ownerList.add(newChild);
			}
		}
		return false;
	}

	protected void performRemoveEvent(String featureName) {
		org.eclipse.jface.viewers.Viewer viewer = (org.eclipse.jface.viewers.Viewer) XWT
				.findElementByName(this, featureName + "Viewer");
		if (viewer == null) {
			return;
		}
		ISelection selection = viewer.getSelection();
		if (selection.isEmpty()) {
			return;
		}
		Object element = ((IStructuredSelection) selection).getFirstElement();
		if (element == null) {
			return;
		}
		Object dataContext = XWT.getDataContext(this);
		if (dataContext instanceof EObject) {
			EObject eObj = (EObject) dataContext;
			EStructuralFeature sf = eObj.eClass().getEStructuralFeature(
					featureName);
			if (sf != null && sf.isMany() && sf.isChangeable()) {
				doRemove(eObj, sf, element);
			}
		}

	}

	protected boolean doRemove(EObject owner, EStructuralFeature feature,
			Object element) {
		if (owner == null || feature == null || element == null) {
			return false;
		}
		EditingDomain domain = getEditingDomain(owner);
		if (domain != null) {
			Command command = RemoveCommand.create(domain, owner, feature,
					element);
			if (command != null && command.canExecute()) {
				CommandStack commandStack = domain.getCommandStack();
				if (commandStack != null) {
					commandStack.execute(command);
				} else {
					command.execute();
				}
				return true;
			}
		} else {
			EList<Object> ownerList = RemoveCommand
					.getOwnerList(owner, feature);
			if (ownerList != null) {
				return ownerList.remove(element);
			}
		}
		return false;
	}

	protected void performMoveUpEvent(String featureName) {
		org.eclipse.jface.viewers.Viewer viewer = (org.eclipse.jface.viewers.Viewer) XWT
				.findElementByName(this, featureName + "Viewer");
		if (viewer == null) {
			return;
		}
		ISelection selection = viewer.getSelection();
		if (selection.isEmpty()) {
			return;
		}
		Object element = ((IStructuredSelection) selection).getFirstElement();
		if (element == null) {
			return;
		}
		Object dataContext = XWT.getDataContext(this);
		if (dataContext instanceof EObject) {
			EObject eObj = (EObject) dataContext;
			EStructuralFeature sf = eObj.eClass().getEStructuralFeature(
					featureName);
			EList<Object> ownerList = AbstractOverrideableCommand.getOwnerList(
					eObj, sf);
			if (ownerList == null || !ownerList.contains(element)) {
				return;
			}
			int index = ownerList.indexOf(element);
			if (index >= 1) {
				doMove(eObj, sf, element, index - 1);
			}
		}
	}

	protected boolean doMove(EObject owner, EStructuralFeature feature,
			Object value, int index) {
		if (owner == null || feature == null || value == null) {
			return false;
		}
		EditingDomain domain = getEditingDomain(owner);
		if (domain != null) {
			Command command = MoveCommand.create(domain, owner, feature, value,
					index);
			if (command != null && command.canExecute()) {
				CommandStack commandStack = domain.getCommandStack();
				if (commandStack != null) {
					commandStack.execute(command);
				} else {
					command.execute();
				}
				return true;
			}
		} else {
			EList<Object> ownerList = AbstractOverrideableCommand.getOwnerList(
					owner, feature);
			if (ownerList != null && index >= 0 && index < ownerList.size()) {
				ownerList.move(index, value);
				return true;
			}
		}
		return false;
	}

	protected void performMoveDownEvent(String featureName) {
		org.eclipse.jface.viewers.Viewer viewer = (org.eclipse.jface.viewers.Viewer) XWT
				.findElementByName(this, featureName + "Viewer");
		if (viewer == null) {
			return;
		}
		ISelection selection = viewer.getSelection();
		if (selection.isEmpty()) {
			return;
		}
		Object element = ((IStructuredSelection) selection).getFirstElement();
		if (element == null) {
			return;
		}
		Object dataContext = XWT.getDataContext(this);
		if (dataContext instanceof EObject) {
			EObject eObj = (EObject) dataContext;
			EStructuralFeature sf = eObj.eClass().getEStructuralFeature(
					featureName);
			EList<Object> ownerList = AbstractOverrideableCommand.getOwnerList(
					eObj, sf);
			if (ownerList == null || !ownerList.contains(element)) {
				return;
			}
			int index = ownerList.indexOf(element);
			if (index < (ownerList.size() - 1)) {
				doMove(eObj, sf, element, index + 1);
			}
		}
	}
}
