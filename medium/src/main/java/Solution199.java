import java.util.ArrayList;
import java.util.List;

public class Solution199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverse(root, 0, result);
        return result;
    }

    private void traverse(TreeNode node, int depth, List<Integer> result) {
        if (node == null) {
            return;
        }
        if (result.size() == depth) {
            result.add(node.val);
        }
        traverse(node.right, depth+1, result);
        traverse(node.left, depth+1, result);
    }
}
