import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class Solution89Test {

    @Test
    public void grayCode() {
        Solution89 solution = new Solution89();

        List<Integer> expected = Arrays.asList(0, 1, 2, 3);
        List<Integer> actual = solution.grayCode(2);
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }

}