package collection.iterable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class JavaIterableMain {

  public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);

    Iterator<Integer> listIterator = list.iterator();
    printAll(listIterator);

    HashSet<Integer> set = new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(3);
    Iterator<Integer> setIterator = set.iterator();
    printAll(setIterator);


  }

  private static void printAll(Iterator<Integer> iter) {

    System.out.println(iter.getClass());
    while (iter.hasNext()) {
      System.out.println(iter.next());
    }
  }
}
