package leetcode.p1287;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1287Test {
    private final Solution1287 underTest = new Solution1287();

    @Test
    void shouldHandleBasicCase() {
        assertEquals(6, underTest.findSpecialInteger(new int[]{1, 2, 2, 6, 6, 6, 7, 10}));
    }

    @Test
    void shouldHandleArrayWith1Element() {
        assertEquals(6, underTest.findSpecialInteger(new int[]{6}));
    }

    @Test
    void shouldHandleArrayWith2Elements() {
        assertEquals(6, underTest.findSpecialInteger(new int[]{6, 6}));
    }

    @Test
    void shouldHandleArrayWith3Elements() {
        assertEquals(6, underTest.findSpecialInteger(new int[]{6, 6, 6}));
    }

}