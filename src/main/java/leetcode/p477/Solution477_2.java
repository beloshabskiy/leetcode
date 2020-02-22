package leetcode.p477;

/**
 * 477. Total Hamming Distance
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * Now your job is to find the total Hamming distance between all pairs of the given numbers.
 */
public class Solution477_2 {

    public int totalHammingDistance(int[] nums) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int zeros = 0;
            int ones = 0;
            for (int num : nums) {
                if (((num >> i) & 1) == 0) {
                    ++zeros;
                } else {
                    ++ones;
                }
            }
            result += (zeros * ones);
        }
        return result;
    }
}
