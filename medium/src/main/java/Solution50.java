public class Solution50 {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double result = myPow(x, n/2);
        result = result * result;
        if (n % 2 == 1) {
            result = result * x;
        } else if (n % 2 == -1) {
            result = result / x;
        }
        return result;
    }
}
