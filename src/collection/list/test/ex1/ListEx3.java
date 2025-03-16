package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx3 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<>();

    System.out.println("Enter n integers (Enter 0 to stop)");

    while (true) {
      int input = scanner.nextInt();
      if (input == 0) {
        break;
      }
      numbers.add(input);
    }

    int sum = 0;
    for (Integer number : numbers) {
      sum += number;
    }

    double average = (double) sum / numbers.size();

    System.out.println("Sum of entered integers: " + sum);
    System.out.println("Average of entered integers: " + average);
  }
}
