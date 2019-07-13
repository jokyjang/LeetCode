import java.util.ArrayList;
import java.util.List;

public class Solution54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix.length == 0 || matrix[0].length == 0) {
            return list;
        }
        spiralSubmatrix(matrix, 0, 0, matrix[0].length, matrix.length, list);
        return list;
    }

    // Spiral the submatrix with the topleft coordinate being i, j and the length and width being l, w
    private void spiralSubmatrix(int[][] matrix, int i, int j, int l, int w, List<Integer> list) {
        // To the right
        for (int x = i, y = j; y < j + l; ++y) {
            list.add(matrix[x][y]);
        }
        // To the bottom
        for (int x = i + 1, y = j + l - 1; x < i + w; ++x) {
            list.add(matrix[x][y]);
        }
        // To the left
        if (w > 1) {
            for (int x = i + w - 1, y = j + l - 2; y >= j; --y) {
                list.add(matrix[x][y]);
            }
        }
        // To the top
        if (l > 1) {
            for (int x = i + w - 2, y = j; x > i; --x) {
                list.add(matrix[x][y]);
            }
        }
        if (i + 1 < i + w - 1 && j + 1 < j + l - 1) {
            spiralSubmatrix(matrix, i + 1, j + 1, l - 2, w - 2, list);
        }
    }
}
