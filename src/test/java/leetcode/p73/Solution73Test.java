package leetcode.p73;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution73Test {

    @Test
    void shouldHandleBasicCase() {
        Solution73 underTest = new Solution73();
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        int[][] expected = {
                {1, 0, 1},
                {0, 0, 0},
                {1, 0, 1}
        };
        underTest.setZeroes(matrix);
        assertArrayEquals(expected, matrix);
    }

    @Test
    void shouldHandleBasicCase2() {
        Solution73 underTest = new Solution73();
        int[][] matrix = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };


        int[][] expected = {
                {0, 0, 0, 0},
                {0, 4, 5, 0},
                {0, 3, 1, 0}
        };
        underTest.setZeroes(matrix);
        assertArrayEquals(expected, matrix);
    }

}