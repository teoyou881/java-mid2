package collection.link;

public class NodeMain1 {
  public static void main(String[] args) {
    // Create and link nodes: A -> B -> C
    Node first = new Node("A");
    first.next = new Node("B");
    first.next.next = new Node("C");

    System.out.println("Traversing all nodes:");
    Node x = first;
    while (x != null) {
      System.out.println(x.item);
      x = x.next;
    }
  }
}
