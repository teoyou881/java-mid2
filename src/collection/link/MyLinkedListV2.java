package collection.link;

public class MyLinkedListV2 {
  private Node first; // Head node of the linked list
  private int size = 0; // Number of elements in the list

  // Adds an element to the end of the list
  public void add(Object e) {
    Node newNode = new Node(e);
    if (first == null) {
      first = newNode;
    } else {
      Node lastNode = getLastNode();
      lastNode.next = newNode;
    }
    size++;
  }

  // Retrieves the last node in the linked list
  private Node getLastNode() {
    Node x = first;
    while (x.next != null) {
      x = x.next;
    }
    return x;
  }

  // Inserts an element at a specific index
  public void add(int index, Object e) {
    Node newNode = new Node(e);
    if (index == 0) {
      newNode.next = first;
      first = newNode;
    } else {
      Node prev = getNode(index - 1);
      newNode.next = prev.next;
      prev.next = newNode;
    }
    size++;
  }

  // Replaces an element at a given index and returns the old value
  public Object set(int index, Object element) {
    Node x = getNode(index);
    Object oldValue = x.item;
    x.item = element;
    return oldValue;
  }

  // Removes an element at a given index
  public Object remove(int index) {
    Node removeNode = getNode(index);
    Object removedItem = removeNode.item;
    if (index == 0) {
      first = removeNode.next;
    } else {
      Node prev = getNode(index - 1);
      prev.next = removeNode.next;
    }
    removeNode.item = null;
    removeNode.next = null;
    size--;
    return removedItem;
  }

  // Retrieves an element at a given index
  public Object get(int index) {
    Node node = getNode(index);
    return node.item;
  }

  // Retrieves the node at a specific index
  private Node getNode(int index) {
    Node x = first;
    for (int i = 0; i < index; i++) {
      x = x.next;
    }
    return x;
  }

  // Returns the index of the first occurrence of the given element, or -1 if not found
  public int indexOf(Object o) {
    int index = 0;
    for (Node x = first; x != null; x = x.next) {
      if (o.equals(x.item))
        return index;
      index++;
    }
    return -1;
  }

  // Returns the size of the list
  public int size() {
    return size;
  }

  // Returns a string representation of the linked list
  @Override
  public String toString() {
    return "MyLinkedListV2{" +
        "first=" + first +
        ", size=" + size +
        '}';
  }

  // Node class representing each element in the linked list
  private static class Node {
    Object item;
    Node next;

    public Node(Object item) {
      this.item = item;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      Node temp = this;
      sb.append("[");
      while (temp != null) {
        sb.append(temp.item);
        if (temp.next != null) {
          sb.append("->");
        }
        temp = temp.next;
      }
      sb.append("]");
      return sb.toString();
    }
  }
}
