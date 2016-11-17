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

import org.eclipse.core.runtime.IStatus;

/**
 * The interface for the CheckRuleManager class that manages the checking rules 
 * of a emf model identified by a namespace uri
 */
public interface RuleManager {
	
	/**
	 * enable a constraint 
	 * @param id The identity of the constraint
	 */
	public void enableConstraint(String id);
	
	/**
	 * disable a constraint
	 * @param id The identity of the constraint
	 */
	public void disableConstraint(String id);
	
	public IStatus invokeModelChecking();
	
	public void enableAutoChecking();
	
	public void disableAutoChecking();
	
}
