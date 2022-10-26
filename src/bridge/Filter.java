package bridge;

public abstract class Filter {
private ImageFormat format;
//构造的时候选定具体实现方式
public Filter(ImageFormat format){
  this.format = format;
}

public abstract void beautify();
  public void show(){
    format.show();
  }
public void work(){
  beautify();
  show();
}
}
