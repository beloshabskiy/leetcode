package leetcode.p895;

import java.util.*;

/**
 * 895. Maximum Frequency Stack
 * Implement FreqStack, a class which simulates the operation of a stack-like data structure.
 * FreqStack has two functions:
 * push(int x), which pushes an integer x onto the stack.
 * pop(), which removes and returns the most frequent element in the stack.
 * If there is a tie for most frequent element, the element closest to the top of the stack is removed and returned.
 */
public class FreqStack {
    private final LinkedList<Integer> stack = new LinkedList<>();
    private final Map<Integer, Integer> counts = new HashMap<>();
    private final TreeMap<Integer, Set<Integer>> elementsByCount = new TreeMap<>();

    public void push(int x) {
        stack.push(x);
        Integer currentCount = counts.getOrDefault(x, 0);
        counts.put(x, currentCount + 1);
        Set<Integer> old = elementsByCount.get(currentCount);
        if (old != null) {
            old.remove(x);
        }
        elementsByCount.computeIfAbsent(currentCount + 1, k -> new HashSet<>()).add(x);
    }

    public int pop() {
        ListIterator<Integer> iterator = stack.listIterator();
        Map.Entry<Integer, Set<Integer>> lastEntry = elementsByCount.lastEntry();
        if (lastEntry == null) {
            throw new IllegalStateException("Stack is empty");
        }
        Integer currentMax = lastEntry.getKey();
        Set<Integer> expectedNumbers = lastEntry.getValue();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (expectedNumbers.contains(number)) {
                iterator.remove();
                expectedNumbers.remove(number);
                counts.compute(number, (k, v) -> {
                    if (v == 1) {
                        return null;
                    } else {
                        return --v;
                    }
                });

                if (expectedNumbers.isEmpty()) {
                    elementsByCount.remove(currentMax);
                }

                elementsByCount.computeIfAbsent(--currentMax, k -> new HashSet<>()).add(number);
                return number;
            }
        }
        throw new IllegalStateException("Shouldn't be there");
    }
}
