package collection.link;

public class MyLinkedListV2Main {

  public static void main(String[] args) {
    MyLinkedListV2 list = new MyLinkedListV2();

    // Add elements at the end // O(n)
    list.add("a");
    list.add("b");
    list.add("c");
    System.out.println(list);

    // Add and remove at the first position
    System.out.println("Adding at the first position");
    list.add(0, "d"); // O(1)
    System.out.println(list);

    System.out.println("Removing the first element");
    list.remove(0); // remove First O(1)
    System.out.println(list);

    // Add and remove in the middle
    System.out.println("Adding in the middle");
    list.add(1, "e"); // O(n)
    System.out.println(list);

    System.out.println("Removing from the middle");
    list.remove(1); // remove O(n)
    System.out.println(list);
  }
}
