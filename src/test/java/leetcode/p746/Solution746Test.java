package leetcode.p746;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution746Test {

    @Test
    void minCostClimbingStairs() {
        Solution746 underTest = new Solution746();
        Assertions.assertEquals(10, underTest.minCostClimbingStairs(new int[]{10, 15}));
        Assertions.assertEquals(15, underTest.minCostClimbingStairs(new int[]{10, 15, 20}));
        Assertions.assertEquals(6, underTest.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
}