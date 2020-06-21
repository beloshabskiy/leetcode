package leetcode.p15;

import java.util.*;

/**
 * 15. 3Sum
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
 * Find all unique triplets in the array which gives the sum of zero.
 * The solution set must not contain duplicate triplets.
 */
public class Solution15 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> counts = new HashMap<>();
        for (int next : nums) {
            counts.compute(next, (k, v) -> v == null ? 1 : ++v);
        }

        counts.forEach((k, v0) -> {
            int k0 = k;
            int target = -1 * k0;
            counts.forEach((k1, v1) -> {
                int k2 = target - k1;
                if (counts.containsKey(k2)) {
                    if ((k0 < k1 && k1 < k2) || (k0 == k1 && v0 > 1 && k1 < k2) || (k0 < k1 && k1 == k2 && v1 > 1) || (k0 == k1 && k1 == k2 && v0 > 2)) {
                        result.add(Arrays.asList(k0, k1, k2));
                    }
                }
            });
        });
        return result;
    }

    public List<List<Integer>> threeSum2(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            while (i != 0 && i < nums.length - 1 && nums[i] == nums[i - 1]) {
                ++i;
            }
            if (i >= nums.length - 2) {
                return result;
            }

            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    ++left;
                    --right;
                    while (left < right && nums[left] == nums[left - 1]) {
                        ++left;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        --right;
                    }
                } else if (sum > 0) {
                    --right;
                } else {
                    ++left;
                }
            }
        }
        return result;
    }
}
