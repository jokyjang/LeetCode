import java.util.Stack;

// TODO there is a DP solution, think about that.
public class Solution85 {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int m = matrix.length, n = matrix[0].length;
        int[][] heights = new int[m][n];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                int prevHeight = i > 0 ? heights[i-1][j] : 0;
                heights[i][j] = matrix[i][j] == '0' ? 0 : prevHeight + 1;
            }
        }
        int max = 0;
        for (int i = 0; i < m; ++i) {
            max = Math.max(max, largestRectangleArea(heights[i]));
        }
        return max;
    }

    private class Pair {
        int index;
        int area;

        Pair(int index, int area) {
            this.index = index;
            this.area = area;
        }
    }

    private int largestRectangleArea(int[] heights) {
        Stack<Pair> stack = new Stack<>();
        int max = 0;
        for (int i = 0; i < heights.length; ++i) {
            if (!stack.isEmpty() && heights[stack.peek().index] > heights[i]) {
                int rightBoundary = stack.peek().index;
                while (!stack.isEmpty() && heights[stack.peek().index] > heights[i]) {
                    Pair pair = stack.pop();
                    pair.area += (rightBoundary-pair.index) * heights[pair.index];
                    max = Math.max(max, pair.area);
                }
            }
            int leftBoundary = stack.isEmpty() ? 0 : stack.peek().index + 1;
            stack.push(new Pair(i, heights[i] * (i+1-leftBoundary)));
        }
        if (!stack.isEmpty()) {
            int rightBoundary = stack.peek().index;
            while (!stack.isEmpty()) {
                Pair pair = stack.pop();
                pair.area += (rightBoundary-pair.index) * heights[pair.index];
                max = Math.max(max, pair.area);
            }
        }
        return max;
    }
}
