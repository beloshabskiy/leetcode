package leetcode.p75;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent,
 * with the colors in the order red, white and blue.
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 */
public class Solution75_2 implements Solution75 {

    @Override
    public void sortColors(int[] nums) {
        if (nums.length == 0) {
            return;
        }
        Map<Integer, Integer> firstIndexes = new HashMap<>();
        firstIndexes.put(nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            int previousNumber = nums[i - 1];
            int currentNumber = nums[i];
            int oldPosition = i;
            firstIndexes.putIfAbsent(currentNumber, i);
            while (currentNumber < previousNumber) {
                int positionToPut = firstIndexes.get(previousNumber);
                nums[positionToPut] = currentNumber;
                nums[oldPosition] = previousNumber;
                firstIndexes.compute(previousNumber, (k, v) -> ++v);
                if (firstIndexes.get(currentNumber) == oldPosition) {
                    firstIndexes.put(currentNumber, positionToPut);
                }
                if (positionToPut == 0) {
                    break;
                } else {
                    previousNumber = nums[positionToPut - 1];
                    oldPosition = positionToPut;
                }
            }
        }
    }
}
