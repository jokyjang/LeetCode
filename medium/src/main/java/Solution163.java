import java.util.ArrayList;
import java.util.List;

public class Solution163 {
    public List<String> findMissingRanges(int[] nums, int lower, int higher) {
        List<String> result = new ArrayList<>();
        int i = 0;
        long low = (long)lower, high = (long)higher;
        while (i < nums.length && low < high) {
            if (nums[i] > low) {
                StringBuilder sb = new StringBuilder();
                sb.append(low);
                if (nums[i] - 1 != low) {
                    sb.append("->");
                    sb.append(Math.min(nums[i]-1, high));
                }
                result.add(sb.toString());
                low = (long)nums[i] + 1;
            } else if (nums[i] == low) {
                low = (long)nums[i] + 1;
            }
            ++i;
        }
        if (i == nums.length && low <= high) {
            StringBuilder sb = new StringBuilder();
            sb.append(low);
            if (high != low) {
                sb.append("->");
                sb.append(high);
            }
            result.add(sb.toString());
        }
        return result;
    }
}
