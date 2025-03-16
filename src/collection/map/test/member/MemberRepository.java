package collection.map.test.member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {

  private Map<String, Member> memberMap = new HashMap<>();

  public void save(Member member) {
    // Save member to the map
    memberMap.put(member.getId(), member);
  }

  public void remove(String id) {
    // Remove member by ID
    memberMap.remove(id);
  }

  public Member findById(String id) {
    // Find member by ID
    return memberMap.get(id);
  }

  public Member findByName(String name) {
    // Find member by name
    return memberMap.values().stream()
        // how can we use equals?
        // this is because member.getName().equals ==> is called by String, not Member
        .filter(member -> member.getName().equals(name))
        .findFirst()
        .orElse(null);
  }
}
