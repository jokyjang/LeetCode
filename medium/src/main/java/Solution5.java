public interface Solution5 {
    String longestPalindrome(String s);

    class Extending implements Solution5 {
        @Override
        public String longestPalindrome(String s) {
            if (s == null || s.isEmpty()) {
                return s;
            }
            int max = 1, index = 0;
            for (int i = 0; i < s.length(); ++i) {
                int l = extend(s, i, i + 1);
                if (l > max) {
                    max = l;
                    index = i - l/2 + 1;
                }
                l = extend(s, i, i);
                if (l > max) {
                    max = l;
                    index = i - l/2;
                }
            }
            return s.substring(index, index + max);
        }

        private int extend(String s, int low, int high) {
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                --low;
                ++high;
            }
            return high - low - 1;
        }
    }

    class Matrix implements Solution5 {
        public String longestPalindrome(String s) {
            if (s.length() == 0) {
                return s;
            }
            int length = s.length();
            int[][] weight = new int[length][length];

            int max = 0;
            int col = -1;
            for (int j = length - 1; j >= 0; --j) {
                for (int i = 0; i < length; ++i) {
                    if (s.charAt(i) == s.charAt(j)) {
                        if (i == 0 || j == length - 1) {
                            weight[i][j] = 1;
                        } else {
                            weight[i][j] = weight[i - 1][j + 1] + 1;
                        }
                        if (weight[i][j] > max && i == j + weight[i][j] - 1) {
                            max = weight[i][j];
                            col = j;
                        }
                    }
                }
            }
            return s.substring(col, col + max);
        }
    }
}
