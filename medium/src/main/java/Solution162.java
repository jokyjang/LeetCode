public class Solution162 {
    public int findPeakElement(int[] nums) {
        if (nums.length == 0) {
            return Integer.MIN_VALUE;
        }
        if (nums.length == 1 || nums[0] > nums[1]) {
            return 0;
        } else if (nums[nums.length - 1] > nums[nums.length - 2]) {
            return nums.length - 1;
        }
        int low = 1, high = nums.length - 2;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) {
                return mid;
            } else if (nums[mid] > nums[mid-1] && nums[mid] < nums[mid+1]) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return Integer.MIN_VALUE;
    }
}
