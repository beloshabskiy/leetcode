package leetcode.p11;

/**
 * 11. Container With Most Water
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 * Note: You may not slant the container and n is at least 2.
 */
public class Solution11 {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = area(height, left, right);
        int currentArea;

        while (left != right) {
            if (height[left] >= height[right]) {
                --right;
            } else {
                ++left;
            }
            currentArea = area(height, left, right);
            if (maxArea < currentArea) {
                maxArea = currentArea;
            }
        }

        return maxArea;
    }

    private static int area(int[] height, int left, int right) {
        return Math.min(height[left], height[right]) * (right - left);
    }
}
