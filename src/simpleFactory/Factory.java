package simpleFactory;

public class Factory {

  public static Shape createShape(String name) throws UnsupportedShapeException {
    if (name.equals("Circle")) {
      return new Circle();
    } else if (name.equals("Rectangle")) {
      return new Rectangle();
    } else if (name.equals("Triangle")) {
      return new Triangle();
    } else {
      throw new UnsupportedShapeException("对不起，当前不支持这种图形");
    }
  }

}
