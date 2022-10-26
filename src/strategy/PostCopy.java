package strategy;

public class PostCopy implements Strategy{
  @Override
  public void move() {
    System.out.println("使用post-copy方式进行迁移");

  }
}
