package leetcode.p860;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution860Test {

    @Test
    void lemonadeChange() {
        Solution860 underTest = new Solution860();
        Assertions.assertTrue(underTest.lemonadeChange(new int[]{5, 5, 5, 10, 20}));
        Assertions.assertTrue(underTest.lemonadeChange(new int[]{5, 5, 10}));
        Assertions.assertFalse(underTest.lemonadeChange(new int[]{10, 10}));
        Assertions.assertFalse(underTest.lemonadeChange(new int[]{5, 5, 10, 10, 20}));
    }
}