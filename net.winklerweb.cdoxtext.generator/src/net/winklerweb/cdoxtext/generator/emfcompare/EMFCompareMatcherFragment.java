/**
 * Copyright (c) 2013-2014 Stefan Winkler (Kiel, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Stefan Winkler - initial contribution
 * 
 */
package net.winklerweb.cdoxtext.generator.emfcompare;

import java.util.Set;

import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.generator.AbstractGeneratorFragment;
import org.eclipse.xtext.generator.BindFactory;
import org.eclipse.xtext.generator.Binding;
import org.eclipse.xtext.generator.Naming;

public class EMFCompareMatcherFragment extends AbstractGeneratorFragment {

	public static String getMatchEngineFactoryName(Grammar grammar,
			Naming naming) {
		return naming.basePackageUi(grammar) + ".cdoxtext."
				+ GrammarUtil.getName(grammar) + "MatchEngineFactory";
	}

	public static String getDistanceFunctionName(Grammar grammar, Naming naming) {
		return naming.basePackageUi(grammar) + ".cdoxtext."
				+ GrammarUtil.getName(grammar) + "DistanceFunction";
	}

	@Override
	public Set<Binding> getGuiceBindingsUi(Grammar grammar) {
		return new BindFactory()
				.addTypeToType(
						"org.eclipse.emf.compare.match.IMatchEngine.Factory",
						getMatchEngineFactoryName(grammar, getNaming()))
				.addTypeToType(
						"org.eclipse.emf.compare.match.eobject.ProximityEObjectMatcher.DistanceFunction",
						getDistanceFunctionName(grammar, getNaming()))
				.getBindings();
	}
	
	@Override
	public String[] getRequiredBundlesUi(Grammar grammar) {
		return new String[] {
				"org.eclipse.emf.compare",
				"org.eclipse.emf.compare.rcp",				
				"org.eclipse.emf.compare.rcp.ui"				
		};
	}
}
