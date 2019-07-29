public class Solution41 {
    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] <= 0 || nums[i] > nums.length ||
                (nums[i]-1 != i && nums[nums[i]-1] == nums[i])) {
                nums[i] = 0;
            } else if (nums[i] != i + 1) {
                int temp = nums[i];
                nums[i] = nums[nums[i]-1];
                nums[temp-1] = temp;
                if (temp > i+1) --i;
            }
        }
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return nums.length+1;
    }
}
