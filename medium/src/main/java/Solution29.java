import java.util.ArrayList;
import java.util.List;

public class Solution29 {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        long newDividend = Math.abs((long)dividend);
        long newDivisor = Math.abs((long)divisor);
        int sign = 1;
        if ((newDividend == dividend) != (newDivisor == divisor)) {
            sign = -1;
        }

        List<Long> values = new ArrayList<>();
        long accumulate = newDivisor;
        while (accumulate <= newDividend) {
            values.add(accumulate);
            accumulate += accumulate;
        }

        if (values.size() == 0) {
            return 0;
        }
        int quotient = 1 << (values.size() - 1);

        accumulate = values.get(values.size() - 1);
        for (int i = values.size() - 2; i >= 0; --i) {
            if ((values.get(i) + accumulate) > newDividend) {
                continue;
            }
            quotient += 1 << i;
            accumulate += values.get(i);
        }

        return quotient * sign;
    }
}
