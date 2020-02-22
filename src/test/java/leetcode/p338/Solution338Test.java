package leetcode.p338;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution338Test {

    @Test
    void countBits() {
        Solution338 underTest = new Solution338();
        Assertions.assertArrayEquals(new int[]{0}, underTest.countBits(0));
        Assertions.assertArrayEquals(new int[]{0, 1, 1}, underTest.countBits(2));
        Assertions.assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, underTest.countBits(5));
    }
}