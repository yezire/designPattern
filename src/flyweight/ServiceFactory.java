package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 业务工厂 维护享元池
 *
 * @author yezizhi
 * @date 2022/10/27
 */
public class ServiceFactory {

  private final Map<Integer, Service> pool = new HashMap<>();
  //singleton
  private static ServiceFactory singleton = new ServiceFactory();

  private ServiceFactory() {
  }

  public static ServiceFactory getInstance() {
    return singleton;
  }

  public synchronized Service getService(Integer id) {
    Service service = pool.get(id);
    if (service == null) {
      service = new Service(id);
      pool.put(id, service);
    }
    return service;
  }


}
