package leetcode.p281;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution281Test {

    @Test
    void zigzagIterator() {
        Solution281.ZigzagIterator underTest = new Solution281.ZigzagIterator(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4, 5, 6)
        );
        List<Integer> actual = new ArrayList<>();
        while (underTest.hasNext()) {
            actual.add(underTest.next());
        }
        Assertions.assertEquals(actual, Arrays.asList(1, 3, 2, 4, 5, 6));
    }

    @Test
    void zigzagIterator2() {
        Solution281.ZigzagIterator underTest = new Solution281.ZigzagIterator(
                Collections.emptyList(),
                Collections.emptyList()
        );
        List<Integer> actual = new ArrayList<>();
        while (underTest.hasNext()) {
            actual.add(underTest.next());
        }
        Assertions.assertEquals(actual, Collections.emptyList());
    }

}