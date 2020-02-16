package leetcode.p703;

import java.util.PriorityQueue;

/**
 * 703. Kth Largest Element in a Stream
 * Design a class to find the kth largest element in a stream. Note that it is the kth largest element in the sorted order,
 * not the kth distinct element.
 * <p>
 * Your KthLargest class will have a constructor which accepts an integer k and an integer array nums, which contains initial elements from the stream.
 * For each call to the method KthLargest.add, return the element representing the kth largest element in the stream.
 */
public class Solution703 {

    public static class KthLargest {
        private final PriorityQueue<Integer> queue;
        private final int k;

        public KthLargest(int k, int[] nums) {
            this.queue = new PriorityQueue<>(k + 1);
            this.k = k;
            for (int num : nums) {
                add(num);
            }
        }

        public int add(int val) {
            queue.add(val);
            if(queue.size() > k) {
                queue.poll();
            }
            return queue.peek();
        }
    }
}
