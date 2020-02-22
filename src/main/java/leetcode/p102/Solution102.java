package leetcode.p102;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 102. Binary Tree Level Order Traversal
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 */
public class Solution102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {
            List<TreeNode> tmp = new ArrayList<>(nodes);
            nodes.clear();
            List<Integer> nextResult = new ArrayList<>();
            for (TreeNode node : tmp) {
                nextResult.add(node.val);
                if (node.left != null) {
                    nodes.add(node.left);
                }
                if (node.right != null) {
                    nodes.add(node.right);
                }
            }
            result.add(nextResult);
        }
        return result;
    }
}
