package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {

  public static void main(String[] args) {
    // Creating an immutable list
    List<Integer> list = List.of(1, 2, 3);

    // Creating a mutable list
    ArrayList<Integer> mutableList = new ArrayList<>(list);
    mutableList.add(4);
    System.out.println("mutableList = " + mutableList);
    System.out.println("mutableList class = " + mutableList.getClass());

    // Creating an unmodifiable list
    List<Integer> unmodifiableList = Collections.unmodifiableList(mutableList);
    System.out.println("unmodifiableList class = " + unmodifiableList.getClass());

    // Exception will be thrown: java.lang.UnsupportedOperationException
    // unmodifiableList.add(5);
  }
}
