package builder;

public class SportsCar extends Builder{
  @Override
  public void makeBody() {
    System.out.println("构建运动汽车车身");
  }

  @Override
  public void makeEngine() {
    System.out.println("构建运动汽车发动机");
  }

  @Override
  public void makeTire() {
    System.out.println("构建运动汽车轮胎");
  }

  @Override
  public void makeGearBox() {
    System.out.println("构建运动汽车变速箱");
  }
}
