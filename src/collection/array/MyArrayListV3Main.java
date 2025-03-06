package collection.array;

public class MyArrayListV3Main {
  public static void main(String[] args) {
    MyArrayListV3 list = new MyArrayListV3();

    // Add elements at the end // O(1)
    list.add("a");
    list.add("b");
    list.add("c");
    System.out.println(list);

    // Add at a specific position
    System.out.println("addLast");
    list.add(3, "addLast"); // O(1)
    System.out.println(list);

    System.out.println("addFirst");
    list.add(0, "addFirst"); // O(n)
    System.out.println(list);

    // Remove elements
    Object removed1 = list.remove(4); // remove Last O(1)
    System.out.println("remove(4) = " + removed1);
    System.out.println(list);

    Object removed2 = list.remove(0); // remove First O(n)
    System.out.println("remove(0) = " + removed2);
    System.out.println(list);
  }
}
