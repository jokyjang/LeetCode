import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        // Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        permutation(result, new ArrayList<Integer>(), nums);
        return result;
    }

    private void permutation(List<List<Integer>> set, List<Integer> prefix, int[] nums) {
        if (prefix.size() == nums.length) {
            set.add(new ArrayList(prefix));
            return;
        }

        Set<Integer> used = new HashSet<>();
        for (int i = prefix.size(); i < nums.length; ++i) {
            // if (i != prefix.size() && (nums[i] == nums[i-1] || nums[i] == nums[prefix.size()])) continue;
            if (used.contains(nums[i])) {
                continue;
            } else {
                used.add(nums[i]);
            }
            int temp = nums[i];
            nums[i] = nums[prefix.size()];
            nums[prefix.size()] = temp;
            prefix.add(temp);

            permutation(set, prefix, nums);
            prefix.remove(prefix.size() - 1);
            nums[prefix.size()] = nums[i];
            nums[i] = temp;
        }
    }
}
