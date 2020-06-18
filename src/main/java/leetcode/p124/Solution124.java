package leetcode.p124;

import leetcode.TreeNode;

import static java.lang.Math.max;

/**
 * 124. Binary Tree Maximum Path Sum
 * Given a non-empty binary tree, find the maximum path sum.
 * <p>
 * For this problem, a path is defined as any sequence of nodes from some starting node to any node in the tree along the parent-child connections.
 * The path must contain at least one node and does not need to go through the root.
 */
public class Solution124 {

    public int maxPathSum(TreeNode root) {
        return calculate(root).bestPath;
    }

    private static Data calculate(TreeNode node) {
        if (node == null) {
            return null;
        }

        final Data left = calculate(node.left);
        final Data right = calculate(node.right);
        if (left == null && right == null) {
            return new Data(node.val, node.val);
        }
        if (left == null || right == null) {
            final Data notNull = left == null ? right : left;
            return new Data(
                    max(notNull.currentBranch + node.val, node.val),
                    max(notNull.bestPath, max(node.val, notNull.currentBranch + node.val))
            );
        } else {
            int currentBranchChildren = max(left.currentBranch, right.currentBranch);
            int bestPathChildren = max(left.bestPath, right.bestPath);

            int pathWithThisNode = max(0, left.currentBranch) + max(0, right.currentBranch) + node.val;

            return new Data(
                    max(node.val, currentBranchChildren + node.val),
                    max(pathWithThisNode, bestPathChildren)
            );
        }

    }

    private static class Data {
        private final int currentBranch;
        private final int bestPath;

        public Data(int currentBranch, int bestPath) {
            this.currentBranch = currentBranch;
            this.bestPath = bestPath;
        }
    }
}
