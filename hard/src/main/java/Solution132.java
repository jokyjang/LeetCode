public class Solution132 {
    public int minCut(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int[] cuts = new int[s.length()];
        boolean[][] isPal = new boolean[s.length()][s.length()];
        for (int i = 1; i < s.length(); ++i) {
            int minCut = i;
            for (int j = 0; j <= i; ++j) {
                if (s.charAt(j) == s.charAt(i) && (j+1>=i-1 || isPal[j+1][i-1])) {
                    isPal[j][i] = true;
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
}
