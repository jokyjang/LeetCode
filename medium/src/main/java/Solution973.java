import java.util.PriorityQueue;

public class Solution973 {
    public int[][] kClosest(int[][] points, int K) {
        if (K >= points.length) {
            return points;
        }

        PriorityQueue<int[]> queue = new PriorityQueue<>(
            (a, b) -> Integer.compare(b[0]*b[0] + b[1]*b[1], a[0]*a[0] + a[1]*a[1])
        );

        for (int i = 0; i < points.length; ++i) {
            queue.offer(points[i]);
            if (queue.size() > K) {
                queue.poll();
            }
        }

        int[][] result = new int[K][2];
        int i = 0;
        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            result[i][0] = point[0];
            result[i][1] = point[1];
            i++;
        }
        return result;
    }
}
