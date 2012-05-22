package calculator;

import calculator.AdditionsSpecExamples;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Additions")
public class AdditionsSpec {
  @Before
  public void _initAdditionsSpecExamples() {
    examples = ExampleTable.create("examples", 
      java.util.Arrays.asList("a", "b", "sum"), 
      new AdditionsSpecExamples(  java.util.Arrays.asList("1", "2", "3"), 1, 2, 3),
      new AdditionsSpecExamples(  java.util.Arrays.asList("4", "5", "9"), 4, 5, 9),
      new AdditionsSpecExamples(  java.util.Arrays.asList("10", "11", "20"), 10, 11, 20),
      new AdditionsSpecExamples(  java.util.Arrays.asList("21", "21", "42"), 21, 21, 42)
    );
  }
  
  protected ExampleTable<AdditionsSpecExamples> examples;
  
  @Test
  @Named("examples.forEach[a + b => sum]")
  @Order(99)
  public void examplesForEachABSum() throws Exception {
    final Procedure1<AdditionsSpecExamples> _function = new Procedure1<AdditionsSpecExamples>() {
        public void apply(final AdditionsSpecExamples it) {
          int _plus = IntegerExtensions.operator_plus(it.a, it.b);
          boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_plus), Integer.valueOf(it.sum));Assert
          .assertTrue("\nExpected a + b => sum but"
           + "\n     a + b is " + Integer.valueOf(_plus)
           + "\n     a is " + it.a
           + "\n     b is " + it.b
           + "\n     sum is " + Integer.valueOf(it.sum) + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<AdditionsSpecExamples>forEach(this.examples, _function);
  }
  
  @Test
  @Named("examples")
  @Order(99)
  public void examples() throws Exception {
    final String name = "Sebastian";
    String _sayHello = this.sayHello(name);
    boolean _doubleArrow = Should.operator_doubleArrow(_sayHello, "Hello Sebastian");Assert
    .assertTrue("\nExpected sayHello(name) => \"Hello Sebastian\" but"
     + "\n     sayHello(name) is " + "\"" + _sayHello + "\""
     + "\n     name is " + "\"" + name + "\"" + "\n", _doubleArrow);
    
  }
  
  public String sayHello(final String name) {
    String _upperCase = name.toUpperCase();
    return ObjectExtensions.operator_plus("Hello ", _upperCase);
  }
}
