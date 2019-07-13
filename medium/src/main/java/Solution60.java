import java.util.LinkedList;
import java.util.List;

public class Solution60 {
    public String getPermutation(int n, int k) {
        List<Integer> set = new LinkedList<>();
        for (int i = 1; i <= n; ++i) {
            set.add(i);
        }
        return getPermutation(set, k - 1);
    }

    private String getPermutation(List<Integer> set, int k) {
        if (k == 0 && set.size() == 1) {
            return String.valueOf(set.get(0));
        }
        int fac = factorial(set.size() - 1);
        int quotient = k / fac;
        int remainder = k % fac;
        String leading = String.valueOf(set.get(quotient));
        set.remove(quotient);
        return leading + getPermutation(set, remainder);
    }

    private int factorial(int n) {
        if (n == 1) {
            return n;
        }
        return n * factorial(n - 1);
    }
}
