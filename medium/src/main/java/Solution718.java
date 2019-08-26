// TODO
public class Solution718 {
    public int findLength(int[] A, int[] B) {
        if (A.length > B.length) {
            int[] temp = B;
            B = A;
            A = temp;
        }
        if (A.length == 0) {
            return 0;
        }
        int[] maxLength = new int[A.length];
        int max = 0;
        for (int i = 0; i < maxLength.length; ++i) {
            if (A[i] == B[0]) {
                maxLength[i]++;
                max = Math.max(max, maxLength[i]);
            }
        }
        for (int i = 1; i < B.length; ++i) {
            for (int j = A.length-1; j >= 0; --j) {
                maxLength[j] = A[j] == B[i] ? 1 + (j == 0 ? 0 : maxLength[j-1]) : 0;
                max = Math.max(max, maxLength[j]);
            }
        }
        return max;
    }
}
