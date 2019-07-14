public class Solution86 {
    public ListNode partition(ListNode head, int x) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode firstTail = dummy;
        while (firstTail.next != null && firstTail.next.val < x) {
            firstTail = firstTail.next;
        }

        if (firstTail.next == null) {
            return dummy.next;
        }
        ListNode secondTail = firstTail;
        while (secondTail.next != null) {
            if (secondTail.next.val >= x) {
                secondTail = secondTail.next;
            } else {
                ListNode temp = secondTail.next;
                secondTail.next = temp.next;
                temp.next = firstTail.next;
                firstTail.next = temp;
                firstTail = temp;
            }
        }
        return dummy.next;
    }
}
