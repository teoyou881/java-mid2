package collection.iterable;

import java.util.Iterator;

public class MyArrayMain {

  public static void main(String[] args) {
    MyArray myArr = new MyArray(new int[]{1, 2, 3, 4});

    Iterator<Integer> iterator = myArr.iterator();

    System.out.println("use iterator");
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    // advanced for
    for (Integer i : myArr) {
      System.out.println(i);
    }
  }
}
