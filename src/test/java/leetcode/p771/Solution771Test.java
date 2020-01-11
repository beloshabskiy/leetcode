package leetcode.p771;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution771Test {

    @Test
    public void shouldHandleBasicCases() {
        Solution771 underTest = new Solution771();
        assertEquals(3, underTest.numJewelsInStones("aA", "aAAbbbb"));
        assertEquals(0, underTest.numJewelsInStones("z", "ZZ"));
    }

}