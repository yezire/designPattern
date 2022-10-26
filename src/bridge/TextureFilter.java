package bridge;

public class TextureFilter extends Filter {

  public TextureFilter(ImageFormat format) {
    super(format);
  }

  @Override
  public void beautify() {
    System.out.println("使用纹理滤镜");
  }
}
