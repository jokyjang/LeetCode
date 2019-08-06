// TODO
public class Solution348 {
    class TicTacToe {
        private int n;
        private char[][] board;
        private char[] mark;

        /** Initialize your data structure here. */
        public TicTacToe(int n) {
            this.n = n;
            this.board = new char[n][n];
            this.mark = new char[]{'.', 'X', 'O'};
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < n; ++j) {
                    board[i][j] = mark[0];
                }
            }
        }

        /** Player {player} makes a move at ({row}, {col}).
         @param row The row of the board.
         @param col The column of the board.
         @param player The player, can be either 1 or 2.
         @return The current winning condition, can be either:
         0: No one wins.
         1: Player 1 wins.
         2: Player 2 wins. */
        public int move(int row, int col, int player) {
            if (row < 0 || row >= n || col < 0 || col >= n) {
                throw new RuntimeException("Row col not valid!");
            }
            if (player < 1 || player > 2) {
                throw new RuntimeException("Player not valid!");
            }
            if (board[row][col] != mark[0]) {
                throw new RuntimeException("Move not valid!");
            }
            board[row][col] = mark[player];
            return hasWon(row, col, player);
        }

        private int hasWon(int row, int col, int player) {
            int i = 0;
            while (i < n && board[row][i] == mark[player]) {
                ++i;
            }
            if (i == n) return player;
            i = 0;
            while (i < n && board[i][col] == mark[player]) {
                ++i;
            }
            if (i == n) return player;
            if (row == col) {
                i = 0;
                while (i < n && board[i][i] == mark[player]) {
                    ++i;
                }
                if (i == n) return player;
            }
            if (row + col == n - 1) {
                i = 0;
                while (i < n && board[i][n-1-i] == mark[player]) {
                    ++i;
                }
                if (i == n) return player;
            }
            return 0;
        }
    }
}
