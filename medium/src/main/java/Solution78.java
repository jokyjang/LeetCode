import java.util.ArrayList;
import java.util.List;

public class Solution78 {
    public List<List<Integer>> subsets(int[] nums) {
        return subsets(nums, nums.length - 1);
    }

    // Return the subsets of subarray of nums from index 0 inclusive to index max inclusive
    private List<List<Integer>> subsets(int[] nums, int max) {
        if (max < 0) {
            List<Integer> empty = new ArrayList<>();
            List<List<Integer>> subsets = new ArrayList<>();
            subsets.add(empty);
            return subsets;
        }
        List<List<Integer>> subsets = subsets(nums, max - 1);
        int length = subsets.size();
        for (int i = 0; i < length; ++i) {
            List<Integer> newSubset = new ArrayList<>(subsets.get(i));
            newSubset.add(nums[max]);
            subsets.add(newSubset);
        }
        return subsets;
    }
}
