package leetcode.p23;

import leetcode.ListNode;

/**
 * 23. Merge k Sorted Lists
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
 */
public class Solution23_2 {

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(42);
        ListNode last = dummy;

        while (true) {
            int indexOfSmallestHead = -1;
            ListNode chosenNode = null;
            for (int i = 0; i < lists.length; i++) {
                ListNode next = lists[i];
                if (next != null) {
                    if (chosenNode == null || chosenNode.val > next.val) {
                        chosenNode = next;
                        indexOfSmallestHead = i;
                    }
                }
            }
            if (chosenNode != null) {
                last.next = chosenNode;
                last = last.next;
                lists[indexOfSmallestHead] = chosenNode.next;
            } else {
                last.next = null;
                return dummy.next;
            }
        }
    }
}
