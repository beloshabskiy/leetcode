package leetcode.p347;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 347. Top K Frequent Elements
 * Given a non-empty array of integers, return the k most frequent elements.
 */
public class Solution347 {

    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            counts.compute(num, (key, v) -> v == null ? 1 : ++v);
        }

        PriorityQueue<Map.Entry<Integer, Integer>>
                queue = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
        counts.entrySet().forEach(e -> {
            queue.add(e);
            if (queue.size() > k) {
                queue.poll();
            }
        });
        return queue.stream().map(Map.Entry::getKey).collect(Collectors.toList());
    }
}
