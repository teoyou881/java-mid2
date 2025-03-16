package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeQueueMain {

  public static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<>();
    // Deque<Integer> deque = new LinkedList<>();

    // Add elements to the queue
    deque.offer(1);
    deque.offer(2);
    deque.offer(3);
    System.out.println(deque);

    // Peek at the next element to be dequeued (without removing it)
    System.out.println("deque.peek() = " + deque.peek());

    // Remove and return elements from the queue
    System.out.println("poll = " + deque.poll());
    System.out.println("poll = " + deque.poll());
    System.out.println("poll = " + deque.poll());
    System.out.println(deque);
  }
}
