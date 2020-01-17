package leetcode.p23;

import leetcode.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution23Test {

    @Test
    void shouldHandleBasicCase() {
        ListNode first = new ListNode(1);
        first.next = new ListNode(4);
        first.next.next = new ListNode(5);

        ListNode second = new ListNode(1);
        second.next = new ListNode(3);
        second.next.next = new ListNode(4);

        ListNode third = new ListNode(2);
        third.next = new ListNode(6);

        ListNode[] input = {first, second, third};

        ListNode head = new Solution23_2().mergeKLists(input);

        assertEquals(1, head.val);
        assertEquals(1, head.next.val);
        assertEquals(2, head.next.next.val);
        assertEquals(3, head.next.next.next.val);
        assertEquals(4, head.next.next.next.next.val);
        assertEquals(4, head.next.next.next.next.next.val);
        assertEquals(5, head.next.next.next.next.next.next.val);
        assertEquals(6, head.next.next.next.next.next.next.next.val);
    }

}