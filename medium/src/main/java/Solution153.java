public class Solution153 {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return Integer.MIN_VALUE;
        }

        int high = nums.length - 1, low = 0;
        while (low <= high) {
            if (nums[low] <= nums[high]) {
                return nums[low];
            }

            int mid = (low + high) / 2;
            if (nums[mid] >= nums[low]) {
                low = mid + 1;
            } else if (nums[mid] < nums[high]) {
                high = mid;
            }
        }
        return 0;
    }
}
