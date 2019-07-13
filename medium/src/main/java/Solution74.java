public class Solution74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int col = matrix[0].length;

        int targetRow = -1;
        int low = 0;
        int high = matrix.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (matrix[middle][0] <= target && matrix[middle][col-1] >= target) {
                targetRow = middle;
                break;
            } else if (matrix[middle][0] > target) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        if (targetRow == -1) {
            return false;
        }
        low = 0;
        high = col - 1;
        while (low <= high) {
            int index = (low + high) / 2;
            if (matrix[targetRow][index] == target) {
                return true;
            } else if (matrix[targetRow][index] > target) {
                high = index - 1;
            } else {
                low = index + 1;
            }
        }
        return false;
    }
}
