package leetcode.p347;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution347Test {

    @Test
    void topKFrequent() {
        Solution347 underTest = new Solution347();
        final List<Integer> actual = underTest.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
        Collections.sort(actual);
        Assertions.assertEquals(Arrays.asList(1, 2), actual);
    }

    @Test
    void topKFrequentSingleElement() {
        Solution347 underTest = new Solution347();
        Assertions.assertEquals(Collections.singletonList(1), underTest.topKFrequent(new int[]{1}, 1));
    }
}