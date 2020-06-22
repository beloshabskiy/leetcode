package leetcode.p179;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 179. Largest Number
 * Given a list of non negative integers, arrange them such that they form the largest number.
 */
public class Solution179 {

    public String largestNumber(int[] nums) {
        final String result = IntStream.of(nums)
                .mapToObj(Integer::toString)
                .sorted((left, right) -> (right + left).compareTo(left + right))
                .collect(Collectors.joining());
        return result.startsWith("0") ? "0" : result;
    }
}
