package generic.ex4;

import generic.animal.Animal;

public class ComplexBox<T extends Animal> {

  private T animal;

  public void set(T animal) {
    this.animal = animal;
  }

  //A generic method takes precedence over a generic type.
  //
  public <T> T printAndReturn(T t) {
    System.out.println("animal.className: " + animal.getClass().getName());
    System.out.println("t.className: " + t.getClass().getName());
    //The method cannot be called because it is of type <T>
    //The type parameter T of the generic method applied here has no upper bound.
    //Therefore, it is treated as Object.
    // t.getName();
    return t;
  }
}