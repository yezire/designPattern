import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import org.testng.annotations.Test;


public class TestMapSort {


  @Test
  public void test() {
    Map<String, Integer> map = new HashMap<>();
    map.put("b", 2);
    map.put("a", 1);
    map.put("c", 1);
//// 根据key排序
//    map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
//// 根据value排序
//    map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

//    map = map.entrySet().stream()
//        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
//        .collect(
//            Collectors.toMap(x -> x.getKey(), x -> x.getValue(), (x1, x2) -> x2,
//                LinkedHashMap::new));

    map.entrySet().stream().sorted(Collections.reverseOrder(Entry.comparingByValue()))
        .forEach(this::show);

  }

  public void show(Entry<String, Integer> s) {
    System.out.println(s.getKey() + ": " + s.getValue());
  }
}
