public class Solution209 {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int l = nums.length, left = 0, right = 0, min = 0, sum = 0;
        while (right < l) {
            sum += nums[right];
            if (sum >= s) {
                min = min == 0 ? right-left+1 : Math.min(min, right-left+1);
                while (left < right && sum - nums[left] >= s) {
                    sum -= nums[left];
                    left++;
                    min = min == 0 ? right-left+1 : Math.min(min, right-left+1);
                }
                if (left == right) {
                    sum -= nums[right];
                }
            }
            ++right;
        }
        return min;
    }
}
