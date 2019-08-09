// TODO
public class Solution203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy, next = dummy.next;
        while (next != null) {
            if (next.val != val) {
                current = next;
                next = current.next;
            } else {
                next = next.next;
                current.next.next = null;
                current.next = next;
            }
        }
        return dummy.next;
    }
}
