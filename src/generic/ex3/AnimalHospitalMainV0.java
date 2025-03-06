package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV0 {

  public static void main(String[] args) {
    DogHospital dogHospital = new DogHospital();
    CatHospital catHospital = new CatHospital();
    Dog dog = new Dog("dog", 100);
    Cat cat = new Cat("cat", 300);

    dogHospital.set(dog);
    dogHospital.checkup();

    catHospital.set(cat);
    catHospital.checkup();
    // Deliver the cat to the dog hospital.
    // A compile error occurs because the types are different.
    // dogHospital.set(cat);

    dogHospital.set(dog);
    Dog biggerDog = dogHospital.bigger(new Dog("dog2", 200));
    System.out.println("biggerDog = " + biggerDog);
  }
}