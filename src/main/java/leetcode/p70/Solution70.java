package leetcode.p70;

/**
 * 70. Climbing Stairs
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * Note: Given n will be a positive integer.
 */
public class Solution70 {

    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int[] memo = new int[n];
        memo[0] = 1;
        memo[1] = 2;
        for (int i = 2; i < n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }

        return memo[n - 1];
    }
}
