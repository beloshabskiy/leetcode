package leetcode.p206;

import leetcode.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution206Test {

    @Test
    void shouldHandleBasicCase() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        new Solution206().reverseList(node1);
        Assertions.assertEquals(node4, node5.next);
        Assertions.assertEquals(node3, node4.next);
        Assertions.assertEquals(node2, node3.next);
        Assertions.assertEquals(node1, node2.next);
        Assertions.assertNull(node1.next);
    }

}