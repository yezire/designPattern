package facade;

public class MusicManager {

  public void backUpMusic() {
    System.out.println("正在备份歌曲.....");
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("歌曲备份完成");
  }

}
