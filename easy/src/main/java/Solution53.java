public class Solution53 {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = nums[0];
        int currentMax = max;
        for (int i = 1; i < nums.length; ++i) {
            currentMax = Math.max(nums[i], nums[i] + currentMax);
            if (currentMax > max) {
                max = currentMax;
            }
        }
        return max;
    }
}
