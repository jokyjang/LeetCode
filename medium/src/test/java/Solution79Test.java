import org.junit.Test;

import static org.junit.Assert.*;

public class Solution79Test {

    @Test
    public void exist() {
        Solution79 solution = new Solution79();

        assertTrue(solution.exist(new char[][]{{'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}}, "ABCCED"));
        assertFalse(solution.exist(new char[][]{{'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}}, "ABCB"));
        assertFalse(solution.exist(new char[][]{{'a','a','a','a'}, {'a','a','a','a'}, {'a','a','a','a'}}, "aaaaaaaaaaaaa"));
    }

}