package facade;

public class PhotoManager {

  public void backUpAddress() {
    System.out.println("正在备份照片.....");
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("照片备份完成");
  }
}
