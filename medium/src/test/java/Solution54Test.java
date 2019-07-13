import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class Solution54Test {

    @Test
    public void spiralOrder() {
        Solution54 solution = new Solution54();

        List<Integer> actual = solution.spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
        List<Integer> expected = Arrays.asList(1,2,3,6,9,8,7,4,5);
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));

        actual = solution.spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}});
        expected = Arrays.asList(1,2,3,4,8,12,11,10,9,5,6,7);
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }
}