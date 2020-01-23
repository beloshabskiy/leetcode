package leetcode.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution3Test {

    @Test
    void shouldHandleBasicCase() {
        Solution3 underTest = new Solution3();
        assertEquals(3, underTest.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(0, underTest.lengthOfLongestSubstring(""));
        assertEquals(0, underTest.lengthOfLongestSubstring(null));
        assertEquals(1, underTest.lengthOfLongestSubstring("bbbbb"));
    }

}