package flyweight;

/**
 * 业务对象 实例会被共享的类
 *
 * @author yezizhi
 * @date 2022/10/27
 */
public class Service {

  private String service;

  public Service(Integer id) {

    switch (id) {
      case 1:
        service = "可查看";
        break;
      case 2:
        service = "可编辑";
        break;
      case 3:
        service = "可分享";
        break;
      case 4:
        service = "可删除";
        break;
    }
  }

  public String getService() {
    return service;
  }

}
