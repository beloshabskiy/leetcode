package leetcode.p98;

import leetcode.TreeNode;

/**
 * 98. Validate Binary Search Tree
 * Assume a BST is defined as follows:
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 */
public class Solution98 {

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    private boolean isValidBST(TreeNode root, Integer min, Integer max) {
        if (root == null) {
            return true;
        } else if (min != null && root.val <= min) {
            return false;
        } else if (max != null && root.val >= max) {
            return false;
        } else {
            return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
        }
    }
}
