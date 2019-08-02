public class Solution96 {
    public int numTrees(int n) {
        int[] nums = new int[n+1];
        nums[0] = 1; nums[1] = 1;
        for (int i = 2; i <= n; ++i) {
            for (int j = 0; j <= i-1; ++j) {
                nums[i] += nums[j] * nums[i-1-j];
            }
        }
        return nums[n];
    }
}
