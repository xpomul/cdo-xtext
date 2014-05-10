package net.winklerweb.cdoxtext.runtime.debug

import com.google.common.base.Strings
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EObject

class DebugUtil {
	static def void hprint(int indent, String string) {
		println(Strings::repeat(" ", indent) + string)	
	} 
	
	static def void dumpModel(int indent, EObject model) {
		if(model === null) {
			hprint (indent, "<null>")
			return
		}
		hprint(indent, model.toString)
		model.eClass.EAllStructuralFeatures.forEach[ f | 
			if(f instanceof EAttribute) {
				hprint(indent + 2, f.name + " = " + model.eGet(f))
			} else {
				hprint(indent + 2, f.name + " = ")
				if(f.many) {
					val list = model.eGet(f) as EList<EObject>
					hprint(indent + 3, " { ")				
					list.forEach[o | dumpModel(indent + 4, o)]
					hprint(indent + 3, " } ")				
				} else {
					dumpModel(indent + 4, model.eGet(f) as EObject)					
				}				
			}
		]
	}
	
}