package collection.set;

import collection.set.member.Member;

public class JavaHashCodeMain {

  public static void main(String[] args) {
    // The default hashCode of Object is based on the memory reference
    Object obj1 = new Object();
    Object obj2 = new Object();
    System.out.println("obj1.hashCode() = " + obj1.hashCode());
    System.out.println("obj2.hashCode() = " + obj2.hashCode());

    // Some classes have overridden hashCode already
    Integer i = 10;
    String strA = "A";
    String strAB = "AB";
    System.out.println("10.hashCode = " + i.hashCode());
    System.out.println("'A'.hashCode = " + strA.hashCode());
    System.out.println("'AB'.hashCode = " + strAB.hashCode());

    // HashCode can return negative values
    System.out.println("-1.hashCode = " + Integer.valueOf(-1).hashCode());

    // Are these two objects equal or different?
    // They are different instances, but equals might return true.
    Member member1 = new Member("idA");
    Member member2 = new Member("idA");

    // Comparison with and without overriding equals() and hashCode()
    System.out.println("(member1 == member2) = " + (member1 == member2));
    System.out.println("member1 equals member2 = " + member1.equals(member2));
    System.out.println("member1.hashCode() = " + member1.hashCode());
    System.out.println("member2.hashCode() = " + member2.hashCode());
  }
}
