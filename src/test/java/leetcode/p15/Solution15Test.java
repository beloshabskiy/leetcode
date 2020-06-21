package leetcode.p15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Solution15Test {

    @Test
    void shouldHandleBasicCase() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        Solution15 underTest = new Solution15();
        List<String> result = underTest.threeSum(nums).stream().map(l -> {
            List<Integer> temp = new ArrayList<>(l);
            temp.sort(Integer::compareTo);
            return temp.stream().map(Object::toString).collect(Collectors.joining(","));
        }).sorted().collect(Collectors.toList());

        Assertions.assertEquals(2, result.size());
        Assertions.assertEquals("-1,-1,2", result.get(0));
        Assertions.assertEquals("-1,0,1", result.get(1));
    }

    @Test
    void shouldHandleBasicCase2() {
        int[] nums = {0, -1, 0, 1, 2, 0, -1, -4, 0};
        Solution15 underTest = new Solution15();
        List<String> result = underTest.threeSum(nums).stream().map(l -> {
            List<Integer> temp = new ArrayList<>(l);
            temp.sort(Integer::compareTo);
            return temp.stream().map(Object::toString).collect(Collectors.joining(","));
        }).sorted().collect(Collectors.toList());

        Assertions.assertEquals(3, result.size());
        Assertions.assertEquals("-1,-1,2", result.get(0));
        Assertions.assertEquals("-1,0,1", result.get(1));
        Assertions.assertEquals("0,0,0", result.get(2));
    }

    @Test
    void shouldHandleBasicCase3() {
        int[] nums = {};
        Solution15 underTest = new Solution15();
        List<String> result = underTest.threeSum(nums).stream().map(l -> {
            List<Integer> temp = new ArrayList<>(l);
            temp.sort(Integer::compareTo);
            return temp.stream().map(Object::toString).collect(Collectors.joining(","));
        }).sorted().collect(Collectors.toList());

        Assertions.assertTrue(result.isEmpty());
    }

    @Test
    void shouldHandleBasicCase4() {
        int[] nums = {0, 0, 0};
        Solution15 underTest = new Solution15();
        List<String> result = underTest.threeSum(nums).stream().map(l -> {
            List<Integer> temp = new ArrayList<>(l);
            temp.sort(Integer::compareTo);
            return temp.stream().map(Object::toString).collect(Collectors.joining(","));
        }).sorted().collect(Collectors.toList());

        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals("0,0,0", result.get(0));
    }

}