public class Solution130 {
    public void solve(char[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return;
        }
        int m = board.length, n = board[0].length;
        scanBorder(board);
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == '.') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    // DFS search the board, and mark all Os connecting to the borders as 'o'
    private void scanBorder(char[][] board) {
        int m = board.length, n = board[0].length;
        for (int j = 0; j < n; ++j) {
            dfs(board, 0, j);
            if (m-1!=0) dfs(board, m-1, j);
        }
        for (int i = 1; i < m-1; ++i) {
            dfs(board, i, 0);
            if (n-1!=0) dfs(board, i, n-1);
        }
    }

    // index [i, j] must be 'O'
    private void dfs(char[][] board, int i, int j) {
        if (board[i][j] != 'O') {
            return;
        }
        board[i][j] = '.';
        if (i>0) dfs(board, i-1, j);
        if (i<board.length-1) dfs(board, i+1, j);
        if (j>0) dfs(board, i, j-1);
        if (j<board[0].length-1) dfs(board, i, j+1);
    }
}
