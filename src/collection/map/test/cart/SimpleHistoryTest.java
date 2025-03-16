package collection.map.test.cart;

import java.util.ArrayDeque;
import java.util.Deque;

public class SimpleHistoryTest {

  public static void main(String[] args) {
    Deque<String> stack = new ArrayDeque<>();

    stack.push("1");
    stack.push("2");
    stack.push("3");

    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());

  }
}