package generic.test.ex1;

public class ContainerTest {

  public static void main(String[] args) {
    Container<String> stringContainer = new Container<>();
    System.out.println("null check: " + stringContainer.isEmpty());
    stringContainer.setItem("data1");
    System.out.println("get item: " + stringContainer.getItem());
    System.out.println("null check: " + stringContainer.isEmpty());
    Container<Integer> integerContainer = new Container<>();
    integerContainer.setItem(10);
    System.out.println("get item: " + integerContainer.getItem());
  }
}