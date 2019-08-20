import java.util.LinkedList;
import java.util.Queue;

//TODO
public class Solution490 {
    private static final int MARKER = 2;
    private static final int UP = 0;
    private static final int DOWN = 1;
    private static final int LEFT = 2;
    private static final int RIGHT = 3;

    static class PathNode {
        int x;
        int y;
        PathNode next;
        PathNode(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
        PathNode root = new PathNode(start[0], start[1]);
        maze[root.x][root.y] = MARKER;
        Queue<PathNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            PathNode node = queue.poll();
            if (node.x == destination[0] && node.y == destination[1]) {
                return true;
            }
            access(maze, node, UP, queue);
            access(maze, node, DOWN, queue);
            access(maze, node, LEFT, queue);
            access(maze, node, RIGHT, queue);
        }
        return false;
    }

    private void access(int[][] maze, PathNode current, int dir, Queue<PathNode> queue) {
        int m = maze.length, n = maze[0].length;
        int x = current.x, y = current.y;
        if (dir == UP) {
            --x;
            while (x >= 0 && maze[x][y] == 0) --x;
            if (x < 0 || maze[x][y] == 1) {
                x++;
            } else return;
        } else if (dir == DOWN) {
            ++x;
            while (x < m && maze[x][y] == 0) ++x;
            if (x == m || maze[x][y] == 1) {
                x--;
            } else return;
        } else if (dir == LEFT) {
            --y;
            while (y >= 0 && maze[x][y] == 0) --y;
            if (y < 0 || maze[x][y] == 1) {
                y++;
            } else return;
        } else if (dir == RIGHT) {
            ++y;
            while (y < n && maze[x][y] == 0) ++y;
            if (y == n || maze[x][y] == 1) {
                y--;
            } else return;
        }
        if (maze[x][y] != 0) return;
        PathNode next = new PathNode(x, y);
        next.next = current;
        queue.add(next);
        maze[x][y] = MARKER;
    }
}
