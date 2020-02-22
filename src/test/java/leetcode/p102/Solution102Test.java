package leetcode.p102;

import leetcode.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class Solution102Test {

    @Test
    void levelOrder() {
        Solution102 underTest = new Solution102();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        final List<List<Integer>> result = underTest.levelOrder(root);
        Assertions.assertEquals(3, result.size());
        Assertions.assertEquals(1, result.get(0).size());
        Assertions.assertEquals(3, result.get(0).get(0));
        Assertions.assertEquals(2, result.get(1).size());
        Assertions.assertEquals(9, result.get(1).get(0));
        Assertions.assertEquals(20, result.get(1).get(1));
        Assertions.assertEquals(2, result.get(2).size());
        Assertions.assertEquals(15, result.get(2).get(0));
        Assertions.assertEquals(7, result.get(2).get(1));
    }
}