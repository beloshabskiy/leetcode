package leetcode.p98;

import leetcode.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution98Test {

    @Test
    void isValidBST() {
        Solution98 underTest = new Solution98();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        Assertions.assertTrue(underTest.isValidBST(root));
    }

    @Test
    void isNotValidBST() {
        Solution98 underTest = new Solution98();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(6);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(7);
        Assertions.assertFalse(underTest.isValidBST(root));
    }

    @Test
    void isNotValidBST2() {
        Solution98 underTest = new Solution98();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(5);
        Assertions.assertFalse(underTest.isValidBST(root));
    }
}