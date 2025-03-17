package collection.compare;

import java.util.LinkedList;
import java.util.List;

public class SortMain4 {


  public static void main(String[] args) {

    MyUser a = new MyUser("a", 30);
    MyUser b = new MyUser("b", 20);
    MyUser c = new MyUser("c", 10);

    List<MyUser> list = new LinkedList<>(List.of(a, b, c));

    System.out.println("basic");
    System.out.println(list);

    System.out.println("comparable sort");
    list.sort(null);
    System.out.println(list);

    System.out.println("IdComparator sort");
    list.sort(new IdComparator());
    System.out.println(list);


  }

}
