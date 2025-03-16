package collection.set;

public class MyHashSetV0Main {

  public static void main(String[] args) {
    MyHashSetV0 set = new MyHashSetV0();

    set.add(1); // O(1)
    set.add(2); // O(n)
    set.add(3); // O(n)
    set.add(4); // O(n)

    System.out.println(set);

    boolean result = set.add(4); // Attempt to store duplicate data
    System.out.println("Duplicate data storage result = " + result);
    System.out.println(set);

    System.out.println("set.contains(3): " + set.contains(3)); // O(n)
    System.out.println("set.contains(99): " + set.contains(99)); // O(n)
  }
}
