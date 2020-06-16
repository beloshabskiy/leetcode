package leetcode;

import leetcode.p162.Solution162;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution162Test {

    @Test
    void shouldHandleBasicCase1() {
        Solution162 underTest = new Solution162();
        final int peakElement = underTest.findPeakElement(new int[]{1, 2, 3, 1});
        Assertions.assertEquals(2, peakElement);
    }

    @Test
    void shouldHandleBasicCase2() {
        Solution162 underTest = new Solution162();
        final int peakElement = underTest.findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4});
        Assertions.assertTrue(peakElement == 1 || peakElement == 5);
    }

    @Test
    void shouldHandleAscSortedArray() {
        Solution162 underTest = new Solution162();
        final int peakElement = underTest.findPeakElement(new int[]{1, 2, 3, 4});
        Assertions.assertEquals(3, peakElement);
    }

    @Test
    void shouldHandleDescSortedArray() {
        Solution162 underTest = new Solution162();
        final int peakElement = underTest.findPeakElement(new int[]{4, 3, 2, 1, 0});
        Assertions.assertEquals(0, peakElement);
    }

    @Test
    void shouldHandleSingleElementArray() {
        Solution162 underTest = new Solution162();
        final int peakElement = underTest.findPeakElement(new int[]{4});
        Assertions.assertEquals(0, peakElement);
    }
}