package facade;

public class AddressManager {

  public void backUpAddress() {
    System.out.println("正在备份通讯录.....");
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("通讯录备份完成");
  }
}
