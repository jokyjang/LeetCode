import java.util.Stack;

public class Solution84 {
    private class Pair {
        int index;
        int area;

        Pair(int index, int area) {
            this.index = index;
            this.area = area;
        }
    }

    public int largestRectangleArea(int[] heights) {
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
