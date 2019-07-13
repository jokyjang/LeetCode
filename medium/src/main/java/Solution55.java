public class Solution55 {
    public boolean canJump(int[] nums) {
        int furthest = nums[0];
        if (furthest >= nums.length - 1) {
            return true;
        }
        for (int i = 1; i < nums.length - 1; ++i) {
            if (furthest < i) {
                return false;
            }
            furthest = Math.max(furthest, i + nums[i]);
            if (furthest >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}
