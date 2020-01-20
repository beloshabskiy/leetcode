package leetcode.p31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution31Test {

    @Test
    void shouldHandleBasicCases() {
        Solution31 underTest = new Solution31();
        assertTrue(underTest.isValid("()"));
        assertTrue(underTest.isValid("()[]{}"));
        assertFalse(underTest.isValid("(]"));
        assertFalse(underTest.isValid("([)]"));
        assertTrue(underTest.isValid("{[]}"));
    }

}