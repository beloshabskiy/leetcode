package leetcode.p281;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 281. Zigzag Iterator
 * Given two 1d vectors, implement an iterator to return their elements alternately.
 */
public class Solution281 {

    public static class ZigzagIterator {
        private Node node;

        public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
            List<Node> nodes = Stream.of(v1, v2)
                    .filter(it -> it != null && !it.isEmpty())
                    .map(Node::new)
                    .collect(Collectors.toList());
            if (nodes.isEmpty()) {
                node = null;
            } else if (nodes.size() == 1) {
                node = nodes.get(0);
            } else {
                node = nodes.get(0);
                Node second = nodes.get(1);
                node.prev = second;
                node.next = second;
                second.prev = node;
                second.next = node;
            }

        }

        public int next() {
            int result = node.list.get(node.offset++);
            if (node.list.size() == node.offset) {
                if (node.next == null) {
                    node = null;
                } else {
                    Node prev = node.prev;
                    Node next = node.next;
                    if (prev == next) {
                        node = next;
                        node.next = null;
                        node.prev = null;
                    } else {
                        prev.next = next;
                        next.prev = prev;
                    }
                }
            }
            if (node != null && node.next != null) {
                node = node.next;
            }
            return result;

        }

        public boolean hasNext() {
            return node != null;
        }

        private static class Node {
            Node next;
            Node prev;
            List<Integer> list;
            int offset;

            Node(List<Integer> list) {
                this.list = list;
                offset = 0;
                next = null;
                prev = null;
            }
        }
    }
}
