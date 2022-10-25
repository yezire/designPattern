import org.testng.annotations.Test;
import simpleFactory.Factory;
import simpleFactory.Shape;
import simpleFactory.UnsupportedShapeException;

public class TestSimpleFactory {

  @Test
  public void test() throws UnsupportedShapeException {
    Shape s;
    s = Factory.createShape("Circle");
    s.draw();
    s.erase();
    s = Factory.createShape("Triangle");
    s.draw();
    s = Factory.createShape("Bear");

  }
}
