package collection.map.test.member;

public class MemberRepositoryMain {

  public static void main(String[] args) {
    Member member1 = new Member("id1", "Member1");
    Member member2 = new Member("id2", "Member2");
    Member member3 = new Member("id3", "Member3");

    // Save members
    MemberRepository repository = new MemberRepository();
    repository.save(member1);
    repository.save(member2);
    repository.save(member3);

    // Find members
    Member findMember1 = repository.findById("id1");
    System.out.println("findMember1 = " + findMember1);
    Member findMember3 = repository.findByName("Member3");
    System.out.println("findMember3 = " + findMember3);

    // Remove a member
    repository.remove("id1");
    Member removedMember1 = repository.findById("id1");
    System.out.println("removedMember1 = " + removedMember1);
  }
}
