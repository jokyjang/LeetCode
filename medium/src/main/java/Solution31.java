public class Solution31 {
    public void nextPermutation(int[] nums) {
        int index = nums.length - 1;
        while (index > 0 && nums[index] <= nums[index - 1]) {
            --index;
        }
        if (index != 0) {
            for (int i = nums.length - 1; i >= index; --i) {
                if (nums[i] > nums[index - 1]) {
                    int temp = nums[index - 1];
                    nums[index - 1] = nums[i];
                    nums[i] = temp;
                    break;
                }
            }
        }
        reverse(nums, index, nums.length - 1);
    }

    // Reverse nums in-place from low to high inclusive
    private void reverse(int[] nums, int low, int high) {
        while (low < high) {
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            ++low;
            --high;
        }
    }
}
