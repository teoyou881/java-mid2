package generic.ex1;

public class BoxMain3 {

  public static void main(String[] args) {
    GenericBox<Integer> integerBox = new GenericBox<Integer>(); // The type of T is determined at the time of creation
    integerBox.set(10);
    // integerBox.set("문자100"); // Only Integer type is allowed, compile error
    Integer integer = integerBox.get(); // Returns Integer type (No casting needed)
    System.out.println("integer = " + integer);

    GenericBox<String> stringBox = new GenericBox<String>();
    stringBox.set("hello"); // Only String type is allowed
    String str = stringBox.get(); // Returns only String type
    System.out.println("str = " + str);

    // Any desired type can be used
    GenericBox<Double> doubleBox = new GenericBox<Double>();
    doubleBox.set(10.5);
    Double doubleValue = doubleBox.get();
    System.out.println("doubleValue = " + doubleValue);

    // Type inference: The generic type can be omitted when creating an instance
    GenericBox<Integer> integerBox2 = new GenericBox<>();
  }
}
