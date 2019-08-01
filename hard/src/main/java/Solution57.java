import java.util.ArrayList;
import java.util.List;

public class Solution57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        int i = 0;
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            list.add(intervals[i++]);
        }

        if (i == intervals.length) {
            list.add(newInterval);
            return list.toArray(new int[list.size()][2]);
        }

        int low = Math.min(newInterval[0], intervals[i][0]);
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            ++i;
        }

        int high = i == 0 ? newInterval[1] : Math.max(newInterval[1], intervals[i-1][1]);
        list.add(new int[]{low, high});
        if (i == intervals.length) {
            return list.toArray(new int[list.size()][2]);
        }
        while (i < intervals.length) {
            list.add(intervals[i++]);
        }
        return list.toArray(new int[list.size()][2]);
    }
}
