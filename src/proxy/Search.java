package proxy;


import java.util.HashMap;
import java.util.Map;

public class Search implements Searchable{
  private Map<String,Integer>map=new HashMap<>();
  public  Search(){
    System.out.println("店长到达中。。。");
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    map.put("橘子汽水",18);
    map.put("瑰夏dirty",28);
    map.put("云朵绵绵冰",25);
    map.put("牛油果奶绿",14);
    map.put("跳跳糖鸡尾酒",17);
  }

  @Override
  public Integer getPrice(String name) throws UnregisteredGoods {
    Integer price =map.get(name);
    if (price == null){
      throw new UnregisteredGoods("不好意思呀！这个饮料我们店没有");
    }
    return price;
  }



}
