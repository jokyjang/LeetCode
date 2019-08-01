public class Solution45 {
    public int jump(int[] nums) {
        int furthest = 0, step = 0, current = 0;
        for (int i = 0; i < nums.length - 1; ++i) {
            furthest = Math.max(i + nums[i], furthest);
            if (furthest >= nums.length - 1) {
                return step + 1;
            }
            if (i == current) {
                ++step;
                current = furthest;
            }

        }
        return step;
    }
}
