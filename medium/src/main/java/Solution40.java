import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

        return combination(candidates, 0, target);
    }

    private List<List<Integer>> combination(int[] candidates, int low, int target) {
        List<List<Integer>> result = new LinkedList<>();
        if (low >= candidates.length || candidates[low] > target) {
            return result;
        }

        for (int i = low; i < candidates.length; ++i) {
            if (i != low && candidates[i] == candidates[i - 1]) continue;

            int firstValue = candidates[i];
            if (firstValue == target) {
                List<Integer> solution = new LinkedList<>();
                solution.add(firstValue);
                result.add(solution);
                return result;
            }

            List<List<Integer>> subset = combination(candidates, i + 1, target - firstValue);
            for (List<Integer> solution : subset) {
                solution.add(0, firstValue);
                result.add(solution);
            }
        }
        return result;
    }
}
