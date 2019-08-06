import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

// TODO
public class Solution895 {
    class FreqStack {
        private Map<Integer, Integer> count;
        private List<Stack<Integer>> stack;

        public FreqStack() {
            this.count = new HashMap<>();
            this.stack = new ArrayList<>();
            // this.stack.add(new Stack<>());
        }

        public void push(int x) {
            int freq = count.getOrDefault(x, 0);
            count.put(x, freq + 1);
            if (freq == stack.size()) {
                stack.add(new Stack<>());
            }
            stack.get(freq).push(x);
        }

        public int pop() {
            int value = stack.get(stack.size()-1).pop();
            count.put(value, stack.size() - 1);
            if (stack.get(stack.size()-1).isEmpty()) {
                stack.remove(stack.size()-1);
            }
            return value;
        }
    }

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 */
}
