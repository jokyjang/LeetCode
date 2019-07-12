import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        return combination(candidates, 0, target);
    }

    // Return a list of number list whose sum is target, and whose values are from sorted candidates within the range from low to high, inclusive.
    private List<List<Integer>> combination(int[] candidates, int low, int target) {
        List<List<Integer>> result = new LinkedList<>();
        if (candidates[low] > target) {
            return result;
        }

        for (int i = low; i < candidates.length; ++i) {
            int firstValue = candidates[i];

            if (firstValue == target) {
                LinkedList<Integer> solution = new LinkedList<>();
                solution.add(firstValue);
                result.add(solution);
                return result;
            }

            List<List<Integer>> subset = combination(candidates, i, target - firstValue);
            for (List<Integer> solution : subset) {
                solution.add(0, firstValue);
                result.add(solution);
            }
        }
        return result;
    }
}
