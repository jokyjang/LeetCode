public class Solution198 {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        } else {
            int[] max = new int[nums.length];
            int maxValue = Math.max(nums[0], nums[1]);
            max[0] = nums[0];
            max[1] = maxValue;
            for (int i = 2; i < nums.length; ++i) {
                max[i] = Math.max(max[i-1], max[i-2]+nums[i]);
                maxValue = Math.max(maxValue, max[i]);
            }
            return maxValue;
        }
    }
}
