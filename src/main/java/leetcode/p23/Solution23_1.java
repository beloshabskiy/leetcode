package leetcode.p23;

import leetcode.ListNode;

import java.util.*;

/**
 * 23. Merge k Sorted Lists
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
 */
public class Solution23_1 {

    public ListNode mergeKLists(ListNode[] lists) {
        List<ListNode> allNodes = new ArrayList<>();
        for (ListNode list : lists) {
            for (ListNode node = list; node != null; node = node.next) {
                allNodes.add(node);
            }
        }
        allNodes.sort(Comparator.comparingInt(node -> node.val));
        ListNode dummy = new ListNode(0);
        ListNode last = dummy;
        for (ListNode next : allNodes) {
            last.next = next;
            last = next;
        }
        return dummy.next;
    }
}
