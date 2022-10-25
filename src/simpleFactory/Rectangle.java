package simpleFactory;

public class Rectangle extends Shape{

  @Override
  public void draw() {
    System.out.println("画了一个长方形");
  }

  @Override
  public void erase() {
    System.out.println("擦除了一个长方形");

  }
}
