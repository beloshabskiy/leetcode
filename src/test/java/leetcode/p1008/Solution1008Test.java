package leetcode.p1008;

import leetcode.TreeNode;
import org.junit.jupiter.api.Test;

class Solution1008Test {

    @Test
    void shouldHandleBasicCase() {
        int[] input = {8, 5, 1, 7, 10, 12};
        Solution1008 underTest = new Solution1008();
        final TreeNode treeNode = underTest.bstFromPreorder(input);
        System.out.println();
    }

}