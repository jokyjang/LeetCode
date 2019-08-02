import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution96Test {

    @Test
    public void numTree() {
        Solution96 solution = new Solution96();
        assertEquals(5, solution.numTrees(3));
        assertEquals(14, solution.numTrees(4));
    }
}