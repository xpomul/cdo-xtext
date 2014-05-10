package net.winklerweb.cdoxtext.example.ui;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.Collections;

import net.winklerweb.cdoxtext.example.graphix.GraphixElement;
import net.winklerweb.cdoxtext.example.ui.internal.GraphixActivator;

import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.util.ConcurrentAccessException;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.merge.IMerger;
import org.eclipse.emf.compare.rcp.EMFCompareRCPPlugin;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class EditElementDialog extends Dialog {

	public interface Factory {
		EditElementDialog create(Shell activeShellChecked, GraphixElement e);
	}

	private GraphixElement element;

	@Inject 
	private IGrammarAccess grammarAccess;
	
	@Inject
	private ISerializer serializer;

	@Inject
	private IParser parser;

	@Inject
	private Provider<XtextResource> resourceProvider;

	@Inject
	private Provider<EmbeddedEditorFactory> factoryProvider;

	private EmbeddedEditorModelAccess modelAccess;

	public EditElementDialog(Shell shell, GraphixElement element) {
		super(shell);
		this.element = element;
	}

	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setSize(500, 500);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite control = new Composite(parent, SWT.NONE);
		control.setLayout(new GridLayout());
		control.setLayoutData(GridDataFactory.fillDefaults().grab(true, true)
				.create());

		final String serializedModel = serializer.serialize(element);

		IEditedResourceProvider editedResourceProvider = new IEditedResourceProvider() {
			@Override
			public XtextResource createResource() {
				XtextResource resource = resourceProvider.get();
				try {
					resource.load(
							new ByteArrayInputStream(serializedModel
									.getBytes("utf8")), Collections
									.singletonMap(
											XtextResource.OPTION_ENCODING,
											"utf8"));
				} catch (IOException e) {
					e.printStackTrace();
				}

				return resource;
			}
		};

		EmbeddedEditor editor = factoryProvider.get()
				.newEditor(editedResourceProvider)
				.showErrorAndWarningAnnotations().withParent(control);

		this.modelAccess = editor.createPartialEditor("Canvas {",
				serializedModel, "}", true);

		return control;
	}

	@Override
	protected void okPressed() {
		String editedPart = modelAccess.getEditablePart();
		
		AbstractRule rule = GrammarUtil.findRuleForName(grammarAccess.getGrammar(), "GraphixElement");
		IParseResult result = parser.parse((ParserRule)rule, new StringReader(editedPart));
		GraphixElement resultElement = (GraphixElement) result.getRootASTElement();
		
		IComparisonScope scope = EMFCompare.createDefaultScope(resultElement, element);
		IMatchEngine.Factory.Registry matcherRegistry = EMFCompareRCPPlugin.getDefault().getMatchEngineFactoryRegistry();
		EMFCompare compare = EMFCompare.builder().setMatchEngineFactoryRegistry(matcherRegistry).build();
		Comparison comparisonResult = compare.compare(scope);
		IMerger.Registry mergerReg = EMFCompareRCPPlugin.getDefault().getMergerRegistry();
		
		for (Diff d : comparisonResult.getDifferences()) {
			mergerReg.getHighestRankingMerger(d).copyLeftToRight(d, null);
		}
		
		CDOTransaction tx = (CDOTransaction) element.cdoView();
		try {
			tx.commit();
		} catch (CommitException e) {
			e.printStackTrace();
		}
		
		super.okPressed();
	}

}
