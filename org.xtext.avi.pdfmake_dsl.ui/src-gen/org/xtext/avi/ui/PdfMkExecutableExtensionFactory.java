/*
 * generated by Xtext 2.16.0
 */
package org.xtext.avi.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.avi.pdfmake_dsl.ui.internal.Pdfmake_dslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class PdfMkExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(Pdfmake_dslActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		Pdfmake_dslActivator activator = Pdfmake_dslActivator.getInstance();
		return activator != null ? activator.getInjector(Pdfmake_dslActivator.ORG_XTEXT_AVI_PDFMK) : null;
	}

}
