/**
 * generated by Xtext 2.16.0
 */
package org.xtext.avi.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.avi.PdfMkRuntimeModule;
import org.xtext.avi.PdfMkStandaloneSetup;
import org.xtext.avi.ide.PdfMkIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class PdfMkIdeSetup extends PdfMkStandaloneSetup {
  @Override
  public Injector createInjector() {
    PdfMkRuntimeModule _pdfMkRuntimeModule = new PdfMkRuntimeModule();
    PdfMkIdeModule _pdfMkIdeModule = new PdfMkIdeModule();
    return Guice.createInjector(Modules2.mixin(_pdfMkRuntimeModule, _pdfMkIdeModule));
  }
}
