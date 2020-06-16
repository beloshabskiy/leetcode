package leetcode.p560;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution560Test {

    @Test
    void shouldHandleBasicCases() {
        Solution560 underTest = new Solution560();
        assertEquals(4, underTest.subarraySum(new int[]{1, 2, 3, 3, 0, 3}, 6));
        assertEquals(2, underTest.subarraySum(new int[]{1, 1, 1}, 2));
        assertEquals(3, underTest.subarraySum(new int[]{1, 1, 1, 0}, 2));
        assertEquals(4, underTest.subarraySum(new int[]{0, 1, 1, 1, 0}, 2));
        assertEquals(1, underTest.subarraySum(new int[]{0}, 0));
        assertEquals(3, underTest.subarraySum(new int[]{0, 0}, 0));
        assertEquals(6, underTest.subarraySum(new int[]{0, 0, 0}, 0));
        assertEquals(10, underTest.subarraySum(new int[]{0, 0, 0, 0}, 0));
        assertEquals(1, underTest.subarraySum(new int[]{-1, -1, 1}, 0));
    }

}