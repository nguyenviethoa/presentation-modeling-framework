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
package org.eclipse.pmf.pim.exception;

public class PMFException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9074049821556113572L;

	public PMFException() {
		super();
	}

	public PMFException(String message, Throwable cause) {
		super(message, cause);
	}

	public PMFException(String message) {
		super(message);
	}

	public PMFException(Throwable cause) {
		super(cause);
	}
}
