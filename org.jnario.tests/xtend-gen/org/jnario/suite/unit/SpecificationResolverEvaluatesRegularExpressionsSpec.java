package org.jnario.suite.unit;

import java.util.List;
import java.util.Set;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.Specification;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.suite.suite.PatternReference;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.suite.SuiteFactory;
import org.jnario.suite.unit.SpecificationResolverSpec;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("evaluates regular expressions")
public class SpecificationResolverEvaluatesRegularExpressionsSpec extends SpecificationResolverSpec {
  @Test
  @Named("example 1")
  @Order(99)
  public void example1() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package demo");
    _builder.newLine();
    _builder.append("import demo.*");
    _builder.newLine();
    _builder.append("#The Suite");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- \\demo\\.My.*\\");
    _builder.newLine();
    this.m.parseSuite(_builder);
    Suite _firstSuite = this.m.firstSuite();
    Set<String> _resolvedSpecs = this.resolvedSpecs(_firstSuite);
    Set<String> _set = JnarioCollectionLiterals.<String>set("My Spec", "My Feature");
    boolean _doubleArrow = Should.operator_doubleArrow(_resolvedSpecs, _set);
    Assert.assertTrue("\nExpected resolvedSpecs(m.firstSuite) => set(\"My Spec\", \"My Feature\") but"
     + "\n     resolvedSpecs(m.firstSuite) is " + _resolvedSpecs
     + "\n     m.firstSuite is " + _firstSuite
     + "\n     m is " + this.m
     + "\n     set(\"My Spec\", \"My Feature\") is " + _set + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("example 2")
  @Order(99)
  public void example2() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package demo");
    _builder.newLine();
    _builder.append("import demo.*");
    _builder.newLine();
    _builder.append("#My Suite");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- \\.*Spec\\");
    _builder.newLine();
    this.m.parseSuite(_builder);
    Suite _firstSuite = this.m.firstSuite();
    Set<String> _resolvedSpecs = this.resolvedSpecs(_firstSuite);
    Set<String> _set = JnarioCollectionLiterals.<String>set("My Spec");
    boolean _doubleArrow = Should.operator_doubleArrow(_resolvedSpecs, _set);
    Assert.assertTrue("\nExpected resolvedSpecs(m.firstSuite) => set(\"My Spec\") but"
     + "\n     resolvedSpecs(m.firstSuite) is " + _resolvedSpecs
     + "\n     m.firstSuite is " + _firstSuite
     + "\n     m is " + this.m
     + "\n     set(\"My Spec\") is " + _set + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("returns empty list on null input")
  @Order(99)
  public void returnsEmptyListOnNullInput() throws Exception {
    PatternReference _createPatternReference = SuiteFactory.eINSTANCE.createPatternReference();
    List<Specification> _resolveSpecs = this.subject.resolveSpecs(_createPatternReference);
    List<Object> _list = JnarioCollectionLiterals.<Object>list();
    boolean _doubleArrow = Should.operator_doubleArrow(_resolveSpecs, _list);
    Assert.assertTrue("\nExpected subject.resolveSpecs(SuiteFactory::eINSTANCE.createPatternReference) => list() but"
     + "\n     subject.resolveSpecs(SuiteFactory::eINSTANCE.createPatternReference) is " + _resolveSpecs
     + "\n     subject is " + this.subject
     + "\n     SuiteFactory::eINSTANCE.createPatternReference is " + _createPatternReference
     + "\n     SuiteFactory::eINSTANCE is " + SuiteFactory.eINSTANCE
     + "\n     list() is " + _list + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("ignores unresolved elements")
  @Order(99)
  public void ignoresUnresolvedElements() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package demo");
    _builder.newLine();
    _builder.append("import demo.*");
    _builder.newLine();
    _builder.append("#My Suite");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- \\NonExistent\\");
    _builder.newLine();
    this.m.parseSuite(_builder);
    Suite _firstSuite = this.m.firstSuite();
    Set<String> _resolvedSpecs = this.resolvedSpecs(_firstSuite);
    Set<Object> _set = JnarioCollectionLiterals.<Object>set();
    boolean _doubleArrow = Should.operator_doubleArrow(_resolvedSpecs, _set);
    Assert.assertTrue("\nExpected resolvedSpecs(m.firstSuite) => set() but"
     + "\n     resolvedSpecs(m.firstSuite) is " + _resolvedSpecs
     + "\n     m.firstSuite is " + _firstSuite
     + "\n     m is " + this.m
     + "\n     set() is " + _set + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("ignores containing suite")
  @Order(99)
  public void ignoresContainingSuite() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package demo");
    _builder.newLine();
    _builder.append("import demo.*");
    _builder.newLine();
    _builder.append("#My Suite");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- \\.*\\");
    _builder.newLine();
    this.m.parseSuite(_builder);
    Suite _firstSuite = this.m.firstSuite();
    Set<String> _resolvedSpecs = this.resolvedSpecs(_firstSuite);
    Set<String> _set = JnarioCollectionLiterals.<String>set("My Spec", "My Feature");
    boolean _doubleArrow = Should.operator_doubleArrow(_resolvedSpecs, _set);
    Assert.assertTrue("\nExpected resolvedSpecs(m.firstSuite) => set(\"My Spec\", \"My Feature\") but"
     + "\n     resolvedSpecs(m.firstSuite) is " + _resolvedSpecs
     + "\n     m.firstSuite is " + _firstSuite
     + "\n     m is " + this.m
     + "\n     set(\"My Spec\", \"My Feature\") is " + _set + "\n", _doubleArrow);
    
  }
}
