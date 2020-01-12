package leetcode.p895;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class FreqStack2 {
    private final Map<Integer, Integer> occurrences = new HashMap<>();
    private final Map<Integer, LinkedList<Integer>> groups = new HashMap<>();
    private int maxOccurrences = 0;

    public void push(int x) {
        Integer newOccurrences = occurrences.compute(x, (k, v) -> v == null ? 1 : ++v);

        if (newOccurrences > maxOccurrences) {
            maxOccurrences = newOccurrences;
        }

        groups.computeIfAbsent(newOccurrences, k -> new LinkedList<>()).push(x);
    }

    public int pop() {
        Integer result = groups.get(maxOccurrences).pop();
        occurrences.put(result, maxOccurrences - 1);

        if (groups.get(maxOccurrences).isEmpty()) {
            groups.remove(maxOccurrences);
            --maxOccurrences;
        }

        return result;
    }
}
