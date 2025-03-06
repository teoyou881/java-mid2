package generic.ex3;

import generic.animal.Animal;

public class AnimalHospitalV1 {

  private Animal animal;

  public void set(Animal animal) {
    this.animal = animal;
  }

  public void checkup() {
    System.out.println("animal name: " + animal.getName());
    System.out.println("animal size: " + animal.getSize());
    animal.sound();
  }

  public Animal getBigger(Animal target) {
    return animal.getSize() > target.getSize() ? animal : target;
  }
}