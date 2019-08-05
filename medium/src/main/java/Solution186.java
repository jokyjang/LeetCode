public class Solution186 {
    public void reverseWords(char[] s) {
        reverse(s, 0, s.length - 1);
        int start = 0;
        for (int i = 0; i < s.length; ++i) {
            if (s[i] == ' ') {
                reverse(s, start, i - 1);
                start = i + 1;
            }
        }
        reverse(s, start, s.length - 1);
    }

    private void reverse(char[] s, int low, int high) {
        while (low < high) {
            char temp = s[low];
            s[low] = s[high];
            s[high] = temp;
            low++;
            high--;
        }
    }
}
