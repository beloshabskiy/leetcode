package leetcode.p19;

import leetcode.ListNode;
import leetcode.p2.Solution2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution19Test {

    @Test
    void shouldHandleBasicCase() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode afterRemoval = new Solution19().removeNthFromEnd(head, 2);
        assertEquals(1, afterRemoval.val);
        assertEquals(2, afterRemoval.next.val);
        assertEquals(3, afterRemoval.next.next.val);
        assertEquals(5, afterRemoval.next.next.next.val);
    }

    @Test
    void shouldHandleSingleNodeList() {
        ListNode head = new ListNode(1);
        assertNull(new Solution19().removeNthFromEnd(head, 1));
    }

    @Test
    void shouldHandleHeadRemoval() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode afterRemoval = new Solution19().removeNthFromEnd(head, 5);
        assertEquals(2, afterRemoval.val);
        assertEquals(3, afterRemoval.next.val);
        assertEquals(4, afterRemoval.next.next.val);
        assertEquals(5, afterRemoval.next.next.next.val);

    }

}