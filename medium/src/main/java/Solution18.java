import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution18 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        return nSum(nums, target, 4);
    }

    // Return all possible n-plets of n-sum being target
    private List<List<Integer>> nSum(int[] nums, int target, int n) {
        Arrays.sort(nums);
        return nSum(nums, 0, nums.length - 1, target, n);
    }

    // Return all possible n-plets of n-sum being target from the sorted array from the specified boundary.
    private List<List<Integer>> nSum(int[] nums, int low, int high, int target, int n) {

        List<List<Integer>> result = new LinkedList<>();
        if (low < high && (nums[low] * n > target || nums[high] * n < target)) {
            return result;
        }

        if (n == 2) {
            while (low < high) {
                if (nums[low] + nums[high] == target) {

                    LinkedList<Integer> solution = new LinkedList<>();
                    solution.add(nums[low]);
                    solution.add(nums[high]);
                    result.add(solution);

                    while (low < high && nums[high-1] == nums[high]) high--;
                    while (low < high && nums[low+1] == nums[low]) low++;
                    high--;
                    low++;
                } else if (nums[low] + nums[high] > target) {
                    while (low < high && nums[high-1] == nums[high]) high--;
                    high--;
                } else {
                    while (low < high && nums[low+1] == nums[low]) low++;
                    low++;
                }
            }
            return result;
        }

        for (int i = low; i <= high - n + 1; ++i) {
            if (i != low && nums[i] == nums[i - 1]) {
                continue;
            }
            int sum = target - nums[i];
            List<List<Integer>> suffix = nSum(nums, i + 1, high, sum, n - 1);
            for (List<Integer> list : suffix) {
                list.add(0, nums[i]);
            }
            result.addAll(suffix);
        }
        return result;
    }
}
