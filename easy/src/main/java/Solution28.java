public class Solution28 {
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.isEmpty()) {
            return 0;
        }
        if (haystack == null || haystack.length() < needle.length()) {
            return -1;
        }

        for (int i = 0; i < haystack.length() - needle.length() + 1; ++i) {
            int k = i;
            for (int j = 0; j < needle.length(); ++j, ++k) {
                if (haystack.charAt(k) != needle.charAt(j)) {
                    break;
                }
            }
            if (k == i + needle.length()) {
                return i;
            }
        }
        return -1;
    }
}
