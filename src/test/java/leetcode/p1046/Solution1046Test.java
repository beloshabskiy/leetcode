package leetcode.p1046;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1046Test {

    @Test
    void lastStoneWeight() {
        Solution1046 underTest = new Solution1046();
        Assertions.assertEquals(2, underTest.lastStoneWeight(new int[]{2}));
        Assertions.assertEquals(6, underTest.lastStoneWeight(new int[]{9, 3}));
        Assertions.assertEquals(1, underTest.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
    }
}