import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution33Test {

    @Test
    public void search() {
        Solution33 solution = new Solution33();
        assertEquals(4, solution.search(new int[]{4,5,6,7,0,1,2}, 0));
        assertEquals(1, solution.search(new int[]{2, 1}, 1));
        assertEquals(-1, solution.search(new int[]{4,5,6,7,0,1,2}, 10));
    }
}