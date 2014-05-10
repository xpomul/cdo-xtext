/*
 * generated by Xtext
 */
package net.winklerweb.cdoxtext.example.ui;

import net.winklerweb.cdoxtext.example.graphix.GraphixElement;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import com.google.inject.Injector;
import com.google.inject.Provides;

/**
 * Use this class to register components to be used within the IDE.
 */
public class GraphixUiModule extends net.winklerweb.cdoxtext.example.ui.AbstractGraphixUiModule {
	public GraphixUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	@Provides
	EditElementDialog.Factory provideEditElementDialogFactory(final Injector injector)
	{
		return new EditElementDialog.Factory() {
			@Override
			public EditElementDialog create(Shell shell, GraphixElement element) {
				EditElementDialog result = new EditElementDialog(shell, element);
				injector.injectMembers(result);
				return result;
			}
		};
	}

	
	
}
