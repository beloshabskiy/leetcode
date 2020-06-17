package leetcode.p1143;

/**
 * 1143. Longest Common Subsequence
 * <p>
 * Given two strings text1 and text2, return the length of their longest common subsequence.
 * <p>
 * A subsequence of a string is a new string generated from the original string with some characters(can be none)
 * deleted without changing the relative order of the remaining characters. (eg, "ace" is a subsequence of "abcde" while "aec" is not).
 * A common subsequence of two strings is a subsequence that is common to both strings.
 * If there is no common subsequence, return 0.
 */
public class Solution1143 {

    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];

        dp[0][0] = text1.charAt(0) == text2.charAt(0) ? 1 : 0;

        for (int i = 1; i < text1.length(); i++) {
            dp[i][0] = dp[i - 1][0] == 1 || text1.charAt(i) == text2.charAt(0) ? 1 : 0;
        }

        for (int j = 1; j < text2.length(); j++) {
            dp[0][j] = dp[0][j - 1] == 1 || text1.charAt(0) == text2.charAt(j) ? 1 : 0;
        }

        for (int i = 1; i < text1.length(); i++) {
            for (int j = 1; j < text2.length(); j++) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[text1.length() - 1][text2.length() - 1];
    }
}
