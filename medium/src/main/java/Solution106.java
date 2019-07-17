import java.util.HashMap;
import java.util.Map;

public class Solution106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> index = new HashMap<>();
        for (int i = 0; i < postorder.length; ++i) {
            index.put(inorder[i], i);
        }
        return buildTree(postorder, 0, postorder.length - 1, 0, inorder.length - 1, index);
    }

    private TreeNode buildTree(int[] postorder, int low, int high,
                               int inlow, int inhigh, Map<Integer, Integer> index) {
        if (low > high) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[high]);
        int rootIndex = index.get(postorder[high]);
        TreeNode left = buildTree(postorder, low, low + rootIndex - inlow - 1, inlow, rootIndex - 1, index);
        TreeNode right = buildTree(postorder, low + rootIndex - inlow, high - 1, rootIndex + 1, inhigh, index);
        root.left = left;
        root.right = right;
        return root;
    }
}
