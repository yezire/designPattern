package strategy;

public class Transform {
  private Strategy strategy;
  public Transform(Strategy strategy){
    this.strategy = strategy;
  }
  public void work(){
    System.out.println("准备开始迁移");
    strategy.move();
    System.out.println("迁移结束");
  }

}
