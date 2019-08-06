import java.util.PriorityQueue;

// TODO
public class Solution295 {
    class MedianFinder {
        private PriorityQueue<Integer> min;
        private PriorityQueue<Integer> max;
        private int minSize, maxSize;

        /** initialize your data structure here. */
        public MedianFinder() {
            minSize = 0;
            maxSize = 0;
            min = new PriorityQueue<>();
            max = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        }

        public void addNum(int num) {
            if (maxSize == 0 || (maxSize == minSize && num <= min.peek())) {
                max.add(num);
                ++maxSize;
            } else if (maxSize > minSize && num <= max.peek()) {
                max.add(num);
                min.add(max.poll());
                ++minSize;
            } else if (maxSize > minSize) {
                min.add(num);
                ++minSize;
            } else {
                min.add(num);
                max.add(min.poll());
                ++maxSize;
            }
        }

        public double findMedian() {
            if (maxSize > minSize) {
                return (double)max.peek();
            } else {
                return (min.peek() + max.peek())/2.0;
            }
        }
    }
}
