import java.util.LinkedList;
import java.util.Queue;

// TODO
public class Solution572 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(s);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (equals(node, t)) {
                return true;
            }
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        return false;
    }

    private boolean equals(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        } else if (s != null && t != null) {
            return s.val == t.val && equals(s.left, t.left) && equals(s.right, t.right);
        } else {
            return false;
        }
    }
}
