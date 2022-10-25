package simpleFactory;

public class Triangle extends Shape {

  @Override
  public void draw() {
    System.out.println("画了一个三角形");
  }

  @Override
  public void erase() {
    System.out.println("擦除了一个三角形");
  }
}
