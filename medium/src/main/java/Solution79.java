public class Solution79 {
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return false;
        }
        if (word.length() == 0) {
            return true;
        }
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (dfs(board, i, j, word, 0, new boolean[board.length][board[0].length])) {
                    return true;
                }
            }
        }
        return false;
    }

    // DFS search for the target word from the coordinate i, j excluding the direction:
    // 0 - no; 1 - up; 2 - down; 3 - left; 4 - right
    private boolean dfs(char[][] board, int i, int j, String word, int index, boolean[][] marker) {
        if (board[i][j] != word.charAt(index)) {
            return false;
        } else if (word.length() - 1 == index) {
            return true;
        }
        marker[i][j] = true;

        if (i > 0 && !marker[i-1][j]) {
            if (dfs(board, i-1, j, word, index+1, marker)) {
                return true;
            }
        }
        if (i < board.length - 1 && !marker[i+1][j]) {
            if (dfs(board, i+1, j, word, index+1, marker)) {
                return true;
            }
        }
        if (j > 0 && !marker[i][j-1]) {
            if (dfs(board, i, j-1, word, index+1, marker)) {
                return true;
            }
        }
        if (j < board[0].length - 1 && !marker[i][j+1]) {
            if (dfs(board, i, j+1, word, index+1, marker)) {
                return true;
            }
        }
        marker[i][j] = false;
        return false;
    }
}
