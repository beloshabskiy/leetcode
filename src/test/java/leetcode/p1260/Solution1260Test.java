package leetcode.p1260;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1260Test {
    private final Solution1260 underTest = new Solution1260();

    @Test
    public void shouldHandle1Shift() {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] expected = {
                {9, 1, 2},
                {3, 4, 5},
                {6, 7, 8}
        };
        List<List<Integer>> result = underTest.shiftGrid(array, 1);
        check(result, expected);
    }

    @Test
    public void shouldHandle14Shift() {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] expected = {
                {5, 6, 7},
                {8, 9, 1},
                {2, 3, 4}
        };
        List<List<Integer>> result = underTest.shiftGrid(array, 14);
        check(result, expected);
    }

    @Test
    public void shouldHandleColumnGrid() {
        int[][] array = {
                {1},
                {2},
                {3}
        };
        int[][] expected = {
                {3},
                {1},
                {2}
        };
        List<List<Integer>> result = underTest.shiftGrid(array, 4);
        check(result, expected);
    }

    @Test
    public void shouldHandleRowGrid() {
        int[][] array = {
                {1, 2, 3}
        };
        int[][] expected = {
                {2, 3, 1}
        };
        List<List<Integer>> result = underTest.shiftGrid(array, 2);
        check(result, expected);
    }

    private static void check(List<List<Integer>> result, int[][] expected) {
        for (int row = 0; row < result.size(); row++) {
            for (int column = 0; column < result.get(0).size(); column++) {
                assertEquals(expected[row][column], result.get(row).get(column));
            }
        }
    }

}