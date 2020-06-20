package leetcode.p994;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution944Test {

    @Test
    void shouldHandleBasicCase() {
        Solution944 underTest = new Solution944();
        int[][] grid = {
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };
        assertEquals(4, underTest.orangesRotting(grid));
    }

    @Test
    void shouldHandleBasicCase2() {
        Solution944 underTest = new Solution944();
        int[][] grid = {
                {2, 1, 1},
                {1, 0, 0},
                {0, 1, 1}
        };
        assertEquals(-1, underTest.orangesRotting(grid));
    }

    @Test
    void shouldHandleBasicCase3() {
        Solution944 underTest = new Solution944();
        int[][] grid = {{0}};
        assertEquals(0, underTest.orangesRotting(grid));
    }

    @Test
    void shouldHandleBasicCase4() {
        Solution944 underTest = new Solution944();
        int[][] grid = {
                {1}
        };
        assertEquals(-1, underTest.orangesRotting(grid));
    }

    @Test
    void shouldHandleBasicCase5() {
        Solution944 underTest = new Solution944();
        int[][] grid = {
                {2}
        };
        assertEquals(0, underTest.orangesRotting(grid));
    }

    @Test
    void shouldHandleBasicCase6() {
        Solution944 underTest = new Solution944();
        int[][] grid = {
                {2, 1}
        };
        assertEquals(1, underTest.orangesRotting(grid));
    }

    @Test
    void shouldHandleBasicCase7() {
        Solution944 underTest = new Solution944();
        int[][] grid = {
                {2}, {1}
        };
        assertEquals(1, underTest.orangesRotting(grid));
    }

    @Test
    void shouldHandleBasicCase8() {
        Solution944 underTest = new Solution944();
        int[][] grid = {
                {2, 2},
                {1, 1},
                {0, 0},
                {2, 0}
        };
        assertEquals(1, underTest.orangesRotting(grid));
    }

}