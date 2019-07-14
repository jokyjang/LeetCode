public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int length = 0;
        while (temp != null) {
            ++length;
            temp = temp.next;
        }
        int index = length - n;
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        temp = dummy;
        while (index != 0) {
            temp = temp.next;
            --index;
        }
        temp.next = temp.next.next;
        return dummy.next;
    }
}
