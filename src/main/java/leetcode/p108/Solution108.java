package leetcode.p108;

import leetcode.TreeNode;

/**
 * 108. Convert Sorted Array to Binary Search Tree
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees
 * of every node never differ by more than 1.
 */
public class Solution108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null) {
            return null;
        }
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int startInclusive, int endInclusive) {
        if (startInclusive > endInclusive) {
            return null;
        }

        int midIndex = (startInclusive + endInclusive) >>> 1;
        TreeNode root = new TreeNode(nums[midIndex]);
        root.left = sortedArrayToBST(nums, startInclusive, midIndex - 1);
        root.right = sortedArrayToBST(nums, midIndex + 1, endInclusive);
        return root;
    }
}
