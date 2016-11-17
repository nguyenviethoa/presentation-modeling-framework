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

package org.eclipse.pmf.generator.egf.xwt.tools;

import java.io.File;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.egf.model.pattern.Pattern;
import org.eclipse.egf.pattern.EGFPatternPlugin;
import org.eclipse.egf.pattern.strategy.domaindriven.AbstractDomainVisitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.pmf.pim.DataField;

/**
 * TODO: improve pattern selection: At present time, the selection is done via
 * type matching. We can imagine a custom matching policy (for example a pattern
 * can apply if and only if the model element is named 'toto')
 * 
 * This is the default implementation. It supports built-in domain kinds.
 * 
 * @author Thomas Guiu
 * 
 */
public class LayoutDomainVisitor extends AbstractDomainVisitor {

	public Object[] getChildren(Object model) {
		// a implementer par les users en fct du model
		Object[] objects = EMPTY_ARRAY;

		if (model instanceof DataField) {
			DataField dataField = (DataField) model;
			objects = dataField.eContents().toArray();
			if ((dataField.getLabel() != null)
					&& (dataField.getControl() != null)
					&& (dataField.getDataBinding() != null)) {
				if ((objects[2].equals(dataField.getLabel()))
						&& (objects[1].equals(dataField.getControl()))) {
					Object tg = objects[1];
					objects[1] = objects[2];
					objects[2] = tg;

				}
			}

			// List<PMFObject> pmfObjects = new ArrayList<PMFObject>();
			//
			// for (Object ob : ((PMFObject) model).eContents().toArray()){
			// if (ob instanceof PMFObject){
			// pmfObjects.add((PMFObject) ob);
			// }
			// }
			// Collections.sort(pmfObjects, new Comparator<PMFObject>(){
			//
			// public int compare(PMFObject o1, PMFObject o2)
			// {
			// return new Integer(o1.getLayoutOrder()).compareTo(new
			// Integer(o2.getLayoutOrder()));
			// }
			// });
			// return pmfObjects.toArray();
		} else if (model instanceof EObject) {
			objects = ((EObject) model).eContents().toArray();
			// return ((EObject) model).eContents().toArray();
		} else if (model instanceof List<?>) {
			objects = ((List<?>) model).toArray();
			// return ((List<?>) model).toArray();
		} else if (model instanceof File) {
			final File[] result = ((File) model).listFiles();
			objects = result;
			if (objects == null)
				objects = EMPTY_ARRAY;
		}

		else if (model instanceof IContainer) {

			try {
				objects = ((IContainer) model).members();
				// return ((IContainer) model).members();
			} catch (CoreException e) {
				EGFPatternPlugin.getDefault().logError(e);
			}
		}

		return objects;
	}

	@Override
	protected List<Pattern> findPatterns(Object model) {
		if (model instanceof EObject) {
			String fullName = EcoreUtil.getURI(((EObject) model).eClass())
					.toString();
			return type2patterns.get(fullName);
		}

		return super.findPatterns(model);
	}
}
