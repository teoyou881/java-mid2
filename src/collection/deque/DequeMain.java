package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMain {

  public static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<>();
    // Deque<Integer> deque = new LinkedList<>();

    // Add elements to the deque
    deque.offerFirst(1);
    System.out.println(deque);
    deque.offerFirst(2);
    System.out.println(deque);
    deque.offerLast(3);
    System.out.println(deque);
    deque.offerLast(4);
    System.out.println(deque);

    // Check the next elements to be dequeued (peek without removing)
    System.out.println("deque.peekFirst() = " + deque.peekFirst());
    System.out.println("deque.peekLast() = " + deque.peekLast());

    // Remove and return elements from the deque
    System.out.println("pollFirst = " + deque.pollFirst());
    System.out.println("pollFirst = " + deque.pollFirst());
    System.out.println("pollLast = " + deque.pollLast());
    System.out.println("pollLast = " + deque.pollLast());
    System.out.println(deque);
  }
}
