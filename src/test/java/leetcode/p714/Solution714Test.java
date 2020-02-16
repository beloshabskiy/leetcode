package leetcode.p714;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution714Test {

    @Test
    void maxProfit() {
        Solution714 underTest = new Solution714();
        Assertions.assertEquals(8, underTest.maxProfit(new int[]{1, 3, 2, 8, 4, 9}, 2));
        Assertions.assertEquals(12, underTest.maxProfit(new int[]{1, 8, 6, 15}, 2));
    }

    @Test
    void maxProfitWithNoFee() {
        Solution714 underTest = new Solution714();
        Assertions.assertEquals(0, underTest.maxProfit(new int[]{}, 0));
        Assertions.assertEquals(0, underTest.maxProfit(new int[]{42}, 0));
        Assertions.assertEquals(42, underTest.maxProfit(new int[]{1, 43, 0}, 0));
        Assertions.assertEquals(0, underTest.maxProfit(new int[]{43, 1}, 0));
        Assertions.assertEquals(1, underTest.maxProfit(new int[]{3, 2, 2, 3}, 0));
        Assertions.assertEquals(7, underTest.maxProfit(new int[]{7, 1, 5, 3, 6, 4}, 0));
        Assertions.assertEquals(4, underTest.maxProfit(new int[]{1, 2, 3, 4, 5}, 0));
        Assertions.assertEquals(0, underTest.maxProfit(new int[]{7, 6, 4, 3, 1}, 0));
        Assertions.assertEquals(20, underTest.maxProfit(new int[]{5, 2, 3, 2, 6, 6, 2, 9, 1, 0, 7, 4, 5, 0}, 0));
    }
}