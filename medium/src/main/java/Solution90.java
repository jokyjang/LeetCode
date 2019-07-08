import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Map<Integer, Integer> times = new HashMap<>();
        List<Integer> newNums = new ArrayList<>();
        for(int num : nums) {
            int time = times.getOrDefault(num, 0);
            if (time == 0) {
                newNums.add(num);
            }
            times.put(num, time + 1);
        }
        return subsetsWithDup(newNums, newNums.size() - 1, times);
    }

    // Get the subsets of the subarray of nums from index 0 inclusive to index max inclusive,
    // under the reference of times
    private List<List<Integer>> subsetsWithDup(List<Integer> nums, int max, Map<Integer, Integer> times) {
        if (max < 0) {
            List<List<Integer>> subsets = new ArrayList<>();
            subsets.add(Collections.emptyList());
            return subsets;
        }
        List<List<Integer>> subsets = subsetsWithDup(nums, max - 1, times);
        int length = subsets.size();
        for (int i = 0; i < length; ++i) {
            List<Integer> subset = subsets.get(i);
            int time = times.get(nums.get(max));
            // if (time < 0) {
            //     throw RuntimeException("The numbers in times hash map cann't be smaller than 0")
            // }
            for (int j = 1; j <= time; ++j) {
                List<Integer> newSubset = new ArrayList<Integer>(subset);
                for (int k = 0; k < j; ++k) {
                    newSubset.add(nums.get(max));
                }
                subsets.add(newSubset);
            }
        }
        return subsets;
    }
}
