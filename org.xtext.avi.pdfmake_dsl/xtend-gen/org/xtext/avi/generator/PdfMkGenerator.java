/**
 * generated by Xtext 2.16.0
 */
package org.xtext.avi.generator;

import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.avi.pdfMk.ImageDefintion;
import org.xtext.avi.pdfMk.StringObject;
import org.xtext.avi.pdfMk.StyleDefinition;
import org.xtext.avi.pdfMk.TextDefinition;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class PdfMkGenerator extends AbstractGenerator {
  private static final String REPORT_FILE_NAME = "report.txt";
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Function1<TextDefinition, String> _function = (TextDefinition it) -> {
      return it.getValue();
    };
    String _join = IteratorExtensions.join(IteratorExtensions.<TextDefinition, String>map(Iterators.<TextDefinition>filter(resource.getAllContents(), TextDefinition.class), _function), "\r\n");
    String _plus = ("+++ Plain text +++ \r\n" + _join);
    String _plus_1 = (_plus + "");
    final Function1<StringObject, String> _function_1 = (StringObject it) -> {
      return it.getValue();
    };
    String _join_1 = IteratorExtensions.join(IteratorExtensions.<StringObject, String>map(Iterators.<StringObject>filter(resource.getAllContents(), StringObject.class), _function_1), "\r\n");
    String _plus_2 = (_plus_1 + _join_1);
    String _plus_3 = (_plus_2 + 
      "\r\n\r\n\r\n +++ Image paths +++ \r\n");
    final Function1<ImageDefintion, String> _function_2 = (ImageDefintion it) -> {
      return it.getValue();
    };
    String _join_2 = IteratorExtensions.join(IteratorExtensions.<ImageDefintion, String>map(Iterators.<ImageDefintion>filter(resource.getAllContents(), ImageDefintion.class), _function_2), " \r\n");
    String _plus_4 = (_plus_3 + _join_2);
    String _plus_5 = (_plus_4 + 
      "\r\n\r\n\r\n +++ Defined styles +++ \r\n");
    final Function1<StyleDefinition, String> _function_3 = (StyleDefinition it) -> {
      return it.getKey();
    };
    String _join_3 = IteratorExtensions.join(IteratorExtensions.<StyleDefinition, String>map(Iterators.<StyleDefinition>filter(resource.getAllContents(), StyleDefinition.class), _function_3), ", ");
    String _plus_6 = (_plus_5 + _join_3);
    String _plus_7 = (_plus_6 + 
      "\r\n\r\n\r\n +++ Counters +++ \r\n");
    String _compile = this.compile(Iterables.<TextDefinition>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), TextDefinition.class));
    String _plus_8 = (_plus_7 + _compile);
    fsa.generateFile(PdfMkGenerator.REPORT_FILE_NAME, _plus_8);
  }
  
  public String compile(final Iterable<TextDefinition> textDefinition) {
    int wordCount = 0;
    int letterCount = 0;
    final Iterator<TextDefinition> itor = textDefinition.iterator();
    while (itor.hasNext()) {
      {
        final TextDefinition el = itor.next();
        final String[] words = el.getValue().split(" ");
        int _wordCount = wordCount;
        int _size = ((List<String>)Conversions.doWrapArray(words)).size();
        wordCount = (_wordCount + _size);
        int _size_1 = ((List<String>)Conversions.doWrapArray(words)).size();
        ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size_1, true);
        for (final Integer i : _doubleDotLessThan) {
          int _letterCount = letterCount;
          int _length = words[(i).intValue()].length();
          letterCount = (_letterCount + _length);
        }
      }
    }
    return ((("Words: " + Integer.valueOf(wordCount)) + " | Letters: ") + Integer.valueOf(letterCount));
  }
}
