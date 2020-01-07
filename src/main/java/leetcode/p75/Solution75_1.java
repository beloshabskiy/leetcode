package leetcode.p75;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent,
 * with the colors in the order red, white and blue.
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 */
public class Solution75_1 implements Solution75 {

    @Override
    public void sortColors(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        counts.put(0, 0);
        counts.put(1, 0);
        counts.put(2, 0);

        for (int num : nums) {
            counts.compute(num, (k, v) -> ++v);
        }

        for (int i = 0; i < counts.get(0); i++) {
            nums[i] = 0;
        }
        for (int i = counts.get(0); i < counts.get(0) + counts.get(1); i++) {
            nums[i] = 1;
        }
        for (int i = counts.get(0) + counts.get(1); i < nums.length; i++) {
            nums[i] = 2;
        }
    }
}
