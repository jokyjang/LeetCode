// TODO
public class Solution221 {
    public int maximalSquare(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int m = matrix.length, n = matrix[0].length, max = 0;
        int[][] v = new int[m+1][n+1];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (matrix[i][j] != '0') {
                    int min = Math.min(
                        v[i][j], Math.min(v[i+1][j], v[i][j+1])
                    );
                    v[i+1][j+1] = 1 + min;
                    max = Math.max(max, v[i+1][j+1]);
                }
            }
        }
        return max*max;
    }
}
