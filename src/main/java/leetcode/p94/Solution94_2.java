package leetcode.p94;

import leetcode.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * 94. Binary Tree Inorder Traversal
 * Given a binary tree, return the inorder traversal of its nodes' values.
 */
public class Solution94_2 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode next = root;
        while (next != null || !stack.isEmpty()) {
            while (next != null) {
                stack.push(next);
                next = next.left;
            }
            next = stack.pop();
            result.add(next.val);
            next = next.right;
        }
        return result;
    }

}
