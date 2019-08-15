public interface Solution206 {

    ListNode reverseList(ListNode head);

    class Iteration implements Solution206 {
        @Override
        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }

            ListNode current = head, next = head.next;
            current.next = null;
            while (next != null) {
                ListNode temp = next.next;
                next.next = current;
                current = next;
                next = temp;
            }
            return current;
        }
    }

    class Recursion implements Solution206 {
        public ListNode reverseList(ListNode head) {
            if (head == null) {
                return head;
            }
            return recursiveReverse(head)[0];
        }

        // Return the new head and tail all together in the ListNode array
        // head must not be null;
        private ListNode[] recursiveReverse(ListNode head) {
            if (head.next == null) {
                return new ListNode[]{head, head};
            }
            ListNode[] pair = recursiveReverse(head.next);
            pair[1].next = head;
            head.next = null;
            return new ListNode[]{pair[0], head};
        }
    }
}
