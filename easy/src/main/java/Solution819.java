import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

// TODO tests
public class Solution819 {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedWords = Arrays.stream(banned).collect(Collectors.toSet());
        char[] p = paragraph.toCharArray();

        Map<String, Integer> count = new HashMap<>();
        String result = null;
        int max = 0, i = 0;
        while (i < p.length) {
            int low = i;
            while (low < p.length && !valid(p[low])) {
                ++low;
            }
            if (low == p.length) break;
            int high = low+1;
            while (high < p.length && valid(p[high])) {
                ++high;
            }

            String key = paragraph.substring(low, high).toLowerCase();
            if (!bannedWords.contains(key)) {
                int newCount = count.getOrDefault(key, 0) + 1;
                if (newCount > max) {
                    max = newCount;
                    result = key;
                }
                count.put(key, newCount);
            }
            i = high + 1;
        }
        return result;
    }

    private boolean valid(char c) {
        return ('a' <= c && 'z' >= c) || ('A' <= c && 'Z' >= c);
    }
}
