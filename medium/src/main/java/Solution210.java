import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// TODO
public class Solution210 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer>[] graph = new List[numCourses];
        for (int i = 0; i < graph.length; ++i) {
            graph[i] = new ArrayList<>();
        }

        int[] degree = new int[numCourses];
        for (int[] p : prerequisites) {
            degree[p[0]]++;
            graph[p[1]].add(p[0]);
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < degree.length; ++i) {
            if (degree[i] == 0) {
                queue.add(i);
            }
        }

        int[] result = new int[numCourses];
        int i = 0;
        while (!queue.isEmpty()) {
            int c = queue.poll();
            result[i++] = c;
            for (int j = 0; j < graph[c].size(); ++j) {
                degree[graph[c].get(j)]--;
                if (degree[graph[c].get(j)] == 0) {
                    queue.add(graph[c].get(j));
                }
            }
        }
        return i == numCourses ? result : new int[]{};
    }
}
