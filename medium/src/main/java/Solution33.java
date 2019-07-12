public class Solution33 {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int index = (low + high ) / 2;
            if (nums[index] == target) {
                return index;
            }
            if (nums[low] < nums[high]) {
                if (nums[index] > target) {
                    high = index - 1;
                } else {
                    low = index + 1;
                }
            } else if (nums[index] >= nums[low]) {
                if (nums[low] > target || target > nums[index]) {
                    low = index + 1;
                } else {
                    high = index - 1;
                }
            } else {
                if (nums[high] < target || target < nums[index]) {
                    high = index - 1;
                } else {
                    low = index + 1;
                }
            }
        }
        return -1;
    }
}
