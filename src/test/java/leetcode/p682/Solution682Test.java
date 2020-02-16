package leetcode.p682;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution682Test {

    @Test
    void calPoints() {
        Solution682 underTest = new Solution682();
        Assertions.assertEquals(30, underTest.calPoints(new String[]{"5", "2", "C", "D", "+"}));
        Assertions.assertEquals(27, underTest.calPoints(new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"}));
    }
}