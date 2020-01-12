package leetcode.p739;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution739Test {

    @Test
    public void shouldHandleBasicCase() {
        Solution739 underTest = new Solution739();
        assertArrayEquals(
                new int[]{1, 1, 4, 2, 1, 1, 0, 0},
                underTest.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})
        );
    }
}