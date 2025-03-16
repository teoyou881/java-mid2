package collection.deque;

import java.util.Stack;

// Do not use Stack -> Use Deque instead
public class StackMain {

  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    System.out.println(stack);

    // Check the next element to be popped (peek without removing)
    System.out.println("stack.peek() = " + stack.peek());

    // Pop elements from the stack
    System.out.println("stack.pop() = " + stack.pop());
    System.out.println("stack.pop() = " + stack.pop());
    System.out.println("stack.pop() = " + stack.pop());
    System.out.println(stack);
  }
}
