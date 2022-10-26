package strategy;

public class CRRTMotion implements Strategy{
  @Override
  public void move() {
    System.out.println("使用CR/RT-motion方式进行迁移");

  }
}
