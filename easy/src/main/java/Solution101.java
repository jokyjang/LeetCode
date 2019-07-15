import java.util.Stack;

public interface Solution101 {
    public boolean isSymmetric(TreeNode node);

    class Recursive implements Solution101 {
        @Override
        public boolean isSymmetric(TreeNode root) {
            return root == null || isSymmetric(root.left, root.right);
        }

        // Return true if a and b are symmetric, false otherwise
        private boolean isSymmetric(TreeNode a, TreeNode b) {
            if (a == null && b == null) {
                return true;
            } else if (a != null && b != null) {
                return a.val == b.val && isSymmetric(a.left, b.right) && isSymmetric(a.right, b.left);
            } else {
                return false;
            }
        }
    }

    class Iterative implements Solution101 {
        @Override
        public boolean isSymmetric(TreeNode root) {
            Stack<TreeNode> s1 = new Stack<>();
            Stack<TreeNode> s2 = new Stack<>();
            if (root == null || root.left == null && root.right == null) {
                return true;
            } else if (root.left != null && root.right != null) {
                s1.push(root.left);
                s2.push(root.right);
            } else {
                return false;
            }

            while (!s1.isEmpty() && !s2.isEmpty()) {
                TreeNode n1 = s1.pop();
                TreeNode n2 = s2.pop();
                if (n1.val != n2.val) {
                    return false;
                }
                if (n1.left != null && n2.right != null) {
                    s1.push(n1.left);
                    s2.push(n2.right);
                } else if (n1.left != null || n2.right != null) {
                    return false;
                }

                if (n1.right != null && n2.left != null) {
                    s1.push(n1.right);
                    s2.push(n2.left);
                } else if (n1.right != null || n2.left != null) {
                    return false;
                }
            }
            return true;
        }
    }
}
