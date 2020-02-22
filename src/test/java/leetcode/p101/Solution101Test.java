package leetcode.p101;

import leetcode.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution101Test {

    @Test
    void isSymmetric() {
        Solution101 underTest = new Solution101();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        Assertions.assertTrue(underTest.isSymmetric(root));
    }

    @Test
    void isNotSymmetric() {
        Solution101 underTest = new Solution101();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);

        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(3);

        Assertions.assertFalse(underTest.isSymmetric(root));
    }
}