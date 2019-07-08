import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class Solution90Test {

    @Test
    public void subsetsWithDup() {
        List<List<Integer>> subsets = new Solution90().subsetsWithDup(new int[]{1, 2, 2});
        List<List<Integer>> result = new ArrayList<>();
        result.add(Collections.emptyList());
        result.add(Collections.singletonList(1));
        result.add(Collections.singletonList(2));
        result.add(Arrays.asList(1, 2));
        result.add(Arrays.asList(2, 2));
        result.add(Arrays.asList(1, 2, 2));
        assertTrue(subsets.containsAll(result));
        assertTrue(result.containsAll(subsets));
    }
}