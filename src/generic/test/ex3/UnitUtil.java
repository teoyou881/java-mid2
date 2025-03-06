package generic.test.ex3;

public class UnitUtil {

  public static <T extends BioUnit> T maxHp(T a, T b) {
    return a.getHp() >= b.getHp() ? a : b;
  }
}
