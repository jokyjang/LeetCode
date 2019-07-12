import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class Solution40Test {

    @Test
    public void combinationSum2() {
        Solution40 solution = new Solution40();
        List<List<Integer>> actual = solution.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8);
        List<List<Integer>> expect = Arrays.asList(
            Arrays.asList(1, 1, 6),
            Arrays.asList(1, 2, 5),
            Arrays.asList(1, 7),
            Arrays.asList(2, 6)
        );
        assertTrue(actual.containsAll(expect) && expect.containsAll(actual));
    }
}