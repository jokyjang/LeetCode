public class Solution189 {
    public void rotate(int[] nums, int k) {
        int l = nums.length;
        k = k % l;
        int pivot = l - k;
        reverse(nums, 0, pivot-1);
        reverse(nums, pivot, l-1);
        reverse(nums, 0, l-1);
    }

    private void reverse(int[] nums, int low, int high) {
        while (low <= high) {
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }
}
