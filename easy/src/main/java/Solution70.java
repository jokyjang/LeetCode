public class Solution70 {
    public int climbStairs(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        int slow = 1;
        int fast = 1;
        for (int i = 2; i <= n; ++i) {
            int tmp = fast;
            fast = slow + fast;
            slow = tmp;
        }
        return fast;
    }
}
