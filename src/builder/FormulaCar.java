package builder;

public class FormulaCar extends Builder {

  @Override
  public void makeBody() {
    System.out.println("构建方程式赛车车身");
  }

  @Override
  public void makeEngine() {
    System.out.println("构建方程式赛车发动机");
  }

  @Override
  public void makeTire() {
    System.out.println("构建方程式赛车轮胎");
  }

  @Override
  public void makeGearBox() {
    System.out.println("构建方程式赛车变速箱");
  }
}
