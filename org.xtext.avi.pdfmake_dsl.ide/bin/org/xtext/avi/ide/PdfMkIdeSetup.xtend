/*
 * generated by Xtext 2.16.0
 */
package org.xtext.avi.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.avi.PdfMkRuntimeModule
import org.xtext.avi.PdfMkStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class PdfMkIdeSetup extends PdfMkStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new PdfMkRuntimeModule, new PdfMkIdeModule))
	}
	
}
