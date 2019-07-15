import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        if (s.isEmpty()) {
            return true;
        }
        Set<String> wordSet = new HashSet<>(wordDict);
        List<Integer> validSet = new ArrayList<>();
        validSet.add(0);
        for (int i = 1; i <= s.length(); ++i) {
            int length = validSet.size();
            for (int j = 0; j < length; ++j) {
                int index = validSet.get(j);
                if (wordSet.contains(s.substring(index, i))) {
                    if (i == s.length()) {
                        return true;
                    }
                    validSet.add(i);
                    break;
                }
            }
        }
        return false;
    }
}
