package leetcode.p53;

/**
 * 53. Maximum Subarray
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 */
public class Solution53 {

    public int maxSubArray(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] = Math.max(nums[i], nums[i] + nums[i - 1]);
            result = Math.max(result, nums[i]);
        }
        return result;
    }
}
