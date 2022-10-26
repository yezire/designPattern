package strategy;

public class PreCopy implements Strategy{
  @Override
  public void move() {
    System.out.println("使用pre-copy方式进行迁移");

  }
}
