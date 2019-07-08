import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Solution288Test {

    @Test
    public void isUnique() {
        String[] dictionary = new String[]{"deer", "door", "cake", "card"};
        Solution288.ValidWordAbbr abbr = new Solution288.ValidWordAbbr(dictionary);

        assertFalse(abbr.isUnique("dear"));
        assertTrue(abbr.isUnique("cart"));
        assertFalse(abbr.isUnique("cane"));
        assertTrue(abbr.isUnique("make"));
    }

    @Test
    public void isUnique_repeat() {
        String[] dictionary = new String[]{"a", "a"};
        Solution288.ValidWordAbbr abbr = new Solution288.ValidWordAbbr(dictionary);

        assertTrue(abbr.isUnique("a"));
    }

    @Test
    public void isUnique_notInDictionary() {
        String[] dictionary = new String[]{"a", "bccb"};
        Solution288.ValidWordAbbr abbr = new Solution288.ValidWordAbbr(dictionary);

        assertFalse(abbr.isUnique("baab"));
    }
}