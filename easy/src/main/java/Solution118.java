import java.util.ArrayList;
import java.util.List;

public class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; ++i) {
            List<Integer> rowNums = new ArrayList<>();
            rowNums.add(1);
            for (int j = 0; j < i - 1; ++j) {
                List<Integer> lastRow = result.get(i-1);
                rowNums.add(lastRow.get(j) + lastRow.get(j+1));
            }
            if (i != 0) {
                rowNums.add(1);
            }
            result.add(rowNums);
        }
        return result;
    }
}
