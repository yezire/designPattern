package builder;

public class RacingCar extends Builder {
  @Override
  public void makeBody() {
    System.out.println("构建场地越野车车身");
  }

  @Override
  public void makeEngine() {
    System.out.println("构建场地越野车发动机");
  }

  @Override
  public void makeTire() {
    System.out.println("构建场地越野车轮胎");
  }

  @Override
  public void makeGearBox() {
    System.out.println("构建场地越野车变速箱");
  }

}
