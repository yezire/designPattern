package observer;

public class TextEdit extends Subject{

  @Override
  public void execute(String string){
    System.out.println("=======有新增的输入啦=======");
    sb.append(string);
    notifyObservers();
  }
}
