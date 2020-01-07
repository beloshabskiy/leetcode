package leetcode.p1260;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a 2D grid of size m x n and an integer k. You need to shift the grid k times.
 * In one shift operation:
 * - Element at grid[i][j] becomes at grid[i][j + 1].
 * - Element at grid[i][n - 1] becomes at grid[i + 1][0].
 * - Element at grid[n - 1][n - 1] becomes at grid[0][0].
 * - Return the 2D grid after applying shift operation k times.
 * Constraints:
 * - m == grid.length
 * - n == grid[i].length
 * - 1 <= m <= 50
 * - 1 <= n <= 50
 * - -1000 <= grid[i][j] <= 1000
 * - 0 <= k <= 100
 */
public class Solution1260 {

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> result = new ArrayList<>(grid.length);

        for (int[] row : grid) {
            List<Integer> newRow = new ArrayList<>(row.length);
            for (int ignored : row) {
                newRow.add(null);
            }
            result.add(newRow);
        }

        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[0].length; column++) {
                int oldPosition = row * grid[0].length + column;
                int newPosition = oldPosition + k;
                int newRow = (newPosition / grid[0].length) % grid.length;
                int newColumn = newPosition % grid[0].length;
                result.get(newRow).set(newColumn, grid[row][column]);
            }
        }

        return result;
    }

}
