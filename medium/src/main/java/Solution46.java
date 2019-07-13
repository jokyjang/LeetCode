import java.util.ArrayList;
import java.util.List;

public class Solution46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // List<Integer> numList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        permutations(result, new ArrayList<Integer>(), nums);
        return result;
    }

    private void permutations(List<List<Integer>> set, List<Integer> prefix, int[] nums) {
        if (nums.length == prefix.size()) {
            set.add(new ArrayList<>(prefix));
            return;
        }

        for (int i = prefix.size(); i < nums.length; ++i) {
            int temp = nums[i];
            nums[i] = nums[prefix.size()];
            nums[prefix.size()] = temp;
            prefix.add(temp);

            permutations(set, prefix, nums);
            prefix.remove(prefix.size() - 1);
            nums[prefix.size()] = nums[i];
            nums[i] = temp;
        }
    }
}
