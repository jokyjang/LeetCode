import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution170 {
    static class TwoSum {
        private final Map<Integer, Set<Integer>> values;
        private int index;

        /** Initialize your data structure here. */
        public TwoSum() {
            values = new HashMap<>();
            index = 0;
        }

        /** Add the number to an internal data structure.. */
        public void add(int number) {
            Set<Integer> indices = values.computeIfAbsent(number, (key) -> new HashSet<>());
            indices.add(index++);
        }

        /** Find if there exists any pair of numbers which sum is equal to the value. */
        public boolean find(int value) {
            for (Integer next : values.keySet()) {
                if (value - next == next) {
                    if (values.get(next) != null && values.get(next).size() >= 2) {
                        return true;
                    } else {
                        continue;
                    }
                }
                if (values.containsKey(value - next)) {
                    return true;
                }
            }
            return false;
        }
    }
}
