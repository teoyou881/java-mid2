package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {

  public static void main(String[] args) {
    Dog dog = new Dog("dog", 100);
    Cat cat = new Cat("cat", 100);
    AnimalMethod.<Dog>checkup(dog);
    AnimalMethod.checkup(cat);
    Dog targetDog = new Dog("dog2", 200);
    Dog bigger = AnimalMethod.<Dog>getBigger(dog, targetDog);
    System.out.println("bigger = " + bigger);
  }
}