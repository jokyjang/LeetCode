public class Solution151 {
    public String reverseWords(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        char[] c = s.toCharArray();
        reverse(c, 0, c.length - 1);

        // Timming spaces
        int location = 0;
        for (int i = 0; i < c.length; ++i) {
            if (c[i] != ' ' || (i != 0 && c[i-1] != ' ')) {
                c[location++] = c[i];
            }
        }
        if (location > 0 && c[location - 1] == ' ') {
            location--;
        }

        int leading = 0;
        for (int i = 0; i < location; ++i) {
            if (c[i] == ' ') {
                reverse(c, leading, i - 1);
                leading = i + 1;
            }
        }
        reverse(c, leading, location - 1);
        return new String(c).substring(0, location);
    }

    private void reverse(char[] c, int low, int high) {
        while (low < high) {
            char temp = c[low];
            c[low] = c[high];
            c[high] = temp;
            low++;
            high--;
        }
    }
}
