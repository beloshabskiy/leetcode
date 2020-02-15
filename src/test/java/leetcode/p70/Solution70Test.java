package leetcode.p70;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution70Test {

    @Test
    void climbStairs() {
        Solution70 underTest = new Solution70();
        Assertions.assertEquals(1, underTest.climbStairs(1));
        Assertions.assertEquals(2, underTest.climbStairs(2));
        Assertions.assertEquals(3, underTest.climbStairs(3));
        Assertions.assertEquals(5, underTest.climbStairs(4));
    }
}