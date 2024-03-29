public class Solution62 {
    public int uniquePaths(int m, int n) {
        int[][] paths = new int[n][m];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (i == 0 && j == 0) {
                    paths[i][j] = 1;
                } else if (i == 0 || j == 0) {
                    paths[i][j] = 1;
                } else {
                    paths[i][j] = paths[i-1][j] + paths[i][j-1];
                }
            }
        }
        return paths[n-1][m-1];
    }
}
