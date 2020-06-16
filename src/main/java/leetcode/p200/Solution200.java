package leetcode.p200;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 200. Number of Islands
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands.
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
 * You may assume all four edges of the grid are all surrounded by water.
 */
public class Solution200 {

    public int numIslands(char[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    deleteIsland(grid, i, j);
                    ++result;
                }
            }
        }
        return result;
    }

    private static void deleteIsland(char[][] grid, int i, int j) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(i, j));
        while (!queue.isEmpty()) {
            Point next = queue.poll();
            final int nextI = next.i;
            final int nextJ = next.j;
            if (grid[nextI][nextJ] == '0') {
                continue;
            }
            grid[nextI][nextJ] = '0';
            if (nextI > 0 && grid[nextI - 1][nextJ] == '1') {
                queue.add(new Point(nextI - 1, nextJ));
            }
            if (nextI < grid.length - 1 && grid[nextI + 1][nextJ] == '1') {
                queue.add(new Point(nextI + 1, nextJ));
            }
            if (nextJ > 0 && grid[nextI][nextJ - 1] == '1') {
                queue.add(new Point(nextI, nextJ - 1));
            }
            if (nextJ < grid[0].length - 1 && grid[nextI][nextJ + 1] == '1') {
                queue.add(new Point(nextI, nextJ + 1));
            }
        }
    }

    private static class Point {
        private final int i;
        private final int j;

        private Point(int i, int j) {
            this.i = i;
            this.j = j;
        }

        @Override
        public String toString() {
            return "[" + i + " " + j + "]";
        }
    }
}
