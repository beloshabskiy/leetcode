package leetcode;

/**
 * 334. Increasing Triplet Subsequence
 * Given an unsorted array return whether an increasing subsequence of length 3 exists or not in the array.
 */
public class Solution334 {

    public boolean increasingTriplet(int[] nums) {
        int first = 0;
        int second = -1;

        int a = 0;
        int b = -1;

        for (int i = 0; i < nums.length; i++) {
            if (second == -1) {
                if (nums[first] >= nums[i]) {
                    first = i;
                } else {
                    second = i;
                    a = first;
                    b = second;
                }
                continue;
            }

            if (nums[i] > nums[second]) {
                return true;
            }

            if (nums[i] < nums[a]) {
                a = i;
                b = -1;
            } else if (b == -1 || nums[i] < nums[b]) {
                b = i;
                if (nums[b] <= nums[second] && nums[a] <= nums[first] && nums[a] != nums[b]) {
                    first = a;
                    second = b;
                }
            }

        }
        return false;
    }
}
