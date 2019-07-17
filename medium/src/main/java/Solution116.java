public class Solution116 {
    public Node connect(Node root) {
        if (root == null || root.left == null) {
            return root;
        }
        connect(root.left);
        connect(root.right);

        Node left = root.left;
        Node right = root.right;
        while (left != null && right != null) {
            left.next = right;
            left = left.right;
            right = right.left;
        }

        return root;
    }
}
