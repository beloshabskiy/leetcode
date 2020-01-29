package leetcode.p94;

import leetcode.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class Solution94Test {

    @Test
    void shouldHandleBasicCase() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        Solution94_2 underTest = new Solution94_2();
        final List<Integer> result = underTest.inorderTraversal(root);

        assertIterableEquals(result, Arrays.asList(1, 3, 2));
    }

}