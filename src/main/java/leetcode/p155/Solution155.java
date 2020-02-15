package leetcode.p155;

import java.util.LinkedList;

/**
 * 155. Min Stack
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 */
public class Solution155 {
    public static class MinStack {
        private final LinkedList<Node> stack = new LinkedList<>();

        public void push(int x) {
            if (stack.isEmpty()) {
                stack.push(new Node(x, x));
            } else {
                final int currentMin = stack.peek().minValue;
                stack.push(new Node(x, Math.min(currentMin, x)));
            }
        }

        public void pop() {
            stack.pop();
        }

        public int top() {
            return stack.peek().value;

        }

        public int getMin() {
            return stack.peek().minValue;
        }

        private static class Node {
            int value;

            public Node(int value, int minValue) {
                this.value = value;
                this.minValue = minValue;
            }

            int minValue;
        }
    }
}
