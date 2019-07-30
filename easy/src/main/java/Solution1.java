import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> index = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {
            int another = target - nums[i];
            Integer anotherIndex = index.get(another);
            if (anotherIndex == null) {
                index.put(nums[i], i);
            } else {
                if (i < anotherIndex) {
                    return new int[]{i, anotherIndex};
                } else {
                    return new int[]{anotherIndex, i};
                }
            }
        }
        return null;
    }
}
