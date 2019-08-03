import java.util.ArrayList;
import java.util.List;

public class Solution99 {
    private List<TreeNode> nodes = new ArrayList<>();

    public void recoverTree(TreeNode root) {
        inorder(root);

        if (nodes.size() != 0) {
            TreeNode node1 = nodes.get(0), node2 = nodes.get(0);
            for (TreeNode n : nodes) {
                if (n.val > node2.val) {
                    node2 = n;
                } else if (n.val < node1.val) {
                    node1 = n;
                }
            }
            int temp = node1.val;
            node1.val = node2.val;
            node2.val = temp;
        }
    }

    // Inorder traversal the root TreeNode and return the rightmost TreeNode
    private TreeNode[] inorder(TreeNode root) {
        if (root == null) {
            return new TreeNode[]{null, null};
        }
        TreeNode[] left = inorder(root.left);
        if (left[1] != null && left[1].val > root.val) {
            nodes.add(left[1]);
            nodes.add(root);
        }
        TreeNode[] right = inorder(root.right);
        if (right[0] != null && right[0].val < root.val) {
            nodes.add(root);
            nodes.add(right[0]);
        }
        return new TreeNode[]{left[0] == null ? root : left[0], right[1] == null ? root : right[1]};
    }
}
