package bridge;

public class SharpenFilter extends Filter {
  public SharpenFilter(ImageFormat format) {
    super(format);
  }

  @Override
  public void beautify() {
    System.out.println("使用锐化滤镜");
  }

}
