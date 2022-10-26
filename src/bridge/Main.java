package bridge;

public class Main {
  public static void main(String[] args){
    Filter filter = new CutoutFilter(new BMP());
    filter.work();
    System.out.println("===========");
    filter=new BlurFilter(new JPG());
    filter.work();
    System.out.println("===========");
    filter=new SharpenFilter(new GIF());
    filter.work();
  }

}
