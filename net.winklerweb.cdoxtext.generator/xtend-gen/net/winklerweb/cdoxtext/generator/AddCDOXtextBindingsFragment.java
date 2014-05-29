package net.winklerweb.cdoxtext.generator;

import java.util.Set;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.generator.BindFactory;
import org.eclipse.xtext.generator.Binding;
import org.eclipse.xtext.generator.Xtend2GeneratorFragment;

@SuppressWarnings("all")
public class AddCDOXtextBindingsFragment extends Xtend2GeneratorFragment {
  public Set<Binding> getGuiceBindingsUi(final Grammar grammar) {
    BindFactory _bindFactory = new BindFactory();
    BindFactory _addTypeToType = _bindFactory.addTypeToType(
      "org.eclipse.xtext.ui.editor.model.XtextDocumentProvider", 
      "net.winklerweb.cdoxtext.runtime.CDOXtextDocumentProvider");
    BindFactory _addTypeToType_1 = _addTypeToType.addTypeToType(
      "org.eclipse.xtext.ui.editor.model.IResourceForEditorInputFactory", 
      "net.winklerweb.cdoxtext.runtime.CDOResourceForEditorInputFactory");
    Set<Binding> _bindings = _addTypeToType_1.getBindings();
    return _bindings;
  }
  
  public String[] getRequiredBundlesUi(final Grammar grammar) {
    return new String[] { "net.winklerweb.cdoxtext.runtime" };
  }
}
