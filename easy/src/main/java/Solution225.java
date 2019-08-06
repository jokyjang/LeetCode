import java.util.LinkedList;
import java.util.Queue;

// TODO
public class Solution225 {
    class MyStack {
        private Queue<Integer> queue;

        /** Initialize your data structure here. */
        public MyStack() {
            this.queue = new LinkedList<>();
        }

        /** Push element x onto stack. */
        public void push(int x) {
            int size = queue.size();
            queue.add(x);
            while (size > 0) {
                queue.add(queue.poll());
                --size;
            }
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            return queue.poll();
        }

        /** Get the top element. */
        public int top() {
            return queue.peek();
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return queue.isEmpty();
        }
    }
}
