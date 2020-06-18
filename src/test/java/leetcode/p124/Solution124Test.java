package leetcode.p124;

import leetcode.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution124Test {

    @Test
    void shouldHandleBasicCase() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        Solution124 underTest = new Solution124();
        assertEquals(6, underTest.maxPathSum(root));
    }

    @Test
    void shouldHandleBasicCase2() {
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        Solution124 underTest = new Solution124();
        assertEquals(42, underTest.maxPathSum(root));
    }

}