package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStackMain {

  public static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<>();
    // Deque<Integer> deque = new LinkedList<>();

    // Push elements onto the stack
    deque.push(1);
    deque.push(2);
    deque.push(3);
    System.out.println(deque);

    // Peek at the next element to be popped (without removing it)
    System.out.println("deque.peek() = " + deque.peek());

    // Pop elements from the stack
    System.out.println("pop = " + deque.pop());
    System.out.println("pop = " + deque.pop());
    System.out.println("pop = " + deque.pop());
    System.out.println(deque);
  }
}
