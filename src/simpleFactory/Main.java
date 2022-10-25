package simpleFactory;

public class Main {
  public static void main(String[] args) throws UnsupportedShapeException {
  Shape s;
  s = Factory.createShape("Circle");
  s.draw();
  s.erase();
  s = Factory.createShape("Triangle");
  s.draw();
  s = Factory.createShape("Bear");

}

}
