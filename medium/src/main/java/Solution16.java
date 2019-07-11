import java.util.Arrays;

public class Solution16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int minAbs = Integer.MAX_VALUE;
        int result = target;
        for (int i = 0; i < nums.length - 2; ++i) {
            int targetSum = target - nums[i];
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                int sum = nums[low] + nums[high];
                int abs = Math.abs(targetSum - sum);
                if (abs < minAbs) {
                    minAbs = abs;
                    result = sum + nums[i];
                }
                if (sum > targetSum) {
                    high--;
                } else if (sum < targetSum) {
                    low++;
                } else {
                    return target;
                }
            }
        }
        return result;
    }
}
