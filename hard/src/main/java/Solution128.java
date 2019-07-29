import java.util.HashMap;
import java.util.Map;

public class Solution128 {
    static class Pair {
        int low, high;
        Pair(int low, int high) {
            this.low = low;
            this.high = high;
        }
    }
    public int longestConsecutive(int[] nums) {
        Map<Integer, Pair> map = new HashMap<>();
        int max = 0;
        for (int num : nums) {
            if (map.containsKey(num)) {
                continue;
            }
            Pair low = map.get(num - 1);
            Pair high = map.get(num + 1);
            if (low == null && high == null) {
                map.put(num, new Pair(num, num));
                if (1 > max) {
                    max = 1;
                }
            } else if (low == null) {
                map.put(num, new Pair(num, high.high));
                map.put(high.high, new Pair(num, high.high));
                if (high.high - num + 1 > max) {
                    max = high.high - num + 1;
                }
            } else if (high == null) {
                map.put(num, new Pair(low.low, num));
                map.put(low.low, new Pair(low.low, num));
                if (num - low.low + 1 > max) {
                    max = num - low.low + 1;
                }
            } else {
                map.put(low.low, new Pair(low.low, high.high));
                map.put(high.high, new Pair(low.low, high.high));
                map.put(num, new Pair(low.low, high.high));
                if (high.high - low.low + 1 > max) {
                    max = high.high - low.low + 1;
                }
            }
        }
        return max;
    }
}
