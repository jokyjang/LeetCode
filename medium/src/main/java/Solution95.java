import java.util.ArrayList;
import java.util.List;

public class Solution95 {
    public List<TreeNode> generateTrees(int n) {
        return generateTrees(1, n);
    }

    private List<TreeNode> generateTrees(int from, int to) {
        List<TreeNode> set = new ArrayList<>();
        if (from > to) {
            return set;
        }
        for (int i = from; i <= to; ++i) {
            List<TreeNode> leftTrees = generateTrees(from, i-1);
            List<TreeNode> rightTrees = generateTrees(i+1, to);
            if (leftTrees.isEmpty() && rightTrees.isEmpty()) {
                TreeNode root = new TreeNode(i);
                set.add(root);
            } else if (rightTrees.isEmpty()) {
                for (TreeNode leftRoot : leftTrees) {
                    TreeNode root = new TreeNode(i);
                    root.left = leftRoot;
                    set.add(root);
                }
            } else if (leftTrees.isEmpty()) {
                for (TreeNode rightRoot : rightTrees) {
                    TreeNode root = new TreeNode(i);
                    root.right = rightRoot;
                    set.add(root);
                }
            } else {
                for (TreeNode leftRoot : leftTrees) {
                    for (TreeNode rightRoot : rightTrees) {
                        TreeNode root = new TreeNode(i);
                        root.left = leftRoot;
                        root.right = rightRoot;
                        set.add(root);
                    }
                }
            }
        }
        return set;
    }
}
