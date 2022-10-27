package flyweight;

import java.util.Iterator;
import java.util.List;

public class OASystem {

  private static OASystem singleton = new OASystem();

  private OASystem() {
  }

  public static OASystem getInstance() {
    return singleton;
  }

  private UserDatabase database = new UserDatabase();
  private ServiceFactory factory = ServiceFactory.getInstance();

  public void login(String name) {
    List<Integer> authority = database.getAuthorityByUser(name);
    if (authority == null) {
      System.out.println("该用户未注册");
      return;
    }
    System.out.println("(*¯︶¯*) Hello~ 欢迎 "+name+" ！您可用的权限有：");
    Iterator<Integer> it = authority.iterator();
    while (it.hasNext()) {
      Service service = factory.getService(it.next());
      System.out.println(service.getService());
    }

  }

}
