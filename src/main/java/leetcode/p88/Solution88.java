package leetcode.p88;

/**
 * 88. Merge Sorted Array
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * Note:
 * - The number of elements initialized in nums1 and nums2 are m and n respectively.
 * - You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 */
public class Solution88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mPointer = m - 1;
        int nPointer = n - 1;
        int totalPointer = m + n - 1;

        while (nPointer >= 0) {
            if ((mPointer >= 0) && (nums1[mPointer] > nums2[nPointer])) {
                nums1[totalPointer--] = nums1[mPointer--];
            } else {
                nums1[totalPointer--] = nums2[nPointer--];
            }
        }
    }
}
