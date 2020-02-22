package leetcode.p191;

/**
 * 191. Number of 1 Bits
 * Write a function that takes an unsigned integer and return the number of '1' bits it has (also known as the Hamming weight).
 */
public class Solution191 {

    public int hammingWeight(int n) {
        int result = 0;
        while (n != 0) {
            n = n & (n - 1);
            ++result;
        }
        return result;
    }
}
