package leetcode.p162;

/**
 * 162. Find Peak Element
 * A peak element is an element that is greater than its neighbors.
 * Given an input array nums, where nums[i] ≠ nums[i+1], find a peak element and return its index.
 * The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.
 * You may imagine that nums[-1] = nums[n] = -∞.
 */
public class Solution162 {

    public int findPeakElement(int[] nums) {
        if (isPeak(0, nums)) {
            return 0;
        } else if (isPeak(nums.length - 1, nums)) {
            return nums.length - 1;
        }

        int left = 1;
        int right = nums.length - 2;

        while (right - left > 1) {
            int mid = (left + right) >>> 1;
            if (isPeak(mid, nums)) {
                return mid;
            } else if (nums[mid] > nums[mid - 1]) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return isPeak(left, nums) ? left : right;
    }

    private boolean isPeak(int index, int[] nums) {
        if (nums.length == 1) {
            return index == 0;
        }
        if (index == 0) {
            return nums[0] > nums[1];
        } else if (index == nums.length - 1) {
            return nums[index] > nums[index - 1];
        } else {
            return nums[index] > nums[index - 1] && nums[index] > nums[index + 1];
        }
    }
}
