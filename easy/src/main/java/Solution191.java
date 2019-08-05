public class Solution191 {
    public int hammingWeight(int n) {
        int result = 0;
        for (int i = 0; i < 32; ++i) {
            result += n & 0x01;
            n >>= 1;
        }
        return result;
    }
}
