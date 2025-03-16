package collection.deque;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueMain {

  public static void main(String[] args) {
    Queue<Integer> queue = new ArrayDeque<>();
    // Queue<Integer> queue = new LinkedList<>();

    // Add elements to the queue
    queue.offer(1);
    queue.offer(2);
    queue.offer(3);
    System.out.println(queue);

    // Check the next element to be dequeued (peek without removing)
    System.out.println("queue.peek() = " + queue.peek());

    // Remove and return elements from the queue
    System.out.println("poll = " + queue.poll());
    System.out.println("poll = " + queue.poll());
    System.out.println("poll = " + queue.poll());
    System.out.println(queue);
  }
}
