package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution334Test {

    @Test
    void increasingTriplet() {
        Solution334 underTest = new Solution334();
        assertTrue(underTest.increasingTriplet(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void increasingTriplet2() {
        Solution334 underTest = new Solution334();
        assertTrue(underTest.increasingTriplet(new int[]{7, 8, 2, 9}));
    }

    @Test
    void increasingTriplet3() {
        Solution334 underTest = new Solution334();
        assertFalse(underTest.increasingTriplet(new int[]{5, 4, 3, 2, 1}));
    }

    @Test
    void increasingTriplet4() {
        Solution334 underTest = new Solution334();
        assertFalse(underTest.increasingTriplet(new int[]{1, 2, 2, 2, 2}));
    }

    @Test
    void increasingTriplet5() {
        Solution334 underTest = new Solution334();
        assertTrue(underTest.increasingTriplet(new int[]{1, 2, 2, 2, 2, 3}));
    }

    @Test
    void increasingTriplet6() {
        Solution334 underTest = new Solution334();
        assertTrue(underTest.increasingTriplet(new int[]{3, 2, 4, 2, 5, 2}));
    }

    @Test
    void increasingTriplet7() {
        Solution334 underTest = new Solution334();
        assertFalse(underTest.increasingTriplet(new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1, 2}));
    }
}