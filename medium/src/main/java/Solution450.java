import java.util.LinkedList;
import java.util.Queue;

// TODO
public class Solution450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (root.val == key) {
            return deleteRoot(root);
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                if (node.left.val == key) {
                    node.left = deleteRoot(node.left);
                    return root;
                } else {
                    queue.add(node.left);
                }
            }
            if (node.right != null) {
                if (node.right.val == key) {
                    node.right = deleteRoot(node.right);
                    return root;
                } else {
                    queue.add(node.right);
                }
            }
        }
        return root;
    }

    private TreeNode deleteRoot(TreeNode root) {
        if (root.left == null && root.right == null) {
            return null;
        } else if (root.left == null) {
            return root.right;
        } else if (root.right == null) {
            return root.left;
        } else if (root.right.left == null) {
            root.right.left = root.left;
            return root.right;
        } else {
            TreeNode current = root.right, next = current.left;
            while (next.left != null) {
                current = next;
                next = next.left;
            }
            current.left = next.right;
            next.left = root.left;
            next.right = root.right;
            return next;
        }
    }
}
