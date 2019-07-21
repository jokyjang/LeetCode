public class Solution142 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;
        boolean firstTime = true;
        while (true) {
            if (fast == null || fast.next == null) {
                return null;
            }
            if (fast == slow) {
                if (firstTime) {
                    firstTime = false;
                } else {
                    break;
                }
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
