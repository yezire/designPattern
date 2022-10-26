package facade;

/**
 * 一键备份
 *
 * @author yezizhi
 * @date 2022/10/26
 */
public class Backup {

  private Backup() {
  }

  //对外只提供"一键备份"一个接口
  public static void oneClickBackup() {
    AddressManager addressManager = new AddressManager();
    MessageManager message = new MessageManager();
    MusicManager music = new MusicManager();
    PhotoManager photo = new PhotoManager();
    System.out.println("==========开始备份===========");
    addressManager.backUpAddress();
    message.backUpMessage();
    music.backUpMusic();
    photo.backUpAddress();
    System.out.println("==========全部备份完成===========");
  }
}
