

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

  private Queue<Integer> queue;

  public Main() {
    queue = new LinkedList<>();
  }

  public void push(int x) {
    queue.add(x);
    for (int i = 1; i < queue.size(); i++)
      queue.add(queue.remove());

  }

  public int pop() {
    return queue.remove();
  }

  public int top() {
    return queue.peek();
  }

  public boolean empty() {
    return queue.isEmpty();
  }

  public static void main(String[] args) {
    Main stack = new Main();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter numbers to push into the stack (enter -1 to stop):");
    int num = scanner.nextInt();
    while (num != -1) {
      stack.push(num);
      num = scanner.nextInt();
    }

    System.out.println("Top element of the stack: " + stack.top());

    System.out.println("Pop an element from the stack: " + stack.pop());

    System.out.println("Is the stack empty? " + stack.empty());
  }
}
