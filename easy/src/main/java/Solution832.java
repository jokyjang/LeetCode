// TODO
public class Solution832 {
    public int[][] flipAndInvertImage(int[][] A) {
        int m = A.length, n = A[0].length;
        for (int i = 0; i < m; ++i) {
            for (int l = 0, r = n-1; l <= r; ++l, --r) {
                if (l == r) {
                    A[i][l] ^= 1;
                    continue;
                }
                A[i][l] ^= 1;
                A[i][r] ^= 1;
                int temp = A[i][l];
                A[i][l] = A[i][r];
                A[i][r] = temp;
            }
        }
        return A;
    }
}
