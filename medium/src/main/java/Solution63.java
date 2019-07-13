public class Solution63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        if (m == 0) {
            return 0;
        }
        int n = obstacleGrid[0].length;
        int[][] paths = new int[m][n];

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (obstacleGrid[i][j] == 1) {
                    paths[i][j] = 0;
                } else if (i == 0 && j == 0) {
                    paths[i][j] = 1;
                } else if (i == 0) {
                    paths[i][j] = paths[i][j-1];
                } else if (j == 0) {
                    paths[i][j] = paths[i-1][j];
                } else {
                    paths[i][j] = paths[i][j-1] + paths[i-1][j];
                }
            }
        }
        return paths[m - 1][n - 1];
    }
}
