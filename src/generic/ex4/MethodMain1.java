package generic.ex4;

public class MethodMain1 {

  public static void main(String[] args) {
    Integer i = 10;
    Object object = GenericMethod.objMethod(i);
    //Explicit
    System.out.println("명시적 타입 인자 전달");
    Integer result = GenericMethod.<Integer>genericMethod(i);
    Integer integerValue = GenericMethod.<Integer>numberMethod(10);
    Double doubleValue = GenericMethod.<Double>numberMethod(20.0);
    //Type Inference in Generic Methods
    System.out.println("Type Inference in Generic Methods");
    Integer result1 = GenericMethod.genericMethod(i);
    Integer integerValue1 = GenericMethod.numberMethod(10);
    Double doubleValue1 = GenericMethod.numberMethod(20.0);

  }
}