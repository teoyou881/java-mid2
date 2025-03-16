package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the list. (exit => 0)");
    int n = sc.nextInt();
    List<Integer> list = new ArrayList<>();
    if (n == 0) {
      return;
    }
    System.out.println("Please enter an integer");
    for (int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    }
    for (int i = 0; i < n; i++) {
      System.out.print(list.get(i));
      if (i < n - 1) {
        System.out.print(", ");
      }
    }
  }
}
