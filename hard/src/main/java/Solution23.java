import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution23 {
    public ListNode mergeKList(ListNode[] lists) {
        PriorityQueue<ListNode> queue = new PriorityQueue<>(
            Comparator.comparingInt(a -> a.val)
        );
        for (ListNode node : lists) {
            if (node != null) {
                queue.add(node);
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while (!queue.isEmpty()) {
            ListNode node = queue.poll();
            current.next = node;
            if (node.next != null) {
                queue.add(node.next);
            }
            current = node;
        }
        return dummy.next;
    }
}
