package leetcode.p2;

import leetcode.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    @Test
    void shouldHandleBasicCase1() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = new Solution2().addTwoNumbers(l1, l2);

        assertEquals(7, result.val);
        assertEquals(0, result.next.val);
        assertEquals(8, result.next.next.val);
    }

    @Test
    void shouldHandleBasicCase2() {
        ListNode l1 = new ListNode(1);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);

        ListNode result = new Solution2().addTwoNumbers(l1, l2);

        assertEquals(0, result.val);
        assertEquals(0, result.next.val);
        assertEquals(0, result.next.next.val);
        assertEquals(1, result.next.next.next.val);
    }

}