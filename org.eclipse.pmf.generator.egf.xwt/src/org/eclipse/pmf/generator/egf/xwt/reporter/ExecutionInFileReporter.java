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

import java.util.Map;

import org.eclipse.core.runtime.IPath;
import org.eclipse.egf.model.pattern.PatternContext;
import org.eclipse.egf.pattern.execution.EclipseFileReporter;
import org.eclipse.pmf.generator.egf.xwt.Constants;

/**
 * @author Thomas Guiu
 * 
 */
public class ExecutionInFileReporter extends EclipseFileReporter {
	
    public void executionFinished(String output, PatternContext context) {
    	IPath targetFilePath = (IPath) context.getValue(Constants.TARGET_FILE);
        if (targetFilePath != null && output != null && !"".equals(output)) {
        	targetFilePath = targetFilePath.makeAbsolute();
        	String targetFile = targetFilePath.toString();
        	writeOutput(output, targetFilePath.removeLastSegments(1).toString(), targetFile);
        }
    }

    public void loopFinished(String output, String outputWithCallBack, PatternContext context, Map<String, Object> parameterValues) {
    }
}
