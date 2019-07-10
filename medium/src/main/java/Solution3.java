public class Solution3 {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        // Maximum length of history non-repeating substring
        int max = 0;
        // Length of current non-repeating substring
        int currentLength = 0;
        // Start index of the current non-repeating substring
        int target = 1;
        // A map from the letter to the last occurring index
        int[] indices = new int[256];

        for (int i = 1; i <= s.length(); ++i) {
            int letterAscii = (int)s.charAt(i - 1);
            int lastKnownIndex = indices[letterAscii];
            if (lastKnownIndex < target) {
                currentLength++;
            } else {
                if (max < currentLength) {
                    max = currentLength;
                }
                currentLength = i - lastKnownIndex;
                target = lastKnownIndex + 1;
            }
            indices[letterAscii] = i;
        }
        if (max > currentLength) {
            return max;
        } else {
            return currentLength;
        }
    }

}
