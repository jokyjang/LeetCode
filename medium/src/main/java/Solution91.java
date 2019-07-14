public class Solution91 {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0') {
            return 0;
        }
        // Since the code could be at most two digits, we use two variables to denote
        // the ways of decoding for s.substring(0, i) and s.substring(0, i+1)
        // The numDecodings("") is 1
        int slowDecodingNum = 1;
        // The numDecodings(s.substring(0, 1)) is 1 since all 1-9 are valid code
        int fastDecodingNum = 1;
        for (int i = 1; i < s.length(); ++i) {
            int currentNumDecodings = 0;
            int currentCode = s.charAt(i) - '0';
            if (currentCode != 0) {
                currentNumDecodings += fastDecodingNum;
            }
            currentCode += 10 * (s.charAt(i-1) - '0');
            if (currentCode >= 10 && currentCode <= 26) {
                currentNumDecodings += slowDecodingNum;
            }
            slowDecodingNum = fastDecodingNum;
            fastDecodingNum = currentNumDecodings;
        }
        return fastDecodingNum;
    }
}
