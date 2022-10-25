package builder;

public class Truck extends Builder {

  @Override
  public void makeBody() {
    System.out.println("构建卡车车身");
  }

  @Override
  public void makeEngine() {
    System.out.println("构建卡车发动机");
  }

  @Override
  public void makeTire() {
    System.out.println("构建卡车轮胎");
  }

  @Override
  public void makeGearBox() {
    System.out.println("构建卡车变速箱");
  }
}
