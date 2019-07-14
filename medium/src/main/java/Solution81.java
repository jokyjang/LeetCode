public class Solution81 {
    public boolean search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] == nums[low] && nums[mid] == nums[high]) {
                low++;
                high--;
            } else if (nums[mid] < nums[low] && (nums[mid] > target || target >= nums[low]) ||
                nums[mid] > nums[low] && target < nums[mid] && target >= nums[low]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
