package leetcode.p1143;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1143Test {

    @Test
    void shouldHandleBasicCase() {
        Solution1143 underTest = new Solution1143();
        assertEquals(3, underTest.longestCommonSubsequence("abcde", "ace"));
    }

    @Test
    void shouldHandleBasicCase2() {
        Solution1143 underTest = new Solution1143();
        assertEquals(1, underTest.longestCommonSubsequence("bl", "yby"));
    }

    @Test
    void shouldHandleBasicCase3() {
        Solution1143 underTest = new Solution1143();
        assertEquals(9, underTest.longestCommonSubsequence(
                "lcnqdmvsdopkvqvejijcdyxetuzonuhuzkpelmva",
                "bklgfivmpozinybwlovcnafqfybodkhabyrglsnen"
        ));
    }

}