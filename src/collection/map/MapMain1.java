package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {

  public static void main(String[] args) {
    Map<String, Integer> studentMap = new HashMap<>();

    studentMap.put("studentA", 90);
    studentMap.put("studentB", 80);
    studentMap.put("studentC", 80);
    studentMap.put("studentD", 100);
    System.out.println(studentMap);

    Integer result = studentMap.get("studentD");
    System.out.println("result = " + result);
    System.out.println("use keySet");
    Set<String> keySet = studentMap.keySet();
    for (String key : keySet) {
      Integer value = studentMap.get(key);
      System.out.println("key=" + key + ", value=" + value);
    }
    System.out.println("use entrySet");
    Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();
    for (Map.Entry<String, Integer> entry : entries) {
      String key = entry.getKey();
      Integer value = entry.getValue();
      System.out.println("key=" + key + ", value=" + value);
    }
    System.out.println("use values");
    Collection<Integer> values = studentMap.values();
    for (Integer value : values) {
      System.out.println("value = " + value);
    }
  }
}