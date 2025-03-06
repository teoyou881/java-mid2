package collection.array;

import java.util.Arrays;

public class MyArrayListV1 {
  private static final int DEFAULT_CAPACITY = 5; // Default capacity of the array
  private Object[] elementData; // Internal array to store elements
  private int size = 0; // Current size of the list

  // Constructor with default capacity
  public MyArrayListV1() {
    elementData = new Object[DEFAULT_CAPACITY];
  }

  // Constructor with custom initial capacity
  public MyArrayListV1(int initialCapacity) {
    elementData = new Object[initialCapacity];
  }

  // Returns the number of elements in the list
  public int size() {
    return size;
  }

  // Adds an element to the list
  public void add(Object e) {
    elementData[size] = e;
    size++;
  }

  // Retrieves an element at a given index
  public Object get(int index) {
    return elementData[index];
  }

  // Replaces an element at a given index and returns the old value
  public Object set(int index, Object element) {
    Object oldValue = get(index);
    elementData[index] = element;
    return oldValue;
  }

  // Returns the index of the first occurrence of the given element, or -1 if not found
  public int indexOf(Object o) {
    for (int i = 0; i < size; i++) {
      if (o.equals(elementData[i])) {
        return i;
      }
    }
    return -1;
  }

  // Returns a string representation of the list
  @Override
  public String toString() {
    return Arrays.toString(Arrays.copyOf(elementData, size))
        + " size=" + size + ", capacity=" + elementData.length;
  }
}
