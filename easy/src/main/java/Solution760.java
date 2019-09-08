import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Solution760 {
    public int[] anagramMappings(int[] A, int[] B) {
        Map<Integer, Queue<Integer>> map = new HashMap<>();
        for (int i = 0; i < B.length; ++i) {
            Queue<Integer> list = map.computeIfAbsent(B[i], (key) -> new LinkedList<>());
            list.add(i);
        }
        int[] result = new int[A.length];
        for (int i = 0; i < A.length; ++i) {
            Queue<Integer> list = map.get(A[i]);
            if (list == null || list.isEmpty()) {
                throw new RuntimeException("Invalid input!");
            }
            result[i] = list.poll();
        }
        return result;
    }
}
