public class Solution36 {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rowMark = new boolean[9][9];
        boolean[][] colMark = new boolean[9][9];
        boolean[][] cubMark = new boolean[9][9];

        for (int i = 0; i < 9; ++i) { // For each row
            for (int j = 0; j < 9; ++j) { // For each column
                if (board[i][j] == '.') {
                    continue;
                }
                int number = board[i][j] - '0';
                if (rowMark[i][number - 1] || colMark[j][number - 1] || cubMark[whichCub(i, j)][number - 1]) {
                    return false;
                } else {
                    rowMark[i][number - 1] = true;
                    colMark[j][number - 1] = true;
                    cubMark[whichCub(i, j)][number - 1] = true;
                }
            }
        }
        return true;
    }

    // Which cube index for the given row i and colum j
    private int whichCub(int i, int j) {
        return (i/3)*3 + (j/3);
    }
}
