public class Solution82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy.next;
        while (fast.next != null) {
            if (slow.next.val == fast.next.val) {
                fast = fast.next;
            } else if (slow.next == fast) {
                slow = fast;
                fast = fast.next;
            } else {
                slow.next = fast.next;
                fast = slow.next;
            }
        }
        if (slow.next != fast) {
            slow.next = null;
        }
        return dummy.next;
    }
}
