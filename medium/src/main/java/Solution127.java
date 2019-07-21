import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

// TODO replace with a faster and succinct solution
public class Solution127 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Map<String, Set<String>> intermediates = new HashMap<>();
        for (String word : wordList) {
            for (int i = 0; i < word.length(); ++i) {
                intermediates.computeIfAbsent(
                    transform(word, i), (key) -> new HashSet<String>()
                ).add(word);
            }
        }

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        Map<String, Integer> marker = new HashMap<>();
        marker.put(beginWord, 1);

        while (!queue.isEmpty()) {
            String word = queue.poll();
            int currentLength = marker.get(word);
            for (int i = 0; i < word.length(); ++i) {
                String key = transform(word, i);
                Set<String> values = intermediates.get(key);
                if (values == null) {
                    continue;
                }
                for (String next : values) {
                    if (marker.containsKey(next)) {
                        continue;
                    }
                    if (next.equals(endWord)) {
                        return currentLength + 1;
                    }
                    queue.add(next);
                    marker.put(next, currentLength + 1);
                }
            }
        }
        return 0;
    }

    private String transform(String word, int index) {
        StringBuilder sb = new StringBuilder(word);
        sb.setCharAt(index, '*');
        return sb.toString();
    }
}
