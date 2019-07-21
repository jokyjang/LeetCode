public class Solution125 {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }

        int low = 0, high = s.length() - 1;
        while (low < high) {
            if (!isValid(s.charAt(low))) {
                ++low;
            } else if (!isValid(s.charAt(high))) {
                --high;
            } else if (Character.toLowerCase(s.charAt(low)) != Character.toLowerCase(s.charAt(high))) {
                return false;
            } else {
                ++low;
                --high;
            }
        }
        return true;
    }

    private boolean isValid(char ch) {
        return Character.isAlphabetic(ch) || Character.isDigit(ch);
    }
}
