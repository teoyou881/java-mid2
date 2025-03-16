package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {

  public static void main(String[] args) {
    Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
    Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

    Set<Integer> Union = new HashSet<>(set1);
    Union.addAll(set2);

    Set<Integer> Intersection = new HashSet<>(set1);
    Intersection.retainAll(set2);

    Set<Integer> Difference = new HashSet<>(set1);
    Difference.removeAll(set2);

    System.out.println("Union = " + Union);
    System.out.println("Intersection = " + Intersection);
    System.out.println("Difference = " + Difference);
  }
}