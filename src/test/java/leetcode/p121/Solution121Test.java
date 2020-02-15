package leetcode.p121;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution121Test {

    @Test
    void maxProfit() {
        Solution121 underTest = new Solution121();
        Assertions.assertEquals(5, underTest.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        Assertions.assertEquals(0, underTest.maxProfit(new int[]{7, 6, 4, 3, 1}));
        Assertions.assertEquals(0, underTest.maxProfit(new int[0]));
        Assertions.assertEquals(0, underTest.maxProfit(new int[]{1}));
    }
}