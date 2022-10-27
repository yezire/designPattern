package proxy;

import java.util.HashMap;
import java.util.Map;

public class SearchProxy implements Searchable {

  private Map<String, Integer> cache = new HashMap<>();
  private Search real;//本人

  public SearchProxy() {
    cache.put("橘子汽水", 18);
    cache.put("瑰夏dirty", 28);
  }

  @Override
  public Integer getPrice(String name) throws UnregisteredGoods {
    Integer price;
    if (cache.containsKey(name)) {
      price = cache.get(name);
    } else {
      System.out.println("店员:啊！这个我不知道诶！我去问问店长");
      real = new Search();
      price = real.getPrice(name);
      cache.put(name,price);
    }
    return price;
  }
}
