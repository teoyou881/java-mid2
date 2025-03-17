package collection.compare;

import java.util.TreeSet;

public class SortMain5 {

  public static void main(String[] args) {
    MyUser a = new MyUser("a", 30);
    MyUser b = new MyUser("b", 20);
    MyUser c = new MyUser("c", 10);

    TreeSet<MyUser> treeSet = new TreeSet<>();
//    TreeSet<MyUser> treeSet = new TreeSet<>(Comparator.comparing(MyUser::getName));
    treeSet.add(a);
    treeSet.add(b);
    treeSet.add(c);

    System.out.println("comparable sort");
    System.out.println(treeSet);

//    treeSet.stream().sorted(
//        new Comparator<MyUser>() {
//          @Override
//          public int compare(MyUser o1, MyUser o2) {
//            return o1.getName().compareTo(o2.getName());
//          }
//        }
//    ).forEach(System.out::println);
  }
}
