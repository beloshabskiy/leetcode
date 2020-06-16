package leetcode.p560;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 560. Subarray Sum Equals K
 * Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.
 */
public class Solution560 {

    public int subarraySum(int[] nums, int k) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }

        int result = 0;
        Map<Integer, Integer> counts = new LinkedHashMap<>();
        for (int num : nums) {
            result += counts.getOrDefault(num - k, 0);
            counts.compute(num, (key, value) -> value == null ? 1 : ++value);
        }

        result += counts.getOrDefault(k, 0);
        return result;
    }
}
