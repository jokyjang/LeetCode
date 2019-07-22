import org.junit.Test;

import static org.junit.Assert.*;

public class Solution146Test {

    @Test
    public void lruCache() {
        Solution146 solution = new Solution146(2);

        solution.put(2, 1);
        solution.put(1, 1);
        solution.put(2, 3);
        solution.put(4, 1);
        assertEquals(-1, solution.get(-1));
        assertEquals(3, solution.get(2));
    }

}