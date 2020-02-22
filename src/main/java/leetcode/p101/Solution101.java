package leetcode.p101;

import leetcode.TreeNode;

/**
 * 101. Symmetric Tree
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 */
public class Solution101 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            return areSymmetric(root.left, root.right);
        }
    }

    private boolean areSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left == null || right == null) {
            return false;
        } else {
            return left.val == right.val
                    && areSymmetric(left.left, right.right)
                    && areSymmetric(left.right, right.left);
        }
    }
}
