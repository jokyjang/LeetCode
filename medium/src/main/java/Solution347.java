import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// TODO add tests
public class Solution347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        for (int i = 0; i < nums.length + 1; ++i) {
            buckets[i] = new ArrayList<>();
        }
        count.forEach((key, value) -> {
            buckets[value].add(key);
        });

        List<Integer> result = new ArrayList<>();
        for (int i = buckets.length - 1; i >= 0 && k > 0; --i) {
            for (int j = 0; j < buckets[i].size() && k > 0; ++j) {
                result.add(buckets[i].get(j));
                --k;
            }
        }
        return result;
    }
}
