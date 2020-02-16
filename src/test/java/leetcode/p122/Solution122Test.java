package leetcode.p122;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution122Test {

    @Test
    void maxProfit() {
        Solution122 underTest = new Solution122();
        Assertions.assertEquals(0, underTest.maxProfit(new int[]{}));
        Assertions.assertEquals(0, underTest.maxProfit(new int[]{42}));
        Assertions.assertEquals(42, underTest.maxProfit(new int[]{1, 43}));
        Assertions.assertEquals(0, underTest.maxProfit(new int[]{43, 1}));
        Assertions.assertEquals(1, underTest.maxProfit(new int[]{3, 2, 2, 3}));
        Assertions.assertEquals(7, underTest.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        Assertions.assertEquals(4, underTest.maxProfit(new int[]{1, 2, 3, 4, 5}));
        Assertions.assertEquals(0, underTest.maxProfit(new int[]{7, 6, 4, 3, 1}));
        Assertions.assertEquals(20, underTest.maxProfit(new int[]{5, 2, 3, 2, 6, 6, 2, 9, 1, 0, 7, 4, 5, 0}));
    }
}