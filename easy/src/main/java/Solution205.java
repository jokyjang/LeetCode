import java.util.HashMap;
import java.util.Map;

public class Solution205 {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            Character s2t = map1.get(s.charAt(i));
            Character t2s = map2.get(t.charAt(i));

            if (s2t == null && t2s == null) {
                map1.put(s.charAt(i), t.charAt(i));
                map2.put(t.charAt(i), s.charAt(i));
            } else if (s2t != null && t2s != null) {
                if (s2t != t.charAt(i) || t2s != s.charAt(i)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
