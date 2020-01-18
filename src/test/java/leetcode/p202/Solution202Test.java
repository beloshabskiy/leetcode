package leetcode.p202;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution202Test {

    @Test
    void shouldReturnTrueForHappyNumbers() {
        Solution202 underTest = new Solution202();
        int[] happyNumbersLessThan40 = new int[]{1, 7, 10, 13, 19, 23, 28, 31, 32};

        List<Integer> foundHappyNumbers = new LinkedList<>();
        for (int n = 1; n < 40; n++) {
            if (underTest.isHappy(n)) {
                foundHappyNumbers.add(n);
            }
        }

        int[] actual = foundHappyNumbers.stream().mapToInt(Integer::intValue).toArray();
        assertArrayEquals(happyNumbersLessThan40, actual);
    }

}