// TODO
public class Solution1085 {
    public int sumOfDigits(int[] A) {
        int min = minValue(A);
        int sum = sumOfDigits(min);
        return (sum+1) % 2;
    }

    private int minValue(int[] A) {
        int min = A[0];
        for (int i = 1; i < A.length; ++i) {
            min = Math.min(min, A[i]);
        }
        return min;
    }

    private int sumOfDigits(int value) {
        int sum = 0;
        while (value != 0) {
            sum += value % 10;
            value /= 10;
        }
        return sum;
    }
}
