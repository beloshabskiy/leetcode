package leetcode.p149;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution149Test {

    @Test
    void shouldHandleBasicCase1() {
        int[][] points = {
                {1, 1},
                {2, 2},
                {3, 3}
        };
        Solution149 underTest = new Solution149();
        assertEquals(3, underTest.maxPoints(points));
    }

    @Test
    void shouldHandleBasicCase2() {
        int[][] points = {
                {1, 1},
                {3, 2},
                {5, 3},
                {4, 1},
                {2, 3},
                {1, 4}
        };
        Solution149 underTest = new Solution149();
        assertEquals(4, underTest.maxPoints(points));
    }

    @Test
    void shouldHandleEmptyInput() {
        int[][] points = {};
        Solution149 underTest = new Solution149();
        assertEquals(0, underTest.maxPoints(points));
    }

    @Test
    void shouldHandleSinglePointArray() {
        int[][] points = {{0, 0}};
        Solution149 underTest = new Solution149();
        assertEquals(1, underTest.maxPoints(points));
    }

    @Test
    void shouldHandleVerticalLine() {
        int[][] points = {{0, 0}, {0, 1}, {0, -1}};
        Solution149 underTest = new Solution149();
        assertEquals(3, underTest.maxPoints(points));
    }

    @Test
    void shouldHandleRepeatingPoints() {
        int[][] points = {{3,1}, {12,3}, {-6,-1}, {3,1}};
        Solution149 underTest = new Solution149();
        assertEquals(4, underTest.maxPoints(points));
    }

}