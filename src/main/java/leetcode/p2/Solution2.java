package leetcode.p2;

/**
 * 2. Add Two Numbers
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class Solution2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int sum = l1.val + l2.val;
        int shift = sum / 10;

        ListNode result = new ListNode(sum % 10);
        ListNode next = result;

        ListNode first = l1.next;
        ListNode second = l2.next;

        while (first != null && second != null) {
            sum = first.val + second.val;
            next.next = new ListNode(sum % 10 + shift);
            next = next.next;
            shift = sum / 10;

            first = first.next;
            second = second.next;
        }

        while (first != null) {
            sum = first.val + shift;
            next.next = new ListNode(sum % 10);
            next = next.next;
            shift = sum / 10;

            first = first.next;
        }

        while (second != null) {
            sum = second.val + shift;
            next.next = new ListNode(sum % 10);
            next = next.next;
            shift = sum / 10;

            second = second.next;
        }

        if (shift != 0) {
            next.next = new ListNode(1);
        }

        return result;
    }

}
