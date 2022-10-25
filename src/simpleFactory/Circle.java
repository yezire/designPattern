package simpleFactory;

public class Circle extends Shape{

  @Override
  public void draw() {
    System.out.println("画了一个圆");
  }

  @Override
  public void erase() {
    System.out.println("擦除了一个圆");
  }
}
