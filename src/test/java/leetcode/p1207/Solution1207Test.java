package leetcode.p1207;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution1207Test {

    @Test
    void shouldHandleBasicCases() {
        Solution1207 underTest = new Solution1207();
        assertTrue(underTest.uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
        assertFalse(underTest.uniqueOccurrences(new int[]{1, 2}));
        assertTrue(underTest.uniqueOccurrences(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0}));
    }

}