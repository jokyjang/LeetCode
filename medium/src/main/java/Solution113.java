import java.util.ArrayList;
import java.util.List;

public class Solution113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        pathSum(result, new ArrayList<>(), root, 0, sum);
        return result;
    }

    private void pathSum(List<List<Integer>> result, List<Integer> prefix, TreeNode node, int currentSum, int sum) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                if (currentSum + node.val == sum) {
                    prefix.add(node.val);
                    result.add(prefix);
                }
            } else {
                prefix.add(node.val);
                pathSum(result, new ArrayList<>(prefix), node.left, currentSum + node.val, sum);
                pathSum(result, new ArrayList<>(prefix), node.right, currentSum + node.val, sum);
            }
        }
    }
}
