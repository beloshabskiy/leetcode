package leetcode.p100;

import leetcode.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution100Test {

    @Test
    void isSameTree() {
        Solution100 underTest = new Solution100();

        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        Assertions.assertTrue(underTest.isSameTree(p, q));
    }

    @Test
    void isNotSameTree() {
        Solution100 underTest = new Solution100();

        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);

        TreeNode q = new TreeNode(1);
        q.right = new TreeNode(2);

        Assertions.assertFalse(underTest.isSameTree(p, q));
    }
}