package leetcode.p75;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution75Test {

    @ParameterizedTest
    @MethodSource("solutions")
    public void shouldHandleBasicCase(Solution75 underTest) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        underTest.sortColors(nums);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums);
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void shouldHandleCaseWithNoZeros(Solution75 underTest) {
        int[] nums = {2, 2, 1, 1};
        underTest.sortColors(nums);
        assertArrayEquals(new int[]{1, 1, 2, 2}, nums);
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void shouldHandleCaseWithNoOnes(Solution75 underTest) {
        int[] nums = {2, 0, 2, 0};
        underTest.sortColors(nums);
        assertArrayEquals(new int[]{0, 0, 2, 2}, nums);
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void shouldHandleCaseWithNoTwos(Solution75 underTest) {
        int[] nums = {0, 1, 1, 0};
        underTest.sortColors(nums);
        assertArrayEquals(new int[]{0, 0, 1, 1}, nums);
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void shouldHandleEmptyArray(Solution75 underTest) {
        int[] nums = {};
        underTest.sortColors(nums);
        assertArrayEquals(new int[]{}, nums);
    }

    public static Stream<Solution75> solutions() {
        return Stream.of(new Solution75_1(), new Solution75_2(), new Solution75_3());
    }

}