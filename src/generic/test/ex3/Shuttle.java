package generic.test.ex3;

import java.util.ArrayList;

public class Shuttle<T extends BioUnit> {

  ArrayList<T> shuttle;

  public Shuttle() {
    shuttle = new ArrayList<>();
  }

  public void in(T t) {
    shuttle.add(t);
  }

  public void showInfo() {
    for (T t : shuttle) {
      System.out.println(t.getName() + "   " + t.getHp());
    }
  }
}
