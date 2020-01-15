package leetcode.p234;

/**
 * 234. Palindrome Linked List
 * Given a singly linked list, determine if it is a palindrome.
 */
public class Solution234_2 {

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode previous = null;
        ListNode temp;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            temp = slow;
            slow = slow.next;
            temp.next = previous;
            previous = temp;
        }

        if (fast != null) {
            slow = slow.next;
        }

        while (previous != null && slow != null) {
            if (previous.val != slow.val) {
                return false;
            }
            previous = previous.next;
            slow = slow.next;
        }

        return true;
    }
}
