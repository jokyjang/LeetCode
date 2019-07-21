public class Solution138 {
    public RandomNode copyRandomList(RandomNode head) {
        if (head == null) {
            return null;
        }

        RandomNode current = head;
        while (current != null) {
            RandomNode clone = new RandomNode();
            clone.val = current.val;
            clone.next = current.next;
            current.next = clone;
            current = clone.next;
        }

        current = head;
        while (current != null) {
            RandomNode clone = current.next;
            if (current.random != null) {
                clone.random = current.random.next;
            }
            current = clone.next;
        }

        current = head;
        RandomNode cloneHead = head.next;
        while (current != null) {
            RandomNode clone = current.next;
            current.next = clone.next;
            if (clone.next != null) {
                clone.next = current.next.next;
            }
            current = current.next;
        }
        return cloneHead;
    }
}
