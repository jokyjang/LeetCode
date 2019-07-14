import java.util.HashSet;
import java.util.Set;

public class Solution653 {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> values = new HashSet<>();
        return find(root, values, k);
    }

    // If any node from the subtree of root has the value which is the subtraction
    // of target and any value from the set, return true; otherwise, return false;
    private boolean find(TreeNode root, Set<Integer> values, int target) {
        if (root == null) {
            return false;
        }

        if (values.contains(target - root.val)) {
            return true;
        }
        values.add(root.val);
        return find(root.left, values, target) || find(root.right, values, target);
    }
}
