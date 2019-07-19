import java.util.List;

public class Solution120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.isEmpty()) {
            return 0;
        }

        int[] sum = new int[triangle.size()];
        sum[0] = triangle.get(0).get(0);
        for (int i = 1; i < triangle.size(); ++i) {
            List<Integer> list = triangle.get(i);
            sum[i] = sum[i - 1] + list.get(i);
            for (int j = i - 1; j > 0; --j) {
                sum[j] = Math.min(sum[j-1] + list.get(j), sum[j] + list.get(j));
            }
            sum[0] = sum[0] + list.get(0);
        }

        int min = sum[0];
        for (int i = 1; i < sum.length; ++i) {
            if (min > sum[i]) {
                min = sum[i];
            }
        }
        return min;
    }
}
