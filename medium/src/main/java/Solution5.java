public class Solution5 {
    public String longestPalindrome(String s) {
        if (s.length() == 0) {
            return s;
        }
        int length = s.length();
        int[][] weight = new int[length][length];

        int max = 0;
        int col = -1;
        for (int j = length - 1; j >= 0; --j) {
            for (int i = 0; i < length; ++i) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (i == 0 || j == length - 1) {
                        weight[i][j] = 1;
                    } else {
                        weight[i][j] = weight[i - 1][j + 1] + 1;
                    }
                    if (weight[i][j] > max && i == j + weight[i][j] - 1) {
                        max = weight[i][j];
                        col = j;
                    }
                }
            }
        }
        return s.substring(col, col + max);
    }
}
