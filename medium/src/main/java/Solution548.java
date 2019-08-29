import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// TODO
public class Solution548 {
    public boolean splitArray(int[] nums) {
        if (nums.length < 7) return false;
        int[] sum = new int[nums.length];
        int currentSum = 0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            currentSum += nums[i];
            sum[i] = currentSum;
            List<Integer> list = map.computeIfAbsent(
                currentSum,
                (key) -> new ArrayList<>()
            );
            list.add(i);
        }

        int r = nums.length - 1;
        currentSum = nums[r];
        while (r > 5) {
            List<Integer> list = map.get(currentSum);
            if (list != null) {
                for (Integer index : list) {
                    if (index + 5 >= r) continue;
                    if (isValid(nums, sum, index+1, r-1, currentSum)) {
                        return true;
                    }
                }
            }
            --r;
            currentSum += nums[r];
        }
        return false;
    }

    private boolean isValid(int[] nums, int[] sum, int p1, int p3, int currentSum) {
        int index = p1 + 1;
        while (index + 3 <= p3) {
            if (sum[index] - nums[p1] == 2 * currentSum &&
                sum[p3-1] - sum[index] - nums[index+1] == currentSum) {
                return true;
            }
            ++index;
        }
        return false;
    }
}
