package collection.list;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E> {
  private static final int DEFAULT_CAPACITY = 5; // Default initial capacity
  private Object[] elementData; // Internal array to store elements
  private int size = 0; // Current number of elements in the list

  // Constructor with default capacity
  public MyArrayList() {
    elementData = new Object[DEFAULT_CAPACITY];
  }

  // Constructor with custom initial capacity
  public MyArrayList(int initialCapacity) {
    elementData = new Object[initialCapacity];
  }

  // Returns the number of elements in the list
  @Override
  public int size() {
    return size;
  }

  // Adds an element to the end of the list, expanding capacity if needed
  @Override
  public void add(E e) {
    if (size == elementData.length) {
      grow();
    }
    elementData[size] = e;
    size++;
  }

  // Adds an element at a specific index, shifting elements to the right
  @Override
  public void add(int index, E e) {
    if (size == elementData.length) {
      grow();
    }
    shiftRightFrom(index); // Shift elements right to make space
    elementData[index] = e;
    size++;
  }

  // Shifts elements right from the given index (for insert operation)
  private void shiftRightFrom(int index) {
    for (int i = size; i > index; i--) {
      elementData[i] = elementData[i - 1];
    }
  }

  // Retrieves an element at a given index
  @Override
  @SuppressWarnings("unchecked")
  public E get(int index) {
    return (E) elementData[index];
  }

  // Replaces an element at a given index and returns the old value
  @Override
  public E set(int index, E element) {
    E oldValue = get(index);
    elementData[index] = element;
    return oldValue;
  }

  // Removes an element at the given index, shifting elements left
  @Override
  public E remove(int index) {
    E oldValue = get(index);
    shiftLeftFrom(index); // Shift elements left to fill the gap
    size--;
    elementData[size] = null; // Prevent memory leak
    return oldValue;
  }

  // Shifts elements left from the given index (for remove operation)
  private void shiftLeftFrom(int index) {
    for (int i = index; i < size - 1; i++) {
      elementData[i] = elementData[i + 1];
    }
  }

  // Returns the index of the first occurrence of the given element, or -1 if not found
  @Override
  public int indexOf(E o) {
    for (int i = 0; i < size; i++) {
      if (o.equals(elementData[i])) {
        return i;
      }
    }
    return -1;
  }

  // Expands the array capacity
  private void grow() {
    int oldCapacity = elementData.length;
    int newCapacity = oldCapacity * 2; // Double the size
    elementData = Arrays.copyOf(elementData, newCapacity);
  }

  // Returns a string representation of the list
  @Override
  public String toString() {
    return Arrays.toString(Arrays.copyOf(elementData, size))
        + " size=" + size + ", capacity=" + elementData.length;
  }
}
