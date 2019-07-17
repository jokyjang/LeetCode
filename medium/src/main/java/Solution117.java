import java.util.LinkedList;

public class Solution117 {
    public Node connect(Node root) {
        if (root == null) {
            return root;
        }
        LinkedList<Node> list = new LinkedList<>();
        list.addLast(root);
        int currentSize = 1;
        int nextSize = 0;
        while (!list.isEmpty()) {
            Node node = list.pollFirst();
            currentSize--;
            if (node.left != null) {
                list.addLast(node.left);
                ++nextSize;
            }
            if (node.right != null) {
                list.addLast(node.right);
                ++nextSize;
            }
            if (currentSize != 0) {
                node.next = list.peekFirst();
            } else {
                currentSize = nextSize;
                nextSize = 0;
            }
        }
        return root;
    }
}
