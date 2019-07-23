public class Solution161 {
    public boolean isOneEditDistance(String s, String t) {
        if (s.length() > t.length()) {
            String temp = s;
            s = t;
            t = temp;
        }

        if (t.length() - s.length() > 1) {
            return false;
        }

        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) != t.charAt(i)) {
                if (s.length() == t.length()) {
                    return s.substring(i+1).equals(t.substring(i+1));
                } else {
                    return s.substring(i).equals(t.substring(i+1));
                }
            }
        }
        return s.length() != t.length();
    }
}
