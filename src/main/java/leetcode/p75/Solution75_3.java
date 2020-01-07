package leetcode.p75;

/**
 * Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent,
 * with the colors in the order red, white and blue.
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 */
public class Solution75_3 implements Solution75 {

    @Override
    public void sortColors(int[] nums) {
        int putZeroIndex = 0;
        int putTwoIndex = nums.length - 1;
        for (int i = 0; i <= putTwoIndex;) {
            if(nums[i] == 0) {
                nums[i] = nums[putZeroIndex];
                nums[putZeroIndex] = 0;
                ++putZeroIndex;
                ++i;
            } else if(nums[i] == 2) {
                nums[i] = nums[putTwoIndex];
                nums[putTwoIndex] = 2;
                --putTwoIndex;
            } else {
                ++i;
            }
        }
    }
}
