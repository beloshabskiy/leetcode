package leetcode.p88;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution88Test {
    private final Solution88 underTest = new Solution88();

    @Test
    void shouldHandleBaseCase() {
        int[] num1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] num2 = {2, 5, 6};
        int n = 3;
        underTest.merge(num1, m, num2, n);
        assertArrayEquals(num1, new int[]{1, 2, 2, 3, 5, 6});
    }

    @Test
    void shouldHandleZeroM() {
        int[] num1 = {0, 0, 0};
        int m = 0;
        int[] num2 = {2, 5, 6};
        int n = 3;
        underTest.merge(num1, m, num2, n);
        assertArrayEquals(num1, new int[]{2, 5, 6});
    }

    @Test
    void shouldHandleZeroN() {
        int[] num1 = {1, 2, 3};
        int m = 3;
        int[] num2 = {0, 0, 0};
        int n = 0;
        underTest.merge(num1, m, num2, n);
        assertArrayEquals(num1, new int[]{1, 2, 3});
    }

    @Test
    void shouldHandleZeroMAndN() {
        int[] num1 = {0, 0, 0};
        int m = 0;
        int[] num2 = {0, 0, 0};
        int n = 0;
        underTest.merge(num1, m, num2, n);
        assertArrayEquals(num1, new int[]{0, 0, 0});
    }

}