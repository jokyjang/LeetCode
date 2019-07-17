import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        levelOrderBottom(root, 0, result);
        return result;
    }

    private void levelOrderBottom(TreeNode root, int level, List<List<Integer>> result) {
        if (root == null) {
            return;
        }
        if (result.size() <= level) {
            result.add(0, new ArrayList<>());
        }
        List<Integer> list = result.get(result.size() - level - 1);
        list.add(root.val);
        levelOrderBottom(root.left, level + 1, result);
        levelOrderBottom(root.right, level + 1, result);
    }
}
