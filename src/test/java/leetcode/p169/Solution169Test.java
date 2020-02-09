package leetcode.p169;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution169Test {

    @Test
    void shouldHandleBasicCase() {
        Solution169 underTest = new Solution169();
        Assertions.assertEquals(3, underTest.majorityElement(new int[]{3, 2, 3}));
        Assertions.assertEquals(2, underTest.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));

        Assertions.assertEquals(3, underTest.majorityElement2(new int[]{3, 2, 3}));
        Assertions.assertEquals(2, underTest.majorityElement2(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

}