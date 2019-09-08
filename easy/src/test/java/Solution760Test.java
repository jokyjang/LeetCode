import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution760Test {

    @Test
    public void anagramMapping() {
        Solution760 solution = new Solution760();
        assertArrayEquals(new int[]{1, 4, 3, 2, 0},
            solution.anagramMappings(new int[]{12, 28, 46, 32, 50},
                new int[]{50, 12, 32, 46, 28}));
    }
}