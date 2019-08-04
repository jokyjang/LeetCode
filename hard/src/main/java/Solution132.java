public class Solution132 {
    public int minCut(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int[] cuts = new int[s.length()];
        for (int i = 1; i < s.length(); ++i) {
            int minCut = i;
            for (int j = 0; j <= i; ++j) {
                if (isPalindrome(s, j, i)) {
                    if (j > 0) {
                        minCut = Math.min(minCut, cuts[j-1] + 1);
                    } else {
                        minCut = 0;
                        break;
                    }
                }
            }
            cuts[i] = minCut;
        }
        return cuts[s.length() - 1];
    }

    private boolean isPalindrome(String s, int f, int t) {
        while (f < t && s.charAt(f) == s.charAt(t)) {
            f++;
            t--;
        }
        return f >= t;
    }
}
