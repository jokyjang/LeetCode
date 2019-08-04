public class Solution154 {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            if (nums[low] < nums[high]) {
                return nums[low];
            } else if (nums[low] > nums[high]) {
                int mid = low + (high-low)/2;
                if (nums[mid] >= nums[low]) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            } else {
                low++;
            }
        }
        return nums[low];
    }
}
