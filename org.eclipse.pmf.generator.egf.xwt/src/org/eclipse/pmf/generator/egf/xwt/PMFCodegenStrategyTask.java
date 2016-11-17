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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.domain.DomainException;
import org.eclipse.egf.domain.emf.EMFDomainHelper;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.model.domain.EMFDomain;
import org.eclipse.egf.model.pattern.DomainVisitor;
import org.eclipse.egf.model.pattern.Pattern;
import org.eclipse.egf.model.pattern.PatternContext;
import org.eclipse.egf.model.pattern.PatternException;
import org.eclipse.egf.pattern.collector.PatternCollector;
import org.eclipse.egf.pattern.extension.ExtensionHelper.MissingExtensionException;
import org.eclipse.egf.pattern.ftask.tasks.DomainDrivenStrategyTask;
import org.eclipse.egf.pattern.strategy.AbstractStrategy;
import org.eclipse.pmf.generator.egf.xwt.i18n.ExternalStrings;
import org.eclipse.pmf.pim.transformation.CodeGenContext;

public class PMFCodegenStrategyTask extends DomainDrivenStrategyTask {

	public static final String CODEGEN_CONTEXT = "codegen.context";

	private PatternContext writedCtx;

	@Override
	protected void readContext(ITaskProductionContext context,
			PatternContext ctx) throws InvocationException {
		super.readContext(context, ctx);
		EMFDomain value = context.getInputValue(CODEGEN_CONTEXT,
				EMFDomain.class);

		if (value != null) {
			if (!value.isLoaded() && value.getUri() != null) {
				try {
					new EMFDomainHelper().loadDomain(value);
				} catch (DomainException e) {
				}
			}
			if (!value.getContent().isEmpty()) {
				Object object = value.getContent().get(0);
				if (object instanceof CodeGenContext) {
					ctx.setValue(CODEGEN_CONTEXT, object);
				}
			}
		}
		if (!(ctx.getValue(CODEGEN_CONTEXT) instanceof CodeGenContext)) {
			ctx.setValue(CODEGEN_CONTEXT, null);
		}
	}

	@Override
	protected void writeContext(ITaskProductionContext context,
			PatternContext ctx) throws InvocationException {
		super.writeContext(context, ctx);
		writedCtx = ctx;
	}

	@Override
	public void postExecute(ITaskProductionContext context,
			IProgressMonitor monitor) throws InvocationException {
		externalStrings();
		super.postExecute(context, monitor);
	}

	private void externalStrings() throws InvocationException {
		try {
			Strategy strategy = new Strategy();
			strategy.setPatternElements(patterns);
			strategy.execute(writedCtx,
					Collections.singletonList(ExternalStrings.INSTANCE));
		} catch (PatternException e) {
			throw new InvocationException(e);
		} catch (MissingExtensionException e) {
			throw new InvocationException(e);
		}
	}

	private static class Strategy extends AbstractStrategy {

		public void execute(PatternContext context, Object parameter)
				throws PatternException, MissingExtensionException {
			List<Pattern> result = new ArrayList<Pattern>(100);
			PatternCollector.INSTANCE.collect(patternElements, result);

			final DomainVisitor visitor = (DomainVisitor) context
					.getValue(PatternContext.DOMAIN_DRIVEN_STRATEGY_VISITOR);
			visitor.setPatterns(result);
			try {
				visitor.visit(context, parameter);
			} finally {
				visitor.dispose();
			}
		}

	}
}
