import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Solution205Test {

    @Test
    public void isIsomorphic() {
        Solution205 solution = new Solution205();

        assertTrue(solution.isIsomorphic("egg", "add"));
        assertFalse(solution.isIsomorphic("ab", "aa"));
    }
}