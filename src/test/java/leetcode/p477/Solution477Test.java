package leetcode.p477;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution477Test {

    @Test
    void totalHammingDistance() {
        Solution477_2 underTest = new Solution477_2();
        Assertions.assertEquals(0, underTest.totalHammingDistance(new int[]{128, 128}));
        Assertions.assertEquals(6, underTest.totalHammingDistance(new int[]{4, 14, 2}));
        Assertions.assertEquals(12, underTest.totalHammingDistance(new int[]{1, 2, 4, 8}));
    }
}