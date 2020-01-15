package leetcode.p234;

import java.util.LinkedList;

/**
 * 234. Palindrome Linked List
 * Given a singly linked list, determine if it is a palindrome.
 */
public class Solution234 {

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        LinkedList<ListNode> stack = new LinkedList<>();
        ListNode next = head;
        while (next != null) {
            stack.push(next);
            next = next.next;
        }

        next = head;
        ListNode nextFromEnd = stack.pop();
        while (next != null && nextFromEnd != null) {
            if (next.val != nextFromEnd.val) {
                return false;
            }
            next = next.next;
            nextFromEnd = stack.pollFirst();
        }
        return true;
    }
}
