package leetcode.p201;

/**
 * 201. Bitwise AND of Numbers Range
 * Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all numbers in this range, inclusive.
 */
public class Solution201 {
    public int rangeBitwiseAnd(int m, int n) {
        int result = m & n;
        int diff = n - m;

        int mask = -1;
        while(diff > 0) {
            diff >>= 1;
            mask <<= 1;
        }

        return (m & n) & mask;
    }
}
