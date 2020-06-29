package leetcode.p937;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution937Test {

    @Test
    void reorderLogFiles() {
        String[] input = {"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"};
        Solution937 underTest = new Solution937();

        Assertions.assertArrayEquals(
                new String[]{"let1 art can", "let3 art zero", "let2 own kit dig", "dig1 8 1 5 1", "dig2 3 6"},
                underTest.reorderLogFiles(input)
        );
    }

}