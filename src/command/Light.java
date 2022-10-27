package command;

public class Light {

  private String name;

  public Light() {
  }

  public Light(String name) {
    this.name = name;
  }

  public void on() { // 开灯
    System.out.println(name + ":开灯");
  }

  public void off() { // 关灯
    System.out.println(name + ":关灯");
  }
}
