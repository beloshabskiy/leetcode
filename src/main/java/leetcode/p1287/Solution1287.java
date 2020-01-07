package leetcode.p1287;

/**
 * 1287. Element Appearing More Than 25% In Sorted Array
 * Given an integer array sorted in non-decreasing order, there is exactly one integer in the array that occurs more than 25% of the time.
 * Return that integer.
 */
public class Solution1287 {

    public int findSpecialInteger(int[] arr) {
        int limit = arr.length / 4;
        int nextNumber = arr[0];
        int nextNumberCount = 0;

        for (int i : arr) {
            if (i == nextNumber) {
                if (++nextNumberCount > limit) {
                    return nextNumber;
                }
            } else {
                nextNumber = i;
                nextNumberCount = 1;
            }
        }

        throw new IllegalStateException("Invalid input: there is no such number");
    }
}
