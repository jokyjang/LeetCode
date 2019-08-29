// TODO
public class Solution413 {
    class Pair {
        int sum;
        int suffix;
        Pair(int sum, int suffix) {
            this.sum = sum;
            this.suffix = suffix;
        }
    }

    public int numberOfArithmeticSlices(int[] A) {
        if (A.length < 3) return 0;
        Pair pair = numberOfArithmeticSlices(A, 0, A.length);
        return pair.sum;
    }

    // l is the left boundary, inclusive
    // r is right boundary, exclusive
    private Pair numberOfArithmeticSlices(int[] A, int l, int r) {
        boolean isArithmetic = A[r-1] - A[r-2] == A[r-2] - A[r-3];
        if (r - l == 3) {
            int number = isArithmetic ? 1 : 0;
            return new Pair(number, number);
        }
        Pair oldPair = numberOfArithmeticSlices(A, l, r-1);
        int newSuffix = isArithmetic ? oldPair.suffix+1 : 0;
        return new Pair(oldPair.sum + newSuffix, newSuffix);
    }
}
