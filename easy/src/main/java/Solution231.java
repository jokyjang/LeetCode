//TODO
public class Solution231 {
    public boolean isPowerOfTwo(int n) {
        int sum = 0;
        for (int i = 0; i < 31; ++i) {
            sum += n & 0x01;
            n >>= 1;
        }
        return n != -1 && sum == 1;
    }
}
