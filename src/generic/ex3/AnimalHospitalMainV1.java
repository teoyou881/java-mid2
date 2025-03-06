package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {

  //It does not guarantee code stability
  public static void main(String[] args) {
    AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
    AnimalHospitalV1 catHospital = new AnimalHospitalV1();
    Dog dog = new Dog("dog", 100);
    Cat cat = new Cat("cat", 300);
    dogHospital.set(dog);
    dogHospital.checkup();
    catHospital.set(cat);
    catHospital.checkup();
    // Parameter check failed: No compile error occurs.
    dogHospital.set(cat);

    dogHospital.set(dog);
    Dog biggerDog = (Dog) dogHospital.getBigger(new Dog("멍멍이2", 200));
    System.out.println("biggerDog = " + biggerDog);
  }
}