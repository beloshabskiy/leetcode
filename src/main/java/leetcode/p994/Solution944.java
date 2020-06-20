package leetcode.p994;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 994. Rotting Oranges
 * In a given grid, each cell can have one of three values:
 * <p>
 * the value 0 representing an empty cell;
 * the value 1 representing a fresh orange;
 * the value 2 representing a rotten orange.
 * Every minute, any fresh orange that is adjacent (4-directionally) to a rotten orange becomes rotten.
 * <p>
 * Return the minimum number of minutes that must elapse until no cell has a fresh orange.  If this is impossible, return -1 instead.
 */
public class Solution944 {
    public int orangesRotting(int[][] grid) {
        boolean hasOranges = false;
        if (grid.length == 0 || grid[0].length == 0) {
            return -1;
        }
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    hasOranges = true;
                }
                if (grid[i][j] == 2) {
                    addNeghbours(queue, grid, i, j);
                }
            }
        }

        Queue<int[]> nextDay = new LinkedList<>();
        if (queue.isEmpty()) {
            return hasOranges ? -1 : 0;
        }

        int result = 0;
        while (!queue.isEmpty()) {
            while (!queue.isEmpty()) {
                int[] next = queue.poll();
                if (grid[next[0]][next[1]] == 1) {
                    grid[next[0]][next[1]] = 2;
                    addNeghbours(nextDay, grid, next[0], next[1]);
                }
            }
            ++result;
            while (!nextDay.isEmpty()) {
                final int[] next = nextDay.poll();
                if(grid[next[0]][next[1]] == 1) {
                    queue.add(next);
                }
            }
        }

        if (hasFreshOranges(grid)) {
            return -1;
        } else {
            return result;
        }
    }

    private static void addNeghbours(Queue<int[]> queue, int[][] grid, int i, int j) {
        if (i != 0 && grid[i - 1][j] == 1) {
            queue.add(new int[]{i - 1, j});
        }

        if (i != grid.length - 1 && grid[i + 1][j] == 1) {
            queue.add(new int[]{i + 1, j});
        }

        if (j != 0 && grid[i][j - 1] == 1) {
            queue.add(new int[]{i, j - 1});
        }

        if (j != grid[0].length - 1 && grid[i][j + 1] == 1) {
            queue.add(new int[]{i, j + 1});
        }
    }

    private static boolean hasFreshOranges(int[][] grid) {
        for (int[] row : grid) {
            for (int value : row) {
                if (value == 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
