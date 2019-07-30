public class Solution44 {
    public boolean isMatch(String s, String p) {
        if (s == null || p == null) {
            return false;
        }
        int m = s.length(), n = p.length();
        boolean[][] match = new boolean[m+1][n+1];
        match[0][0] = true;
        for (int i = 1; i <= n; ++i) {
            match[0][i] = match[0][i-1] && p.charAt(i-1) == '*';
        }
        for (int i = 1; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (p.charAt(j-1) == '*') {
                    match[i][j] = match[i-1][j] || match[i][j-1];
                } else {
                    match[i][j] = (p.charAt(j-1) == '?' || p.charAt(j-1) == s.charAt(i-1)) && (match[i-1][j-1]);
                }
            }
        }
        return match[m][n];
    }
}
