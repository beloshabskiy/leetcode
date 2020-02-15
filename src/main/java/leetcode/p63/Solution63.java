package leetcode.p63;

/**
 * 63. Unique Paths II
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 * The robot can only move either down or right at any point in time.
 * The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 * Now consider if some obstacles are added to the grids. How many unique paths would there be?
 */
public class Solution63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        final boolean startIsBlocked = obstacleGrid[0][0] == 1;
        boolean fillWithZeros = startIsBlocked;
        for (int i = 0; i < obstacleGrid.length; i++) {
            if (obstacleGrid[i][0] == 1) {
                fillWithZeros = true;
            }
            if (fillWithZeros) {
                obstacleGrid[i][0] = 0;
            } else {
                if (i != 0) {
                    obstacleGrid[i][0] = 1;
                }
            }
        }
        fillWithZeros = startIsBlocked;
        for (int j = 0; j < obstacleGrid[0].length; j++) {
            if (obstacleGrid[0][j] == 1) {
                fillWithZeros = true;
            }
            if (fillWithZeros) {
                obstacleGrid[0][j] = 0;
            } else {
                obstacleGrid[0][j] = 1;
            }
        }
        for (int i = 1; i < obstacleGrid.length; i++) {
            for (int j = 1; j < obstacleGrid[i].length; j++) {
                if (obstacleGrid[i][j] == 1) {
                    obstacleGrid[i][j] = 0;
                } else {
                    obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
                }
            }

        }
        return obstacleGrid[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }
}
