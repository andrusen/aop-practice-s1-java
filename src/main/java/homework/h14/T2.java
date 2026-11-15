package homework.h14;

import java.util.ArrayDeque;
import java.util.Deque;

// https://leetcode.com/problems/implement-queue-using-stacks/
public class T2 {

  private final Deque<Integer> pushStack = new ArrayDeque<>();
  private final Deque<Integer> popStack = new ArrayDeque<>();

  public void push(int value) {
    pushStack.push(value);
  }

  public int pop() {
    shiftStacks();
    return popStack.pop();
  }

  public int peek() {
    shiftStacks();
    return popStack.peek();
  }

  public boolean empty() {
    return pushStack.isEmpty() && popStack.isEmpty();
  }

  private void shiftStacks() {
    if (popStack.isEmpty()) {
      while (!pushStack.isEmpty()) {
        popStack.push(pushStack.pop());
      }
    }
  }
}
