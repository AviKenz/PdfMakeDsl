/**
 * generated by Xtext 2.16.0
 */
package org.xtext.avi.generator;

import com.google.common.collect.Iterators;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.avi.pdfMk.StringObject;
import org.xtext.avi.pdfMk.TextDefinition;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class PdfMkGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Function1<TextDefinition, String> _function = (TextDefinition it) -> {
      return it.getValue();
    };
    String _join = IteratorExtensions.join(IteratorExtensions.<TextDefinition, String>map(Iterators.<TextDefinition>filter(resource.getAllContents(), TextDefinition.class), _function), "\r\n");
    String _plus = ("+++PLAIN TEXT+++ \r\n\r\n\r\n" + _join);
    String _plus_1 = (_plus + "");
    final Function1<StringObject, String> _function_1 = (StringObject it) -> {
      return it.getValue();
    };
    String _join_1 = IteratorExtensions.join(IteratorExtensions.<StringObject, String>map(Iterators.<StringObject>filter(resource.getAllContents(), StringObject.class), _function_1), "\r\n");
    String _plus_2 = (_plus_1 + _join_1);
    fsa.generateFile("report.txt", _plus_2);
  }
}
