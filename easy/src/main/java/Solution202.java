import java.util.HashSet;
import java.util.Set;

// TODO
public class Solution202 {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        set.add(n);
        int next = next(n);
        while (!set.contains(next)) {
            set.add(next);
            next = next(next);
        }
        return next == 1;
    }

    private int next(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n%10) * (n%10);
            n /= 10;
        }
        return sum;
    }
}
