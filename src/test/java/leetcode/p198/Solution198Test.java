package leetcode.p198;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution198Test {

    @Test
    void rob() {
        Solution198 underTest = new Solution198();
        Assertions.assertEquals(0, underTest.rob(new int[0]));
        Assertions.assertEquals(3, underTest.rob(new int[]{3}));
        Assertions.assertEquals(4, underTest.rob(new int[]{1, 2, 3, 1}));
        Assertions.assertEquals(12, underTest.rob(new int[]{2, 7, 9, 3, 1}));
    }
}