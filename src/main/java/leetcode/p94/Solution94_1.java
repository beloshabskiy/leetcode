package leetcode.p94;

import leetcode.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * 94. Binary Tree Inorder Traversal
 * Given a binary tree, return the inorder traversal of its nodes' values.
 */
public class Solution94_1 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        visit(root, result);
        return result;
    }

    private void visit(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        visit(node.left, result);
        result.add(node.val);
        visit(node.right, result);
    }
}
