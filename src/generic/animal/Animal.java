package generic.animal;

public class Animal {

  String name;
  int size;

  public Animal(String name, int size) {
    this.name = name;
    this.size = size;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return size;
  }

  public void sound() {
    System.out.println("sound");
  }

  @Override
  public String toString() {
    return "Animal{" +
        "name='" + name + '\'' +
        ", size=" + size +
        '}';
  }
}
