package bridge;

public class BlurFilter extends Filter{

  public BlurFilter(ImageFormat format) {
    super(format);
  }

  @Override
  public void beautify() {
    System.out.println("使用模糊滤镜");
  }
}
