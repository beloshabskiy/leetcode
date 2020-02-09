package leetcode.p169;

import java.util.HashMap;
import java.util.Map;

public class Solution169 {

    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count = num == candidate ? count + 1
                                     : count - 1;
        }
        return candidate;
    }

    public int majorityElement2(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        int expected = nums.length - (nums.length / 2);
        for (int num : nums) {
            int currentCount = counts.compute(num, (k, v) -> v == null ? 1 : ++v);
            if (currentCount == expected) {
                return num;
            }
        }
        throw new IllegalArgumentException();
    }
}
