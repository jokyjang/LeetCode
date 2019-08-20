// TODO add tests
public class Solution213 {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        return Math.max(rob(nums, 0, nums.length - 2), rob(nums, 1, nums.length - 1));
    }

    private int rob(int[] nums, int low, int high) {
        if (low == high) {
            return nums[low];
        }
        int previous = nums[low], current = Math.max(nums[low], nums[low+1]);
        for (int i = low + 2; i <= high; ++i) {
            int temp = Math.max(previous+nums[i], current);
            previous = current;
            current = temp;
        }
        return current;
    }
}
