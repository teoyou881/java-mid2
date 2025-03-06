package collection.array;

import java.util.Arrays;

/**
 * Characteristics of an array
 */
public class ArrayMain2 {
  public static void main(String[] args) {
    int[] arr = new int[5];
    arr[0] = 1;
    arr[1] = 2;
    System.out.println(Arrays.toString(arr));

    // Adding an element at the first position
    // Shift existing elements one position to the right and insert the new value at the first position
    System.out.println("Adding 3 at the first position O(n)");
    int newValue = 3;
    addFirst(arr, newValue);
    System.out.println(Arrays.toString(arr));

    // Adding an element at a specific index
    // Shift existing elements one position to the right and insert the new value at the specified index
    System.out.println("Adding 4 at index(2) O(n)");
    int index = 2;
    int value = 4;
    addAtIndex(arr, index, value);
    System.out.println(Arrays.toString(arr));

    // Adding an element at the last position
    System.out.println("Adding 5 at the last position O(1)");
    addLast(arr, 5);
    System.out.println(Arrays.toString(arr));
  }

  private static void addLast(int[] arr, int newValue) {
    arr[arr.length - 1] = newValue;
  }

  private static void addFirst(int[] arr, int newValue) {
    for (int i = arr.length - 1; i > 0; i--) {
      arr[i] = arr[i - 1];
    }
    arr[0] = newValue;
  }

  private static void addAtIndex(int[] arr, int index, int newValue) {
    for (int i = arr.length - 1; i > index; i--) {
      arr[i] = arr[i - 1];
    }
    arr[index] = newValue;
  }
}
