package collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class PrinterQueueTest {

  public static void main(String[] args) {
    Queue<String> printQueue = new ArrayDeque<>();

    printQueue.offer("1");
    printQueue.offer("2");
    printQueue.offer("3");

    System.out.println(printQueue.poll());
    System.out.println(printQueue.poll());
    System.out.println(printQueue.poll());
  }
}
