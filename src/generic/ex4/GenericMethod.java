package generic.ex4;

public class GenericMethod {

  public static Object objMethod(Object obj) {
    System.out.println("objMethod = " + obj);
    return obj;
  }

  public static <T> T genericMethod(T obj) {
    System.out.println("genericMethod = " + obj);
    return obj;
  }

  public static <T extends Number> T numberMethod(T obj) {
    System.out.println("numberBoundMethod = " + obj);
    return obj;
  }
}
