public class Solution159 {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        if (s.length() <= 2) {
            return s.length();
        }
        int low = 0, high = 2, max = 2;
        int fIndex = 0, sIndex = 1;
        char first = s.charAt(0), second = s.charAt(1);
        while (high < s.length()) {
            if (s.charAt(high) == first) {
                fIndex = high;
            } else if (s.charAt(high) == second) {
                sIndex = high;
            } else if (first == second) {
                fIndex = Math.max(fIndex, sIndex);
                second = s.charAt(high);
                sIndex = high;
            } else {
                max = Math.max(max, high - low);
                if (fIndex > sIndex) {
                    low = sIndex + 1;
                    second = s.charAt(high);
                    sIndex = high;
                } else {
                    low = fIndex + 1;
                    first = s.charAt(high);
                    fIndex = high;
                }
            }
            ++high;
        }
        max = Math.max(max, high - low);
        return max;
    }
}
