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

package org.eclipse.pmf.model.checkrules.manager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.validation.marker.MarkerUtil;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.service.ConstraintRegistry;
import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.emf.validation.service.ModelValidationService;

public class CheckRuleManager implements RuleManager {

	private List<String> constraints;

	private String namespaceUri;

	Resource resource;

	static Logger log = Logger.getLogger(CheckRuleManager.class.getName());

	/**
	 * The constructor of the CheckRuleManager with the id parameter
	 * 
	 * @param resource
	 *            The resource that contains the emf model
	 */
	public CheckRuleManager(Resource resource) {

		this.resource = resource;

		EObject eObject = (EObject) resource.getContents().get(0);

		constraints = new ArrayList<String>();

		namespaceUri = eObject.eClass().getEPackage().getNsURI();
		
		// load all the constraint descriptors
		ModelValidationService.getInstance().loadXmlConstraintDeclarations();
	}

	/**
	 * collect all the constraint descriptors related to the namespaceUri
	 * @param namespaceUri
	 * @return
	 */
	private List<String> getConstraints(String namespaceUri) {

		List<String> constraintSet = new ArrayList<String>();

		IExtensionRegistry extensionRegistry = Platform.getExtensionRegistry();
		IExtensionPoint extensionPoint = extensionRegistry
				.getExtensionPoint("org.eclipse.emf.validation.constraintProviders");

		for (IExtension extension : extensionPoint.getExtensions()) {

			final IConfigurationElement[] configElements = extension
					.getConfigurationElements();

			String pluginId = extension.getContributor().getName();
			boolean isPackage = false;

			for (IConfigurationElement configuration : configElements) {

				if (configuration.getName().equals("constraintProvider")) {

					for (IConfigurationElement childConfig : configuration
							.getChildren("package")) {
						if (childConfig.getAttribute("namespaceUri").equals(
								namespaceUri)) {
							isPackage = true;
						}
					}
					if (isPackage == true) {
						for (IConfigurationElement childConfig : configuration
								.getChildren("constraints")) {
							for (IConfigurationElement childConstraint : childConfig
									.getChildren("constraint")) {

								constraintSet.add(pluginId + "."
										+ childConstraint.getAttribute("id"));
								
							}
						}
					}
				}
			}

		}
		return constraintSet;
	}

	@Override
	public void enableConstraint(String id) {
		// TODO Auto-generated method stub
		ConstraintRegistry.getInstance().getDescriptor(id).setEnabled(true);
	}

	@Override
	public void disableConstraint(String id) {
		// TODO Auto-generated method stub
		
		ConstraintRegistry.getInstance().getDescriptor(id).setEnabled(false);
	}

	@Override
	public IStatus invokeModelChecking() {
		// TODO Auto-generated method stub
		IBatchValidator validator = ModelValidationService.getInstance()
				.newValidator(EvaluationMode.BATCH);
		// include live constraints, also, in batch validation
		validator.setOption(IBatchValidator.OPTION_INCLUDE_LIVE_CONSTRAINTS,
				true);
		// track the validated resources for accurate problem-marker updates
		validator.setOption(IBatchValidator.OPTION_TRACK_RESOURCES, true);

		IStatus status = validator.validate(resource.getContents());

		try {
			MarkerUtil.updateMarkers(status);
			
		} catch (CoreException e) {
			
		}
		
		return status;
	}

	@Override
	public void enableAutoChecking() {
		// TODO Auto-generated method stub
		if (!resourceHasAdapter(resource)) {
			EContentAdapter liveValidationContentAdapter = new LiveValidationContentAdapter(
					resource);
			resource.eAdapters().add(liveValidationContentAdapter);
		}
	}

	@Override
	public void disableAutoChecking() {
		// TODO Auto-generated method stub
		Collection<LiveValidationContentAdapter> adapters = new ArrayList<LiveValidationContentAdapter>();
		for (Adapter next : resource.eAdapters()) {
			if (next instanceof LiveValidationContentAdapter) {
				adapters.add((LiveValidationContentAdapter) next);
			}
		}
		resource.eAdapters().removeAll(adapters);
	}

	/**
	 * This function checks if a resource r has already the
	 * LiveValidationAdapter
	 * 
	 * @param r
	 * @return
	 */
	private boolean resourceHasAdapter(Resource r) {
		for (Adapter next : r.eAdapters()) {
			if (next instanceof LiveValidationContentAdapter) {
				return true;
			}
		}
		return false;
	}
}
