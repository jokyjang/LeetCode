import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution56 {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, (v1, v2) -> Integer.compare(v1[0], v2[0]));

        List<int[]> result = new ArrayList<>();
        int[] current = new int[]{intervals[0][0], intervals[0][1]};
        for (int i = 1; i < intervals.length; ++i) {
            if (intervals[i][0] <= current[1]) {
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
                result.add(current);
                current = new int[]{intervals[i][0], intervals[i][1]};
            }
        }
        result.add(current);
        return result.toArray(new int[result.size()][]);
    }
}
