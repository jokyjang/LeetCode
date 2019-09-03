// TODO
public class Solution276 {
    public int numWays(int n, int k) {
        if (n == 0) return 0;
        if (n == 1) return k;
        int sameCount = k, diffCount = k * (k-1);
        for (int i = 2; i < n; ++i) {
            int temp = diffCount;
            diffCount = (sameCount + diffCount) * (k-1);
            sameCount = temp;
        }
        return sameCount + diffCount;
    }
}
