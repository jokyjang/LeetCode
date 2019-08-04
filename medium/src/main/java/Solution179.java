import java.util.Arrays;

public class Solution179 {
    public String largestNumber(int[] nums) {
        String[] newNums = Arrays.stream(nums).mapToObj(String::valueOf).toArray(String[]::new);
        Arrays.sort(newNums, (a, b) -> (b+a).compareTo(a+b));

        StringBuilder sb = new StringBuilder();
        for (String num : newNums) {
            sb.append(num);
        }
        String result = sb.toString();
        return result.startsWith("0") ? "0" : result;
    }
}
