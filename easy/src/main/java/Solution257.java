import java.util.ArrayList;
import java.util.List;

// TODO
public class Solution257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) return result;
        binaryTreePaths(root, result, String.valueOf(root.val));
        return result;
    }

    private void binaryTreePaths(TreeNode node, List<String> result, String prefix) {
        if (node.left == null && node.right == null) {
            result.add(prefix);
        } else {
            if (node.left != null)
                binaryTreePaths(node.left, result, prefix+"->"+node.left.val);
            if (node.right != null)
                binaryTreePaths(node.right, result, prefix+"->"+node.right.val);
        }
    }
}
