import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class Solution93Test {

    @Test
    public void restoreIpAddress() {
        Solution93 solution = new Solution93();

        List<String> actual = solution.restoreIpAddresses("25525511135");
        List<String> expected = Arrays.asList("255.255.11.135", "255.255.111.35");
        assertTrue(actual.containsAll(expected) && expected.containsAll(actual));
    }

}