package flyweight;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDatabase {

  private static final Map<String, List<Integer>> users = new HashMap<>();

  public List<Integer> getAuthorityByUser(String name) {
      return users.get(name);
  }

  public UserDatabase () {
    //init
    users.put("多多", Collections.singletonList(4));
    users.put("一只蟹", Arrays.asList(1, 2, 3));
    users.put("友熊", Arrays.asList(1, 2, 3, 4));
  }
}
