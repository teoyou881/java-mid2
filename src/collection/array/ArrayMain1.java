package collection.array;

import java.util.Arrays;

public class ArrayMain1 {

  public static void main(String[] args) {
    int[] arr = new int[5];

    // Index insertion: O(1)
    System.out.println("== Index Insertion: O(1) ==");
    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;
    System.out.println(Arrays.toString(arr));

    // Index update: O(1)
    System.out.println("== Index Update: O(1) ==");
    arr[2] = 10;
    System.out.println(Arrays.toString(arr));

    // Index retrieval: O(1)
    System.out.println("== Index Retrieval: O(1) ==");
    System.out.println("arr[2] = " + arr[2]);

    // Search: O(n)
    System.out.println("== Array Search: O(n) ==");
    System.out.println(Arrays.toString(arr));

    int value = 10;
    for (int i = 0; i < arr.length; i++) {
      System.out.println("arr[" + i + "]:" + arr[i]);
      if (arr[i] == value) {
        System.out.println(value + " found");
        break;
      }
    }
  }
}
