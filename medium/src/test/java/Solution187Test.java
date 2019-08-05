import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class Solution187Test {

    @Test
    public void findRepeatedDnaSequences() {
        Solution187 solution = new Solution187();
        List<String> actual = solution.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");
        List<String> expected = Arrays.asList("AAAAACCCCC", "CCCCCAAAAA");
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }
}