package collection.list;

public class MyLinkedList<E> implements MyList<E> {

  private Node<E> first;
  private int size = 0;

  // Adds an element to the end of the list
  @Override
  public void add(E e) {
    Node<E> newNode = new Node<>(e);
    if (first == null) {
      first = newNode;
    } else {
      Node<E> lastNode = getLastNode();
      lastNode.next = newNode;
    }
    size++;
  }

  // Retrieves the last node in the list
  private Node<E> getLastNode() {
    Node<E> x = first;
    while (x.next != null) {
      x = x.next;
    }
    return x;
  }

  // Inserts an element at a specific index
  @Override
  public void add(int index, E e) {
    Node<E> newNode = new Node<>(e);
    if (index == 0) {
      newNode.next = first;
      first = newNode;
    } else {
      Node<E> prev = getNode(index - 1);
      newNode.next = prev.next;
      prev.next = newNode;
    }
    size++;
  }

  // Replaces an element at a given index and returns the old value
  @Override
  public E set(int index, E element) {
    Node<E> x = getNode(index);
    E oldValue = x.item;
    x.item = element;
    return oldValue;
  }

  // Removes an element at a given index
  @Override
  public E remove(int index) {
    Node<E> removeNode = getNode(index);
    E removedItem = removeNode.item;
    if (index == 0) {
      first = removeNode.next;
    } else {
      Node<E> prev = getNode(index - 1);
      prev.next = removeNode.next;
    }
    removeNode.item = null;
    removeNode.next = null;
    size--;
    return removedItem;
  }

  // Retrieves an element at a given index
  @Override
  public E get(int index) {
    Node<E> node = getNode(index);
    return node.item;
  }

  // Retrieves the node at a specific index
  private Node<E> getNode(int index) {
    Node<E> x = first;
    for (int i = 0; i < index; i++) {
      x = x.next;
    }
    return x;
  }

  // Returns the index of the first occurrence of the given element, or -1 if not found
  @Override
  public int indexOf(E o) {
    int index = 0;
    for (Node<E> x = first; x != null; x = x.next) {
      if (o.equals(x.item)) {
        return index;
      }
      index++;
    }
    return -1;
  }

  // Returns the size of the list
  @Override
  public int size() {
    return size;
  }

  // Returns a string representation of the linked list
  @Override
  public String toString() {
    return "MyLinkedList{" +
        "first=" + first +
        ", size=" + size +
        '}';
  }

  // Node class to represent elements in the linked list
  private static class Node<E> {

    E item;
    Node<E> next;

    public Node(E item) {
      this.item = item;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      Node<E> temp = this;
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
