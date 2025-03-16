package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaListPerformanceTest {

  public static void main(String[] args) {
    int size = 50_000;

    System.out.println("==ArrayList Addition==");
    addFirst(new ArrayList<>(), size);
    addMid(new ArrayList<>(), size);
    ArrayList<Integer> arrayList = new ArrayList<>(); // Used for lookup
    addLast(arrayList, size);

    System.out.println("==LinkedList Addition==");
    addFirst(new LinkedList<>(), size);
    addMid(new LinkedList<>(), size);
    LinkedList<Integer> linkedList = new LinkedList<>(); // Used for lookup
    addLast(linkedList, size);

    int loop = 10_000;

    System.out.println("==ArrayList Lookup==");
    getIndex(arrayList, loop, 0);
    getIndex(arrayList, loop, size / 2);
    getIndex(arrayList, loop, size - 1);

    System.out.println("==LinkedList Lookup==");
    getIndex(linkedList, loop, 0);
    getIndex(linkedList, loop, size / 2);
    getIndex(linkedList, loop, size - 1);

    System.out.println("==ArrayList Search==");
    search(arrayList, loop, 0);
    search(arrayList, loop, size / 2);
    search(arrayList, loop, size - 1);

    System.out.println("==LinkedList Search==");
    search(linkedList, loop, 0);
    search(linkedList, loop, size / 2);
    search(linkedList, loop, size - 1);
  }

  private static void addFirst(List<Integer> list, int size) {
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < size; i++) {
      list.add(0, i);
    }
    long endTime = System.currentTimeMillis();
    System.out.println(
        "Add to front - Size: " + size + ", Execution time: " + (endTime - startTime) + "ms");
  }

  private static void addMid(List<Integer> list, int size) {
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < size; i++) {
      list.add(i / 2, i);
    }
    long endTime = System.currentTimeMillis();
    System.out.println(
        "Add to middle - Size: " + size + ", Execution time: " + (endTime - startTime) + "ms");
  }

  private static void addLast(List<Integer> list, int size) {
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < size; i++) {
      list.add(i);
    }
    long endTime = System.currentTimeMillis();
    System.out.println(
        "Add to end - Size: " + size + ", Execution time: " + (endTime - startTime) + "ms");
  }

  private static void getIndex(List<Integer> list, int loop, int index) {
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < loop; i++) {
      list.get(index);
    }
    long endTime = System.currentTimeMillis();
    System.out.println(
        "Index: " + index + ", Repetitions: " + loop + ", Execution time: " + (endTime - startTime)
            + "ms");
  }

  private static void search(List<Integer> list, int loop, int findValue) {
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < loop; i++) {
      list.indexOf(findValue);
    }
    long endTime = System.currentTimeMillis();
    System.out.println(
        "Find value: " + findValue + ", Repetitions: " + loop + ", Execution time: " + (endTime
            - startTime) + "ms");
  }
}
