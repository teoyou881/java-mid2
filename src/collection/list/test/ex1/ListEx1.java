package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {

  public static void main(String[] args) {
    List<Integer> students = new ArrayList<Integer>();
    students.add(90);
    students.add(80);
    students.add(70);
    students.add(60);
    students.add(50);
    int total = 0;

    for (Integer i : students) {
      total += i;
    }

    double average = (double) total / students.size();

    System.out.println("Total score: " + total);
    System.out.println("Average score: " + average);

  }
}
