import java.util.Stack;

public class Solution155 {
    private Stack<Long> stack;
    private long min;

    /** initialize your data structure here. */
    public Solution155() {
        stack = new Stack<>();
    }

    public void push(int x) {
        if (stack.isEmpty()) {
            stack.push(0L);
            min = x;
        } else {
            stack.push(x - min);
            if (x < min) {
                min = x;
            }
        }
    }

    public void pop() {
        long top = stack.pop();
        if (top < 0) {
            min = min - top;
        }
    }

    public int top() {
        long top = stack.peek();
        if (top < 0) {
            return (int)min;
        } else {
            return (int)(top + min);
        }
    }

    public int getMin() {
        return (int)min;
    }
}
