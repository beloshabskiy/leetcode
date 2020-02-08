package leetcode.p50;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution50Test {

    @Test
    void pow() {
        assertEquals(1.0, Solution50.myPow(1, 0));
        assertEquals(1.0, Solution50.myPow(1, 1));
        assertEquals(1.0, Solution50.myPow(1, 2));
        assertEquals(1.0, Solution50.myPow(1, 3));

        assertEquals(1.0, Solution50.myPow(2, 0));
        assertEquals(2.0, Solution50.myPow(2, 1));
        assertEquals(4.0, Solution50.myPow(2, 2));
        assertEquals(128.0, Solution50.myPow(2, 7));
        assertEquals(512.0, Solution50.myPow(2, 9));

        assertEquals(1.0, Solution50.myPow(-2, 0));
        assertEquals(-2.0, Solution50.myPow(-2, 1));
        assertEquals(4.0, Solution50.myPow(-2, 2));
        assertEquals(-128.0, Solution50.myPow(-2, 7));
        assertEquals(-512.0, Solution50.myPow(-2, 9));

        assertEquals(1.0, Solution50.myPow(1, -1));
        assertEquals(1.0, Solution50.myPow(1, -2));
        assertEquals(1.0, Solution50.myPow(1, -3));

        assertEquals(0.5, Solution50.myPow(2, -1));
        assertEquals(0.25, Solution50.myPow(2, -2));
        assertEquals(0.125, Solution50.myPow(2, -3));

        assertEquals(-0.5, Solution50.myPow(-2, -1));
        assertEquals(0.25, Solution50.myPow(-2, -2));
        assertEquals(-0.125, Solution50.myPow(-2, -3));
//
        assertEquals(0.0, Solution50.myPow(0.00001, 2147483647));
        assertEquals(1.0, Solution50.myPow(1, -2147483648));
    }
}