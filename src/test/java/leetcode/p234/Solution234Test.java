package leetcode.p234;

import leetcode.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution234Test {

    @Test
    void shouldHandleBasicCase1() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        assertFalse(new Solution234_2().isPalindrome(node1));
    }

    @Test
    void shouldHandleBasicCase2() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        assertTrue(new Solution234_2().isPalindrome(node1));
    }

}