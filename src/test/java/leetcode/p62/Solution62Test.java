package leetcode.p62;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution62Test {

    @Test
    void uniquePaths() {
        Solution62 underTest = new Solution62();
        Assertions.assertEquals(1, underTest.uniquePaths(1, 1));
        Assertions.assertEquals(3, underTest.uniquePaths(3, 2));
        Assertions.assertEquals(28, underTest.uniquePaths(7, 3));
    }
}