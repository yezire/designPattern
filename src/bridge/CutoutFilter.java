package bridge;

public class CutoutFilter extends Filter {
  public CutoutFilter(ImageFormat format) {
    super(format);
  }

  @Override
  public void beautify() {
    System.out.println("使用木刻滤镜");
  }

}
