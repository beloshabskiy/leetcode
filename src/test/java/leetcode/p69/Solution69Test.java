package leetcode.p69;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.stream.IntStream;

class Solution69Test {

    @Test
    void mySqrt() {

        Assertions.assertAll(
                IntStream.of(0, 1, 2, 3, 4, 5, 8, 9, 15, 16, 17, Integer.MAX_VALUE - 1, Integer.MAX_VALUE)
                        .mapToObj(i -> (Executable) () -> Assertions.assertEquals((int) Math.sqrt(i), new Solution69().mySqrt(i)))
        );

    }
}