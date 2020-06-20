package leetcode.p221;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution221Test {

    @Test
    void shouldHandleBasicCase() {
        char[][] input = {
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };

        Solution221 underTest = new Solution221();
        Assertions.assertEquals(4, underTest.maximalSquare(input));
    }

}