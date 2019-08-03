public class Solution76 {
    public String minWindow(String s, String t) {
        int[] set = new int[256];
        for (char c : t.toCharArray()) {
            set[c]++;
        }

        int low = 0, high = 0, min = Integer.MAX_VALUE, start = low, counter = t.length();
        while (high < s.length()) {
            if (set[s.charAt(high)] != 0) {
                if (set[s.charAt(high)] > 0) {
                    counter--;
                }
                set[s.charAt(high)]--;
                if (set[s.charAt(high)] == 0) {
                    set[s.charAt(high)] = -1;
                }
            }
            high++;
            while (counter == 0) {
                if (high-low < min) {
                    min = high-low;
                    start = low;
                }
                if (set[s.charAt(low)] < 0) {
                    set[s.charAt(low)]++;
                    if (set[s.charAt(low)] == 0) {
                        counter++;
                        set[s.charAt(low)] = 1;
                    }
                }
                low++;
            }
        }
        return min == Integer.MAX_VALUE ? "" : s.substring(start, start + min);
    }
}
