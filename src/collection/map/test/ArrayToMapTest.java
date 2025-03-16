package collection.map.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayToMapTest {

  public static void main(String[] args) {
    String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};
    Map<String, Integer> map = new HashMap<>();

    for (String[] strings : productArr) {
      map.put(strings[0], Integer.parseInt(strings[1]));
    }

    Map<String, Integer> collect = Arrays.stream(productArr)
        .collect(Collectors.toMap(s -> s[0], s -> Integer.parseInt(s[1])));

    map.entrySet().forEach(entry -> {
      System.out.println("item: " + entry.getKey() + ", price: " + entry.getValue());
    });

    System.out.println("\n");

    collect.entrySet().forEach(entry -> {
      System.out.println("item: " + entry.getKey() + ", price: " + entry.getValue());
    });
  }
}