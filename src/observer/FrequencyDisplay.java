package observer;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class FrequencyDisplay implements MyObserver {

  @Override
  public void update(Subject subject) {
    String string = subject.getText();
    Map<String, Integer> map = new HashMap<>();
    for (String s : string.split(" ")) {
      if (map.containsKey(s)) {
        Integer value = map.get(s) + 1;
        map.replace(s, value);
      } else {
        map.put(s, 1);
      }
    }
    map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
        .forEach(this::show);

  }

  public void show(Entry<String, Integer> s) {
    System.out.println(s.getKey() + ": " + s.getValue());
  }
}
