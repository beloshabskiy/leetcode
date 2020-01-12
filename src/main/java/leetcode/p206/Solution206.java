package leetcode.p206;

/**
 * 206. Reverse Linked List
 * Reverse a singly linked list.
 */
public class Solution206 {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode previous = null;
        ListNode current = head;
        ListNode next = head.next;

        while (next != null) {
            current.next = previous;
            previous = current;
            current = next;
            next = current.next;
        }
        current.next = previous;
        return current;
    }

}


