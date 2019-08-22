import java.util.HashMap;
import java.util.Map;

//TODO
public class Solution290 {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        String[] pattern2Word = new String[26];
        Map<String, Character> word2Pattern = new HashMap<>();
        if (pattern.length() != words.length) {
            return false;
        }
        for (int i = 0; i < pattern.length(); ++i) {
            String p = pattern2Word[pattern.charAt(i)-'a'];
            Character w = word2Pattern.get(words[i]);
            if (p != null && w != null) {
                if (!p.equals(words[i]) || w != pattern.charAt(i)) {
                    return false;
                }
            } else if (p == null && w == null) {
                pattern2Word[pattern.charAt(i)-'a'] = words[i];
                word2Pattern.put(words[i], pattern.charAt(i));
            } else {
                return false;
            }
        }
        return true;
    }
}
