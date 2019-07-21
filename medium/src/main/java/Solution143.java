public class Solution143 {
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        int length = 0;
        ListNode current = head;
        while (current != null) {
            ++length;
            current = current.next;
        }

        int firstLength = (length + 1) / 2;
        int index = 1;
        current = head;
        while (index < firstLength) {
            current = current.next;
            ++index;
        }
        ListNode temp = current.next;
        current.next = null;
        current = reverse(temp);

        ListNode i1 = head;
        ListNode i2 = current;
        while (i1 != null && i2 != null) {
            temp = i1.next;
            i1.next = i2;
            i1 = temp;
            temp = i2.next;
            i2.next = i1;
            i2 = temp;
        }
    }

    // Reverse ListNode and return the new head
    private ListNode reverse(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode current = head, next = head.next;
        head.next = null;
        while (next != null) {
            ListNode temp = next.next;
            next.next = current;
            current = next;
            next = temp;
        }

        return current;
    }
}
