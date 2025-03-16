package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class CommonKeyValueSum1 {

  public static void main(String[] args) {
    Map<String, Integer> map1 = new HashMap<>();
    map1.put("A", 1);
    map1.put("B", 2);
    map1.put("C", 3);

    Map<String, Integer> map2 = new HashMap<>();
    map2.put("B", 4);
    map2.put("C", 5);
    map2.put("D", 6);

    Map<String, Integer> result = new HashMap<>();
    for (String key : map1.keySet()) {
      if (map2.containsKey(key)) {
        result.put(key, map1.get(key) + map2.get(key));
      }
    }

    Map<String, Integer> collect = map1.entrySet().stream()
        .filter(e -> map2.containsKey(e.getKey()))
        .collect(Collectors.toMap(Entry::getKey, e -> e.getValue() + map2.get(e.getKey())));

    System.out.println(collect);
    System.out.println("\n");
    System.out.println("result = " + result);
  }
}
