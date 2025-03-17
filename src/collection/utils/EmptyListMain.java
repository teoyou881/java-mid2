package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class EmptyListMain {

  public static void main(String[] args) {

    // Creating mutable empty lists
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new LinkedList<>();

    // Creating immutable empty lists
    List<Integer> list3 = Collections.emptyList(); // Java 5
    List<Integer> list4 = List.of(); // Java 9

    System.out.println("list3 class = " + list3.getClass());
    System.out.println("list4 class = " + list4.getClass());
  }
}
