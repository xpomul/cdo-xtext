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
package net.winklerweb.cdoxtext.generator;

import java.util.Set;

import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.generator.BindFactory;
import org.eclipse.xtext.generator.Binding;
import org.eclipse.xtext.generator.DefaultGeneratorFragment;

public class AddCDOXtextBindingsFragment extends DefaultGeneratorFragment {

	@Override
	public Set<Binding> getGuiceBindingsUi(Grammar grammar) {
		BindFactory bindFactory = new BindFactory()
				.addTypeToType(
						"org.eclipse.xtext.ui.editor.model.XtextDocumentProvider",
						"net.winklerweb.cdoxtext.runtime.CDOXtextDocumentProvider")
				.addTypeToType(
						"org.eclipse.xtext.ui.editor.model.IResourceForEditorInputFactory",
						"net.winklerweb.cdoxtext.runtime.CDOResourceForEditorInputFactory");

		return bindFactory.getBindings();
	}
	
	@Override
	public String[] getRequiredBundlesUi(Grammar grammar) {
		return new String[] { "net.winklerweb.cdoxtext.runtime"};
	}

}
