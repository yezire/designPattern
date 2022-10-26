package observer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordDisplay implements MyObserver {

  @Override
  public void update(Subject subject) {
    String string = subject.getText();
    Set<String> set = new HashSet<>(Arrays.asList(string.split(" ")));
    set.stream().sorted().forEach(System.out::println);
  }
}
