package leetcode.p11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution11Test {

    @Test
    void shouldHandleBasicCase() {
        Solution11 underTest = new Solution11();
        assertEquals(49, underTest.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

}