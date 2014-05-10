package net.winklerweb.cdoxtext.example.ui;

import net.winklerweb.cdoxtext.example.graphix.GraphixElement;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

public class EditElementHandler extends AbstractHandler 
{
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		IStructuredSelection sel = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);
		GraphixElement e = (GraphixElement) sel.getFirstElement(); 
		
		EditElementDialog dlg = new EditElementDialog(HandlerUtil.getActiveShellChecked(event), e);
		dlg.open();
		
		return null;
	}
}
