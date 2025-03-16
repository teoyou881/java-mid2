package collection.iterable;

import java.util.Iterator;

public class MyArrayIterator implements Iterator<Integer> {

  private int currentIndex = -1;
  private int[] arr;

  public MyArrayIterator(int[] arr) {
    this.arr = arr;
  }

  @Override
  public boolean hasNext() {
    return currentIndex < arr.length - 1;
  }

  @Override
  public Integer next() {
    return arr[++currentIndex];
  }
}
