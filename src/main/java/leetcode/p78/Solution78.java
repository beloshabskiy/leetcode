package leetcode.p78;

import java.util.LinkedList;
import java.util.List;

/**
 * 78. Subsets
 * Given a set of distinct integers, nums, return all possible subsets (the power set).
 * Note: The solution set must not contain duplicate subsets.
 */
public class Solution78 {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        for (int i = 0; i < Math.pow(2, nums.length); i++) {
            List<Integer> next = new LinkedList<>();
            for (int j = 0; j < nums.length; j++) {
                if (bitIsSet(i, j)) {
                    next.add(nums[j]);
                }
            }
            result.add(next);
        }
        return result;
    }

    private boolean bitIsSet(int number, int index) {
        int mask = 1 << index;
        return (number & mask) != 0;
    }
}
