package leetcode.p344;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution344Test {

    @Test
    void shouldHandleBasicCase() {
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        new Solution344().reverseString(input);
        assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, input);
    }

    @Test
    void shouldEmptyArray() {
        char[] input = {};
        new Solution344().reverseString(input);
        assertArrayEquals(new char[0], input);
    }

    @Test
    void shouldHandleEvenSymbolsString() {
        char[] input = {'1', '2', '3', '4'};
        new Solution344().reverseString(input);
        assertArrayEquals(new char[]{'4', '3', '2', '1'}, input);
    }

    @Test
    void shouldHandleOddSymbolsString() {
        char[] input = {'1', '2', '3', '4', '5'};
        new Solution344().reverseString(input);
        assertArrayEquals(new char[]{'5', '4', '3', '2', '1'}, input);
    }

}