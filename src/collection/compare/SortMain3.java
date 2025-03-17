package collection.compare;

import java.util.Arrays;

public class SortMain3 {

  public static void main(String[] args) {
    MyUser a = new MyUser("a", 30);
    MyUser b = new MyUser("b", 20);
    MyUser c = new MyUser("c", 10);

    MyUser[] arr = {a, b, c};
    System.out.println(Arrays.toString(arr));
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    Arrays.sort(arr, new IdComparator());
    System.out.println(Arrays.toString(arr));
//    Arrays.sort(arr, new Comparator<MyUser>() {
//      @Override
//      public int compare(MyUser o1, MyUser o2) {
//        return 0;
//      }
//    });
  }

}
