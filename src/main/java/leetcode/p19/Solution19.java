package leetcode.p19;

import leetcode.ListNode;

/**
 * 19. Remove Nth Node From End of List
 * Given a linked list, remove the n-th node from the end of list and return its head.
 */
public class Solution19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }

        ListNode next = head;
        for (int i = 0; i < n - 1; i++) {
            next = next.next;
        }

        if (next.next == null) {
            return head.next;
        }

        ListNode before = head;
        next = next.next;

        while (next.next != null) {
            next = next.next;
            before = before.next;
        }

        before.next = before.next.next;
        return head;
    }

}
