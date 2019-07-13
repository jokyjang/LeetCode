import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groups = new LinkedList<>();
        // Map of anagram key to the index of the group
        Map<String, Integer> groupIndex = new HashMap<>();
        for (String str : strs) {
            String key = calKey(str);
            int index = groupIndex.getOrDefault(key, groups.size());
            if (index == groups.size()) {
                List<String> group = new LinkedList<>();
                group.add(str);
                groups.add(group);
                groupIndex.put(key, index);
            } else {
                List<String> group = groups.get(index);
                group.add(str);
            }
        }
        return groups;
    }

    // Calculate the key of the given str. This key will be the same to all it's anagrams
    private String calKey(String str) {
        int[] times = new int[26];
        for (int i = 0; i < str.length(); ++i) {
            int index = str.charAt(i) - 'a';
            times[index]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times.length; ++i) {
            char letter = (char)('a' + i);
            if (times[i] != 0) {
                sb.append(times[i]);
                sb.append(letter);
            }
        }
        return sb.toString();
    }
}
