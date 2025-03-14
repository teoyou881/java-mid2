package collection.list;

public class MyListPerformanceTest {

  public static void main(String[] args) {
    int size = 50_000;

    System.out.println("==MyArrayList Addition==");
    addFirst(new MyArrayList<>(), size);
    addMid(new MyArrayList<>(), size);
    MyArrayList<Integer> arrayList = new MyArrayList<>(); // Used for lookup
    addLast(arrayList, size);

    System.out.println("==MyLinkedList Addition==");
    addFirst(new MyLinkedList<>(), size);
    addMid(new MyLinkedList<>(), size);
    MyLinkedList<Integer> linkedList = new MyLinkedList<>(); // Used for lookup
    addLast(linkedList, size);

    int loop = 10_000;
    System.out.println("==MyArrayList Lookup==");
    getIndex(arrayList, loop, 0);
    getIndex(arrayList, loop, size / 2);
    getIndex(arrayList, loop, size - 1);

    System.out.println("==MyLinkedList Lookup==");
    getIndex(linkedList, loop, 0);
    getIndex(linkedList, loop, size / 2);
    getIndex(linkedList, loop, size - 1);

    System.out.println("==MyArrayList Search==");
    search(arrayList, loop, 0);
    search(arrayList, loop, size / 2);
    search(arrayList, loop, size - 1);

    System.out.println("==MyLinkedList Search==");
    search(linkedList, loop, 0);
    search(linkedList, loop, size / 2);
    search(linkedList, loop, size - 1);
  }

  private static void addFirst(MyList<Integer> list, int size) {
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < size; i++) {
      list.add(0, i);
    }
    long endTime = System.currentTimeMillis();
    System.out.println(
        "Add to front - Size: " + size + ", Execution time: " + (endTime - startTime) + "ms");
  }

  private static void addMid(MyList<Integer> list, int size) {
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < size; i++) {
      list.add(i / 2, i);
    }
    long endTime = System.currentTimeMillis();
    System.out.println(
        "Add to middle - Size: " + size + ", Execution time: " + (endTime - startTime) + "ms");
  }

  private static void addLast(MyList<Integer> list, int size) {
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < size; i++) {
      list.add(i);
    }
    long endTime = System.currentTimeMillis();
    System.out.println(
        "Add to end - Size: " + size + ", Execution time: " + (endTime - startTime) + "ms");
  }

  private static void getIndex(MyList<Integer> list, int loop, int index) {
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < loop; i++) {
      list.get(index);
    }
    long endTime = System.currentTimeMillis();
    System.out.println(
        "Index: " + index + ", Repetitions: " + loop + ", Execution time: " + (endTime - startTime)
            + "ms");
  }

  private static void search(MyList<Integer> list, int loop, int findValue) {
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
