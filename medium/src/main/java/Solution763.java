import java.util.ArrayList;
import java.util.List;

// TODO
public class Solution763 {
    public List<Integer> partitionLabels(String S) {
        List<Integer> result = new ArrayList<>();
        if (S == null || S.isEmpty()) {
            return result;
        }
        int[] lastIndex = new int[26];
        char[] s = S.toCharArray();
        for (int i = 0; i < s.length; ++i) {
            lastIndex[s[i]-'a'] = i;
        }

        int low = 0, high = lastIndex[s[low]-'a'], current = low;
        while (current < s.length) {
            if (current == high) {
                result.add(high-low+1);
                if (++current < s.length) {
                    low = current;
                    high = lastIndex[s[current]-'a'];
                }
            } else {
                high = Math.max(high, lastIndex[s[current]-'a']);
                current++;
            }
        }
        return result;
    }
}
