package leetcode.p394;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution394Test {

    @Test
    void decodeString() {
        Solution394 underTest = new Solution394();
        Assertions.assertEquals("aaabcbc", underTest.decodeString("3[a]2[bc]"));
        Assertions.assertEquals("accaccacc", underTest.decodeString("3[a2[c]]"));
        Assertions.assertEquals("abcabccdcdcdef", underTest.decodeString("2[abc]3[cd]ef"));
        Assertions.assertEquals("abc", underTest.decodeString("abc"));
        Assertions.assertEquals("abc", underTest.decodeString("1[abc]"));
        Assertions.assertEquals("", underTest.decodeString("0[abc]"));
    }
}