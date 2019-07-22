public class Solution152 {
    public int maxProduct(int[] nums) {
        int[] products = new int[nums.length];
        int max = nums[0];
        for (int i = 0; i < nums.length; ++i) {
            products[i] = nums[i];
            max = Math.max(max, products[i]);
            for (int j = 0; j < i; ++j) {
                products[j] = products[j] * nums[i];
                max = Math.max(max, products[j]);
            }
        }

        return max;
    }
}
