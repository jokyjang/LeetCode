import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution253 {
    public int minMeetingRooms(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> rooms = new PriorityQueue<>();
        rooms.add(intervals[0][1]);

        for (int i = 1; i < intervals.length; ++i) {
            if (rooms.peek() <= intervals[i][0]) {
                rooms.poll();
            }
            rooms.add(intervals[i][1]);
        }
        return rooms.size();
    }
}
