package collection.map.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ItemPriceTest {

  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();

    map.put("Apple", 500);
    map.put("Banana", 500);
    map.put("Mango", 1000);
    map.put("Strawberry", 1000);
    List<String> collect = map.entrySet().stream().filter(e -> e.getValue() == 1000)
        .map(Entry::getKey)
        .collect(Collectors.toList());

    System.out.println(collect);
  }
}
