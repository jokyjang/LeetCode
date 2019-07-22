import java.util.HashMap;
import java.util.Map;

public class Solution146 {
    class DoublyNode {
        int val;
        int key;
        DoublyNode prev;
        DoublyNode next;
        DoublyNode(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    private final Map<Integer, DoublyNode> map;
    private DoublyNode head;  // dummy head
    private DoublyNode tail;
    private final int capacity;

    public Solution146(int capacity) {
        map = new HashMap<>(capacity);
        head = new DoublyNode(0, 0);
        tail = null;
        this.capacity = capacity;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            DoublyNode node = map.get(key);
            prioritizeNode(node);
            return node.val;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        DoublyNode node = map.get(key);
        if (node == null) {
            DoublyNode newNode = new DoublyNode(key, value);
            newNode.next = head.next;
            newNode.prev = head;
            if (head.next != null) {
                head.next.prev = newNode;
            } else {
                tail = newNode;
            }
            head.next = newNode;
            map.put(key, newNode);
        } else {
            node.val = value;
            prioritizeNode(node);
        }
        if (map.size() > capacity) {
            map.remove(tail.key);
            tail = tail.prev;
            tail.next.prev = null;
            tail.next = null;
        }
    }

    private void prioritizeNode(DoublyNode node) {
        if (head.next != node) {
            node.prev.next = node.next;
            if (node.next != null) {
                node.next.prev = node.prev;
            } else if (node.prev != head) {
                tail = node.prev;
            }
            node.prev = head;
            node.next = head.next;
            head.next.prev = node;
            head.next = node;
        }
    }

    private void print() {
        DoublyNode temp = head.next;
        System.out.println("sequential:");
        while (temp != null) {
            System.out.println(temp.key + "-" + temp.val);
            temp = temp.next;
        }

        System.out.println("reverse:");
        temp = tail;
        while (temp != null && temp != head) {
            System.out.println(temp.key + "-" + temp.val);
            temp = temp.prev;
        }
    }
}
