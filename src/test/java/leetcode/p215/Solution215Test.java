package leetcode.p215;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution215Test {

    @Test
    void findKthLargest() {
        Solution215 underTest = new Solution215();
        Assertions.assertEquals(5, underTest.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
        Assertions.assertEquals(4, underTest.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }
}