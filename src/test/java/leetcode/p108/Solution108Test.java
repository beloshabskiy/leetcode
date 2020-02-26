package leetcode.p108;

import leetcode.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution108Test {

    @Test
    void sortedArrayToBST() {
        Solution108 underTest = new Solution108();
        final TreeNode root = underTest.sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});

        Assertions.assertEquals(0, root.val);
        Assertions.assertEquals(-10, root.left.val);
        Assertions.assertNull(root.left.left);
        Assertions.assertEquals(-3, root.left.right.val);
        Assertions.assertEquals(5, root.right.val);
        Assertions.assertEquals(9, root.right.right.val);
        Assertions.assertNull(root.right.left);
    }

    @Test
    void nullToBST() {
        Solution108 underTest = new Solution108();
        Assertions.assertNull(underTest.sortedArrayToBST(null));
    }

    @Test
    void singleNodeToBST() {
        Solution108 underTest = new Solution108();
        final TreeNode root = underTest.sortedArrayToBST(new int[]{42});
        Assertions.assertEquals(42, root.val);
        Assertions.assertNull(root.left);
        Assertions.assertNull(root.right);
    }

}