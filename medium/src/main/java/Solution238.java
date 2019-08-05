public class Solution238 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[n - 1] = 1;
        for (int i = n - 2; i >= 0; --i) {
            result[i] = nums[i + 1] * result[i + 1];
        }
        int product = 1;
        for (int i = 0; i < n; ++i) {
            result[i] *= product;
            product *= nums[i];
        }
        return result;
    }
}
