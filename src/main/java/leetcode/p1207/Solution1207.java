package leetcode.p1207;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 1207. Unique Number of Occurrences
 * Given an array of integers arr, write a function that returns true if and only if the number of occurrences of each value in the array is unique.
 */
public class Solution1207 {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int next : arr) {
            counts.compute(next, (k, v) -> v == null ? 1 : ++v);
        }
        return counts.size() == new HashSet<>(counts.values()).size();
    }
}
