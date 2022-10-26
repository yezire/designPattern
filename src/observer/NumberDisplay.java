package observer;

public class NumberDisplay implements MyObserver {

  @Override
  public void update(Subject subject) {
    String string = subject.getText();
    String[] words = string.split(" ");
    System.out.println("单词的数量是" + words.length);
    //删除空格
    string.replaceAll(" ", "");
    System.out.println("字符的数量是" + string.length());
  }
}
