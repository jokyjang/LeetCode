import java.util.ArrayList;
import java.util.List;

public class Solution89 {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(0);
        for (int i = 1; i <= n; ++i) {
            int size = result.size();
            for (int j = size - 1; j >= 0; --j) {
                result.add(result.get(j) + (1 << (i-1)));
            }
        }
        return result;
    }
}
