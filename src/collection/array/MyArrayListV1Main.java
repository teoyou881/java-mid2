package collection.array;

public class MyArrayListV1Main {
  public static void main(String[] args) {
    MyArrayListV1 list = new MyArrayListV1();

    System.out.println("== Adding Data ==");
    System.out.println(list);
    list.add("a");
    System.out.println(list);
    list.add("b");
    System.out.println(list);
    list.add("c");
    System.out.println(list);

    System.out.println("== Using Features ==");
    System.out.println("list.size(): " + list.size());
    System.out.println("list.get(1): " + list.get(1));
    System.out.println("list.indexOf('c'): " + list.indexOf("c"));
    System.out.println("list.set(2, 'z'), oldValue: " + list.set(2, "z"));
    System.out.println(list);

    System.out.println("== Out of Capacity ==");
    list.add("d");
    System.out.println(list);
    list.add("e");
    System.out.println(list);

    // Capacity exceeded - will throw an exception if capacity is not expanded
    list.add("f");
    System.out.println(list);
  }
}
