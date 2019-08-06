import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// TODO
public class Solution207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        List<Integer>[] graph = new List[numCourses];
        for (int i = 0; i < numCourses; ++i) {
            graph[i] = new ArrayList<>();
        }

        // Build the graph and indegree
        for (int[] p : prerequisites) {
            indegree[p[0]]++;
            graph[p[1]].add(p[0]);
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; ++i) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        int count = 0;
        while (!queue.isEmpty()) {
            int course = queue.poll();
            ++count;
            for (int d : graph[course]) {
                if (--indegree[d] == 0) {
                    queue.add(d);
                }
            }
            if (count == numCourses) {
                break;
            }
        }

        return queue.isEmpty() && count == numCourses;
    }
}
