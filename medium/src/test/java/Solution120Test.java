import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Solution120Test {

    @Test
    public void minimumTotal() {
        Solution120 solution = new Solution120();

        assertEquals(11, solution.minimumTotal(Arrays.asList(
            Arrays.asList(2),
            Arrays.asList(3, 4),
            Arrays.asList(6, 5, 7),
            Arrays.asList(4, 1, 8, 3)
        )));
    }
}