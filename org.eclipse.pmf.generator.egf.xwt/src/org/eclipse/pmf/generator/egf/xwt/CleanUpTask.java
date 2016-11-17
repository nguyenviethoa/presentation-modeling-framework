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

package org.eclipse.pmf.generator.egf.xwt;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.eclipse.ui.PlatformUI;

public class CleanUpTask implements ITaskProduction {

	public CleanUpTask() {
	}

	public void preExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {

	}

	public void doExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		String projectName = productionContext.getInputValue("projectName",
				String.class);
		final IProject project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(projectName);
		if (project.exists()) {
			PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {

				public void run() {
					org.eclipse.pmf.generator.egf.xwt.tools.CleanUpUtils.cleanUp(PlatformUI.getWorkbench().getDisplay()
							.getActiveShell(), project);
				}
			});
		}
	}

	public void postExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {

	}

}
