package leetcode.p189;

/**
 * 189. Rotate Array
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 */
public class Solution189 {

    public void rotate(int[] nums, int k) {
        int swaps = 0;
        k = k % nums.length;
        if (k == 0) {
            return;
        }
        int initialIndex = 0;
        int index = 0;
        int tmp;

        while (swaps < nums.length) {
            int value = nums[initialIndex];
            do {
                index = (index + k) % nums.length;
                tmp = nums[index];
                nums[index] = value;
                value = tmp;
                ++swaps;
            } while (index != initialIndex);
            ++initialIndex;
            index = initialIndex;
        }
    }
}
