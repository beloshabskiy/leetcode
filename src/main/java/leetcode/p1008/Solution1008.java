package leetcode.p1008;

import leetcode.TreeNode;

/**
 * 1008. Construct Binary Search Tree from Preorder Traversal
 * Return the root node of a binary search tree that matches the given preorder traversal.
 * (Recall that a binary search tree is a binary tree where for every node, any descendant of node.left has a value < node.val, and any descendant of node.right has a value > node.val.  Also recall that a preorder traversal displays the value of the node first, then traverses node.left, then traverses node.right.)
 * It's guaranteed that for the given test cases there is always possible to find a binary search tree with the given requirements.
 * Constraints:
 * 1 <= preorder.length <= 100
 * 1 <= preorder[i] <= 10^8
 * The values of preorder are distinct.
 */
public class Solution1008 {

    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        insert(root, preorder, new IndexHolder(1), Integer.MIN_VALUE, Integer.MAX_VALUE);
        return root;
    }

    private static void insert(TreeNode node, int[] preorder, IndexHolder holder, int leftBound, int rightBound) {
        while (holder.index < preorder.length) {
            final int next = preorder[holder.index];
            if (next < node.val && next > leftBound) {
                TreeNode left = new TreeNode(next);
                node.left = left;
                insert(left, preorder, holder.increment(), leftBound, node.val);
            } else if (next > node.val && next < rightBound) {
                TreeNode right = new TreeNode(next);
                node.right = right;
                insert(right, preorder, holder.increment(), node.val, rightBound);
            } else {
                return;
            }
        }
    }

    private static class IndexHolder {
        private int index;

        public IndexHolder increment() {
            ++index;
            return this;
        }

        public IndexHolder(int initialValue) {
            this.index = initialValue;
        }
    }
}
