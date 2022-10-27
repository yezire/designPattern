package proxy;

public class Main {

  static Searchable searchable;

  public static void main(String[] args) throws UnregisteredGoods {
    searchable = new SearchProxy();
    System.out.println("熊：你好！请问橘子汽水多少钱啊？");
    answer("橘子汽水");
    System.out.println("熊：那..瑰夏dirty呢！");
    answer("瑰夏dirty");
    System.out.println("熊：好贵555..那云朵绵绵冰呢？");
    answer("云朵绵绵冰");
    System.out.println("熊：啊 我刚刚没有听清，可以再说一遍吗？");
    //数据已经保存到cache中，不需要再请本人过来了
    answer("云朵绵绵冰");
    System.out.println("熊：突然又想喝杨枝甘露了。。有杨枝甘露吗？");
    answer("杨枝甘露");
  }

  public static void answer(String name) throws UnregisteredGoods {
    Integer price = searchable.getPrice(name);
    System.out.println("您好～" + name + "的价格是" + price);
  }

}
