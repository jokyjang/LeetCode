import java.util.ArrayList;
import java.util.List;

public class Solution212 {
    public List<String> findWords(char[][] board, String[] words) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (findWord(board, word)) {
                result.add(word);
            }
        }
        return result;
    }

    private boolean findWord(char[][] board, String word) {
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[i].length; ++j) {
                if (dfs(board, i, j, word, 0) == true) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, int i, int j, String word, int index) {
        if (board[i][j] != word.charAt(index)) {
            return false;
        }
        if (word.length() == index + 1) {
            return true;
        }
        char c = board[i][j];
        board[i][j] = '.';
        if (i < board.length-1 && dfs(board, i+1, j, word, index+1)) {
            board[i][j] = c;
            return true;
        }
        if (i > 0 && dfs(board, i-1, j, word, index+1)) {
            board[i][j] = c;
            return true;
        }
        if (j > 0 && dfs(board, i, j-1, word, index+1)) {
            board[i][j] = c;
            return true;
        }
        if (j < board[i].length-1 && dfs(board, i, j+1, word, index+1)) {
            board[i][j] = c;
            return true;
        }
        board[i][j] = c;
        return false;
    }
}
