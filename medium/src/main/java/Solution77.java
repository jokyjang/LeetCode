import java.util.ArrayList;
import java.util.List;

public class Solution77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> set = new ArrayList<>();
        combine(set, new ArrayList<Integer>(), 1, n, k);
        return set;
    }

    private void combine(List<List<Integer>> set, List<Integer> prefix, int low, int n, int k) {
        if (k == 0) {
            set.add(new ArrayList<Integer>(prefix));
            return;
        }
        for (int i = low; i+k-1 <= n; ++i) {
            prefix.add(i);
            combine(set, prefix, i+1, n, k-1);
            prefix.remove(prefix.size() - 1);
        }
    }
}
