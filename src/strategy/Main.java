package strategy;

public class Main {
public static void main(String[] args){
  Transform transform1=new Transform(new PostCopy());
  transform1.work();
  System.out.println();
  Transform transform2=new Transform(new CRRTMotion());
  transform2.work();
  System.out.println();
  Transform transform3=new Transform(new PreCopy());
  transform3.work();

}
}
