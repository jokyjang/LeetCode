public class Solution59 {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int i = 0;
        int j = 0;
        int starter = 1;
        int l = n;
        while (l > 0) {
            for (int x = i, y = j; y < j+l; ++y) {
                result[x][y] = starter++;
            }
            for (int x = i+1, y = j+l-1; x < i+l; ++x) {
                result[x][y] = starter++;
            }
            for (int x = i+l-1, y = j+l-2; y >= j; --y) {
                result[x][y] = starter++;
            }
            for (int x = i+l-2, y = j; x > i; --x) {
                result[x][y] = starter++;
            }
            ++i;
            ++j;
            l -= 2;
        }
        return result;
    }
}
