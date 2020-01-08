package leetcode.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution4Test {

    @Test
    void shouldHandleBasicScenario() {
        assertEquals(2.0, Solution4.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
        assertEquals(2.5, Solution4.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }

}