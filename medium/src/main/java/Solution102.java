import java.util.ArrayList;
import java.util.List;

public class Solution102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        levelOrder(root, 0, result);
        return result;
    }

    private void levelOrder(TreeNode root, int index, List<List<Integer>> result) {
        if (root == null) {
            return;
        }
        if (result.size() == index) {
            result.add(new ArrayList<Integer>());
        }
        List<Integer> level = result.get(index);

        level.add(root.val);
        levelOrder(root.left, index+1, result);
        levelOrder(root.right, index+1, result);
    }
}
