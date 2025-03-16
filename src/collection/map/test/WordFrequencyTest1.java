package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {

  public static void main(String[] args) {
    String text = "orange banana apple apple banana apple";
    String[] s = text.split(" ");

    Map<String, Integer> map = new HashMap<>();

    for (String word : s) {
      map.put(word, map.getOrDefault(word, 0) + 1);
    }

//    Arrays.stream(s).forEach(string ->
//    {
//      if (!map.containsKey(string)) {
//
//        map.put(string, 1);
//      } else {
//        map.computeIfPresent(string, (k, v) -> v + 1);
//      }
//    });
    System.out.println(map);
  }
}