package facade;

public class MessageManager {

  public void backUpMessage() {
    System.out.println("正在备份信息.....");
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("信息备份完成");
  }

}
