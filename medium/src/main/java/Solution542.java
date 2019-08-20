import java.util.LinkedList;
import java.util.Queue;

// TODO
public class Solution542 {
    class Point {
        int x;
        int y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int[][] updateMatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] distance = new int[m][n];
        Queue<Point> queue = new LinkedList<>();
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (matrix[i][j] == 0) {
                    queue.add(new Point(i, j));
                }
            }
        }

        while (!queue.isEmpty()) {
            Point p = queue.poll();
            if (p.x > 0 && matrix[p.x-1][p.y] != 0) {
                updateDistance(distance, p, new Point(p.x-1, p.y), queue);
            }
            if (p.x < m-1 && matrix[p.x+1][p.y] != 0) {
                updateDistance(distance, p, new Point(p.x+1, p.y), queue);
            }
            if (p.y > 0 && matrix[p.x][p.y-1] != 0) {
                updateDistance(distance, p, new Point(p.x, p.y-1), queue);
            }
            if (p.y < n-1 && matrix[p.x][p.y+1] != 0) {
                updateDistance(distance, p, new Point(p.x, p.y+1), queue);
            }
        }
        return distance;
    }

    private void updateDistance(int[][] distance, Point a, Point b, Queue<Point> queue) {
        if (distance[b.x][b.y] == 0) {
            queue.add(b);
            distance[b.x][b.y] = distance[a.x][a.y] + 1;
        } else {
            distance[b.x][b.y] = Math.min(distance[a.x][a.y] + 1, distance[b.x][b.y]);
        }
    }
}
