package collection.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {

  public static void main(String[] args) {
    // Conveniently creating immutable collections
    List<Integer> list = List.of(1, 2, 3);
    Set<Integer> set = Set.of(1, 2, 3);
    Map<Integer, String> map = Map.of(1, "one", 2, "two");

    System.out.println("list = " + list);
    System.out.println("set = " + set);
    System.out.println("map = " + map);

    //ImmutableCollections
    System.out.println("list class = " + list.getClass());
    System.out.println("set class = " + set.getClass());
    System.out.println("map class = " + map.getClass());

    // java.lang.UnsupportedOperationException will be thrown
    // list.add(4);
  }
}
