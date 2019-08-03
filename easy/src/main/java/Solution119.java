import java.util.ArrayList;
import java.util.List;

public class Solution119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>(rowIndex+1);
        for (int i = 0; i <= rowIndex; ++i) {
            getRow(result, i);
        }
        return result;
    }

    private void getRow(List<Integer> result, int row) {
        int temp = 1;
        for (int i = 1; i < row; ++i) {
            int nextValue = result.get(i);
            result.set(i, temp + nextValue);
            temp = nextValue;
        }
        result.add(row, 1);
    }
}
