public class Solution48 {
    public void rotate(int[][] matrix) {
        rotate(matrix, 0, matrix.length);
    }

    // Rotate the submatrix of matrix from index i in-place
    private void rotate(int[][] matrix, int i, int length) {
        if (length <= 1) {
            return;
        }
        for (int j = 0; j < length - 1; ++j) {
            int temp = matrix[i][i+j];
            matrix[i][i+j] = matrix[i+length-1-j][i];
            matrix[i+length-1-j][i] = matrix[i+length-1][i+length-1-j];
            matrix[i+length-1][i+length-1-j] = matrix[i+j][i+length-1];
            matrix[i+j][i+length-1] = temp;
        }
        rotate(matrix, i + 1, length - 2);
    }
}
