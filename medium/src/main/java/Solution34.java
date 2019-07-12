public class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int index = (low + high) / 2;
            if (nums[index] == target) {
                int left = searchLeftBoundary(nums, low, index, target);
                int right = searchRightBoundary(nums, index, high, target);
                return new int[]{left, right};
            }
            if (nums[index] > target) {
                high = index - 1;
            } else {
                low = index + 1;
            }
        }
        return new int[]{-1, -1};
    }

    // Find the index of the target value which is the first occurrance in the nums
    private int searchLeftBoundary(int[] nums, int low, int high, int target) {
        while (low <= high) {
            int index = (low + high) / 2;
            if (nums[index] == target) {
                high = index - 1;
            } else if (nums[index + 1] == target) {
                return index + 1;
            } else {
                low = index + 1;
            }
        }
        return low;
    }

    // Find the index of the target value which is the last occurrance in the nums
    private int searchRightBoundary(int[] nums, int low, int high, int target) {
        while (low <= high) {
            int index = (low + high) / 2;
            if (nums[index] == target) {
                low = index + 1;
            } else if (nums[index - 1] == target) {
                return index - 1;
            } else {
                high = index - 1;
            }
        }
        return high;
    }
}
