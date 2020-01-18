package leetcode.p326;

/**
 * 326. Power of Three
 * Given an integer, write a function to determine if it is a power of three.
 */
public class Solution326 {

    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        } else if (n == 1) {
            return true;
        } else if (n % 3 != 0) {
            return false;
        } else {
            return isPowerOfThree(n / 3);
        }
    }
}
