import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Solution133 {
    public GraphNode cloneGraph(GraphNode node) {
        if (node == null) {
            return null;
        }

        Map<GraphNode, GraphNode> clones = new HashMap<>();

        GraphNode clone = new GraphNode(node.val, new ArrayList<GraphNode>());
        clones.put(node, clone);
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            GraphNode current = queue.poll();
            GraphNode currentClone = clones.get(current);
            for (GraphNode next : current.neighbors) {
                if (!clones.containsKey(next)) {
                    queue.add(next);
                }
                GraphNode nextClone = clones.computeIfAbsent(next,
                    (key) -> new GraphNode(key.val, new ArrayList<GraphNode>()));
                currentClone.neighbors.add(nextClone);

            }
        }
        return clone;
    }
}
