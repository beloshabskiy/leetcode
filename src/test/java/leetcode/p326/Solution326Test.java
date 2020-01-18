package leetcode.p326;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class Solution326Test {

    @Test
    public void shouldHandleBasicCase() {
        Solution326 underTest = new Solution326();
        int[] powers = {1, 3, 9, 27, 81, 243};
        int[] notPowers = {0, 2, 4, 12, 36, -1};

        assertAll(
                IntStream.of(powers).mapToObj(number -> () -> assertTrue(underTest.isPowerOfThree(number), number + " is a power of 3"))
        );

        assertAll(
                IntStream.of(notPowers).mapToObj(number -> () -> assertFalse(underTest.isPowerOfThree(number), number + " isn't a power of 3"))
        );
    }

}