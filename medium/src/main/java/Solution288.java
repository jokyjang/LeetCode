import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution288 {
    static class ValidWordAbbr {
        private final Set<String> words;
        private final Map<String, Integer> abbr;

        public ValidWordAbbr(String[] dictionary) {
            abbr = new HashMap<>();
            words = new HashSet<>();
            for (String word : dictionary) {
                if (words.contains(word)) {
                    continue;
                }
                words.add(word);
                String abbrWord = abbr(word);
                int count = abbr.getOrDefault(abbrWord, 0);
                abbr.put(abbrWord, count + 1);
            }
        }

        public boolean isUnique(String word) {
            String abbrWord = abbr(word);
            return (words.contains(word) && abbr.getOrDefault(abbrWord, 0) == 1) ||
                    (!words.contains(word) && !abbr.containsKey(abbrWord));
        }

        // Return the abbreviation of the word
        private String abbr(String word) {
            int length = word.length();
            if (length <= 2) {
                return word;
            }
            return word.charAt(0) + String.valueOf(length - 2) + word.charAt(length - 1);
        }
    }
}
