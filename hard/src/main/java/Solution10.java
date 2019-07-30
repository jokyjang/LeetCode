public class Solution10 {
    public boolean isMatch(String s, String p) {
        if (s == null || p == null) {
            return false;
        }
        int m = s.length(), n = p.length();
        for (int i = 0; i < p.length(); ++i) {
            if (p.charAt(i) == '*') {
                --n;
            }
        }
        boolean[][] match = new boolean[m+1][n+1];
        match[0][0] = true;
        for (int i = 1, j = 0; i <= n && j < p.length(); ++i, ++j) {
            if (j<p.length()-1 && p.charAt(j+1) == '*') {
                match[0][i] = match[0][i-1];
                ++j;
            }
        }

        for (int i = 1; i <= m; ++i) {
            for (int j = 1, k = 0; j <= n && k < p.length(); ++j, ++k) {
                if (k<p.length()-1 && p.charAt(k+1) == '*') {
                    if (p.charAt(k) == '.') {
                        match[i][j] = match[i-1][j] || match[i][j-1];
                    } else if (p.charAt(k) != s.charAt(i-1)) {
                        match[i][j] = match[i][j-1];
                    } else {
                        match[i][j] = match[i-1][j] || match[i][j-1];
                    }
                    ++k;
                } else {
                    match[i][j] = (p.charAt(k) == '.' || s.charAt(i-1) == p.charAt(k)) && match[i-1][j-1];
                }
            }
        }
        return match[m][n];
    }
}
