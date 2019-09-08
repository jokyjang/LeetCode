import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

// TODO
public class Solution1086 {
    public int[][] highFive(int[][] items) {
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        PriorityQueue<Integer> students = new PriorityQueue<>();
        for (int[] item : items) {
            if (!map.containsKey(item[0])) students.add(item[0]);
            PriorityQueue<Integer> pq = map.computeIfAbsent(item[0], (key) -> new PriorityQueue<>());
            pq.add(item[1]);
            if (pq.size() > 5) {
                pq.poll();
            }
        }

        int[][] result = new int[students.size()][2];
        int index = 0;
        while (!students.isEmpty()) {
            int id = students.poll();
            PriorityQueue<Integer> queue = map.get(id);
            int sum = 0, count = 0;
            while (!queue.isEmpty()) {
                sum += queue.poll();
                ++count;
            }
            result[index][0] = id;
            result[index][1] = sum / count;
            ++index;
        }
        return result;
    }
}
