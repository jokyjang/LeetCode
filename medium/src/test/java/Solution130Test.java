import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution130Test {

    @Test
    public void solve() {
        Solution130 solution = new Solution130();
        char[][] board = new char[][]{
            {'X','X','X','X'},
            {'X','O','O','X'},
            {'X','X','O','X'},
            {'X','O','X','X'}
        };
        solution.solve(board);
        assertArrayEquals(
            new char[][] {
                {'X','X','X','X'},
                {'X','X','X','X'},
                {'X','X','X','X'},
                {'X','O','X','X'}
            },
            board
        );
    }
}