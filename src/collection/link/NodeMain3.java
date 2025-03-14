package collection.link;

public class NodeMain3 {

  public static void main(String[] args) {
    // Create and link nodes: A -> B -> C
    Node first = new Node("A");
    first.next = new Node("B");
    first.next.next = new Node("C");
    System.out.println(first);

    // Traverse all nodes
    System.out.println("Traversing all nodes:");
    printAll(first);

    // Retrieve the last node
    Node lastNode = getLastNode(first);
    System.out.println("lastNode = " + lastNode);

    // Retrieve the node at a specific index
    int index = 2;
    Node index2Node = getNode(first, index);
    System.out.println("index2Node = " + index2Node.item);

    // Add new nodes
    System.out.println("Adding new nodes:");
    add(first, "D");
    System.out.println(first);
    add(first, "E");
    System.out.println(first);
    add(first, "F");
    System.out.println(first);
  }

  // Print all nodes in the linked list
  private static void printAll(Node node) {
    Node x = node;
    while (x != null) {
      System.out.println(x.item);
      x = x.next;
    }
  }

  // Get the last node in the linked list
  private static Node getLastNode(Node node) {
    Node x = node;
    while (x.next != null) {
      x = x.next;
    }
    return x;
  }

  // Get the node at a specific index
  private static Node getNode(Node node, int index) {
    Node x = node;
    for (int i = 0; i < index; i++) {
      x = x.next;
    }
    return x;
  }

  // Add a new node at the end of the linked list
  private static void add(Node node, Object param) {
    Node lastNode = getLastNode(node);
    lastNode.next = new Node(param);
  }
}
