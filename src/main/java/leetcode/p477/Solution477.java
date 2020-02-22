package leetcode.p477;

/**
 * 477. Total Hamming Distance
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * Now your job is to find the total Hamming distance between all pairs of the given numbers.
 */
public class Solution477 {

    public int totalHammingDistance(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                result += hammingWeight(nums[i] ^ nums[j]);
            }
        }
        return result;
    }

    private int hammingWeight(int num) {
        int result = 0;
        while (num != 0) {
            num &= (num - 1);
            ++result;
        }
        return result;
    }
}
