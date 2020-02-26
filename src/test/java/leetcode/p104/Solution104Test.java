package leetcode.p104;

import leetcode.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution104Test {

    @Test
    void maxDepth0() {
        Solution104 underTest = new Solution104();
        Assertions.assertEquals(0, underTest.maxDepth(null));
    }

    @Test
    void maxDepth1() {
        Solution104 underTest = new Solution104();
        Assertions.assertEquals(1, underTest.maxDepth(new TreeNode(42)));
    }

    @Test
    void maxDepth3() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Solution104 underTest = new Solution104();
        Assertions.assertEquals(3, underTest.maxDepth(root));
    }
}