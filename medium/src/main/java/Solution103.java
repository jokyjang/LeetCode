import java.util.LinkedList;
import java.util.List;

public class Solution103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        zigzagLevelOrder(root, 0, result);
        return result;
    }

    private void zigzagLevelOrder(TreeNode root, int level, List<List<Integer>> result) {
        if (root == null) {
            return;
        }

        if (result.size() <= level) {
            result.add(new LinkedList<Integer>());
        }
        List<Integer> list = result.get(level);

        if (level % 2 == 0) { // From left to right
            list.add(root.val);
        } else {
            list.add(0, root.val);
        }
        zigzagLevelOrder(root.left, level + 1, result);
        zigzagLevelOrder(root.right, level + 1, result);
    }
}
