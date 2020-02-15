package leetcode.p155;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution155Test {

    @Test
    void minStack() {
        Solution155.MinStack underTest = new Solution155.MinStack();
        underTest.push(-2);
        underTest.push(0);
        underTest.push(-3);
        assertEquals(-3, underTest.getMin());
        underTest.pop();
        assertEquals(0, underTest.top());
        assertEquals(-2, underTest.getMin());
    }

}