package net.winklerweb.cdoxtext.runtime.debug;

import com.google.common.base.Strings;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class DebugUtil {
  public static void hprint(final int indent, final String string) {
    String _repeat = Strings.repeat(" ", indent);
    String _plus = (_repeat + string);
    InputOutput.<String>println(_plus);
  }
  
  public static void dumpModel(final int indent, final EObject model) {
    boolean _tripleEquals = (model == null);
    if (_tripleEquals) {
      DebugUtil.hprint(indent, "<null>");
      return;
    }
    String _string = model.toString();
    DebugUtil.hprint(indent, _string);
    EClass _eClass = model.eClass();
    EList<EStructuralFeature> _eAllStructuralFeatures = _eClass.getEAllStructuralFeatures();
    final Procedure1<EStructuralFeature> _function = new Procedure1<EStructuralFeature>() {
      public void apply(final EStructuralFeature f) {
        if ((f instanceof EAttribute)) {
          int _plus = (indent + 2);
          String _name = f.getName();
          String _plus_1 = (_name + " = ");
          Object _eGet = model.eGet(f);
          String _plus_2 = (_plus_1 + _eGet);
          DebugUtil.hprint(_plus, _plus_2);
        } else {
          int _plus_3 = (indent + 2);
          String _name_1 = f.getName();
          String _plus_4 = (_name_1 + " = ");
          DebugUtil.hprint(_plus_3, _plus_4);
          boolean _isMany = f.isMany();
          if (_isMany) {
            Object _eGet_1 = model.eGet(f);
            final EList<EObject> list = ((EList<EObject>) _eGet_1);
            int _plus_5 = (indent + 3);
            DebugUtil.hprint(_plus_5, " { ");
            final Procedure1<EObject> _function = new Procedure1<EObject>() {
              public void apply(final EObject o) {
                int _plus = (indent + 4);
                DebugUtil.dumpModel(_plus, o);
              }
            };
            IterableExtensions.<EObject>forEach(list, _function);
            int _plus_6 = (indent + 3);
            DebugUtil.hprint(_plus_6, " } ");
          } else {
            int _plus_7 = (indent + 4);
            Object _eGet_2 = model.eGet(f);
            DebugUtil.dumpModel(_plus_7, ((EObject) _eGet_2));
          }
        }
      }
    };
    IterableExtensions.<EStructuralFeature>forEach(_eAllStructuralFeatures, _function);
  }
}
