/**
/*******************************************************************************
 * Copyright (c) 2006 - 2016 Soyatec (http://www.soyatec.com) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Thomas Guiu - initial API and implementation
 *******************************************************************************/

package org.eclipse.pmf.generator.egf.xwt.reporter;

import java.io.ByteArrayInputStream;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.egf.model.pattern.PatternContext;
import org.eclipse.egf.pattern.EGFPatternPlugin;
import org.eclipse.egf.pattern.execution.EclipseFileReporter;
import org.eclipse.pmf.generator.egf.xwt.Constants;

/**
 * @author Thomas Guiu
 * 
 */
public class ViewReporter extends EclipseFileReporter {

	public void executionFinished(String output, PatternContext context) {
	}

	public void loopFinished(String output, String outputWithCallBack,
			PatternContext context, Map<String, Object> parameterValues) {
		if (context.getValue(Constants.DATAFORM_CONTENT) != null) {
			return;
		}
		IPath targetFilePath = (IPath) context.getValue(Constants.TARGET_FILE);
		if (targetFilePath != null && output != null && !"".equals(output)) {
			targetFilePath = targetFilePath.makeAbsolute();
			String targetFile = targetFilePath.toString();
			writeOutput(output,
					targetFilePath.removeLastSegments(1).toString(), targetFile);
		}
	}

	@Override
	protected void writeOutput(String output, String targetDirectory,
			String targetFile) {
		NullProgressMonitor monitor = new NullProgressMonitor();

		try {
			ensureContainerExists(targetDirectory, monitor);

			IFile file = ResourcesPlugin.getWorkspace().getRoot()
					.getFile(new Path(targetFile));
			if (file.exists()) {
				// file.delete(true, monitor);
				//DONOT delete the existed file, just overrite it.
				file.setContents(new ByteArrayInputStream(output.getBytes()),
						IResource.KEEP_HISTORY, monitor);
			} else {
				file.create(new ByteArrayInputStream(output.getBytes()), true,
						monitor);
			}
		} catch (Exception exception) {
			EGFPatternPlugin.getDefault().logError(exception);
		}
	}
}
