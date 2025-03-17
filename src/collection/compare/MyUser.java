package collection.compare;

public class MyUser implements Comparable<MyUser> {

  private String name;
  private int age;

  public MyUser(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "MyUser{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }

  @Override
  public int compareTo(MyUser o) {
    return age < o.age ? -1 : (this.age == o.age ? 0 : 1);
  }
}
