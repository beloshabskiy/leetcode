package leetcode.p53;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution53Test {

    @Test
    void shouldHandleBasicScenario() {
        final Solution53 underTest = new Solution53();
        Assertions.assertEquals(6, underTest.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

}