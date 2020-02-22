package leetcode.p191;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution191Test {

    @Test
    void hammingWeight() {
        Solution191 underTest = new Solution191();
        Assertions.assertEquals(0, underTest.hammingWeight(0));
        Assertions.assertEquals(1, underTest.hammingWeight(1));
        Assertions.assertEquals(1, underTest.hammingWeight(2));
        Assertions.assertEquals(2, underTest.hammingWeight(3));
        Assertions.assertEquals(3, underTest.hammingWeight(7));
        Assertions.assertEquals(31, underTest.hammingWeight(Integer.MAX_VALUE));
        Assertions.assertEquals(1, underTest.hammingWeight(Integer.MIN_VALUE));
        Assertions.assertEquals(32, underTest.hammingWeight(-1));
    }
}