package leetcode.p33;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution33Test {

    @Test
    void shouldHandleBasicScenario() {
        Solution33 underTest = new Solution33();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        Assertions.assertEquals(4, underTest.search(nums, 0));
    }

    @Test
    void shouldHandleSingleElementArrayScenario() {
        Solution33 underTest = new Solution33();
        int[] nums = {1};
        Assertions.assertEquals(-1, underTest.search(nums, 0));
    }

    @Test
    void shouldHandleTwoElementsArrayScenario() {
        Solution33 underTest = new Solution33();
        int[] nums = {3, 1};
        Assertions.assertEquals(1, underTest.search(nums, 1));
    }

}