package leetcode.p189;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution189Test {

    @Test
    void shouldHandleBasicCase() {
        Solution189 underTest = new Solution189();
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] expected = {4, 5, 6, 1, 2, 3};
        underTest.rotate(input, 3);
        assertArrayEquals(expected, input);
    }

}