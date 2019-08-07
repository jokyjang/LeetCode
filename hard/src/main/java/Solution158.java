public class Solution158 {
    class Reader4 {
        protected int read4(char[] buf) {
            return 0;
        }
    }
    /**
     * The read4 API is defined in the parent class Reader4.
     *     int read4(char[] buf);
     */
    public class Solution extends Reader4 {
        private char[] buf4 = new char[4];
        private int bufS = 0;
        private int bufLen = 0;

        /**
         * @param buf Destination buffer
         * @param n   Number of characters to read
         * @return    The number of actual characters read
         */
        public int read(char[] buf, int n) {
            int length = 0;
            if (bufLen >= n) {
                // System.out.println(bufS);
                copy(buf4, bufS, buf, length, n);
                bufS = (bufS + n) % 4;
                bufLen -= n;
                return n;
            } else if (bufLen != 0) {
                System.out.println(bufS);
                copy(buf4, bufS, buf, length, bufLen);
                length += bufLen;
                n -= bufLen;
                bufLen = 0;
                bufS = 0;
            }
            while (n > 0) {
                int l = read4(buf4);
                if (l >= n) {
                    copy(buf4, 0, buf, length, n);
                    length += n;
                    bufS = n;
                    bufLen = l - n;
                    break;
                } else {
                    copy(buf4, 0, buf, length, l);
                    length += l;
                    n -= l;
                    if (l < 4) {
                        break;
                    }
                }
            }
            return length;
        }

        private void copy(char[] s, int i, char[] d, int j, int l) {
            while (l-- > 0) {
                d[j++] = s[i++];
            }
        }
    }
}
