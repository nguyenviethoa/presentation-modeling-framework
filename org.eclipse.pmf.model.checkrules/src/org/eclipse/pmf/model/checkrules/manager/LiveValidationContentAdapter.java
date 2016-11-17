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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.validation.marker.MarkerUtil;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.service.ILiveValidator;
import org.eclipse.emf.validation.service.ModelValidationService;
import org.eclipse.pmf.validation.actions.EnableLiveValidationDelegate;
import org.eclipse.swt.widgets.Display;

/**
 * A content adapter that performs live validation in response to changes in
 * the model.
 * <p>
 * TODO: This class was an inner class in the {@link EnableLiveValidationDelegate}
 * class, but was factored out to work around Bugzilla
 * <a href="https://bugs.eclipse.org/bugs/show_bug.cgi?id=97632">97632</a>.
 * It should be reinstated as an inner class when that bug is fixed.
 * </p>
 */
class LiveValidationContentAdapter extends EContentAdapter {

	private ILiveValidator validator = null;
	
	Resource resource;

	/**
	 * @param delegate
	 */
	LiveValidationContentAdapter(Resource resource) {
		this.resource = resource;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.EContentAdapter#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void notifyChanged(final Notification notification) {
		super.notifyChanged(notification);
		//actionDelegate.shell.getDisplay()
		
		Display.getCurrent().asyncExec(new Runnable() {
			public void run() {
				if (validator == null) {
					validator = ModelValidationService.getInstance().newValidator(
						EvaluationMode.LIVE);
				}
				
//			ValidationDelegateClientSelector.running = true;
				
				IStatus status = validator.validate(notification);
				
				if (!status.isOK()) {
					if (status.isMultiStatus()) {
						status = status.getChildren()[0];
					}
					try {
						MarkerUtil.updateMarkers(status);
					} catch (CoreException e) {
						System.out.println(e.getMessage());
					}
					System.out.println(status.getMessage());
	//				MessageDialog.openError(LiveValidationContentAdapter.this.actionDelegate.shell,LiveValidationContentAdapter.this.actionDelegate.title,status.getMessage());
				}
				
//				ValidationDelegateClientSelector.running = false;
			}
		});
	}
}
