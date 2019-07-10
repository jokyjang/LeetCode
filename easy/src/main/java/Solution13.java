import java.util.HashMap;
import java.util.Map;

public class Solution13 {
    public int romanToInt(String s) {
        Map<Character, Integer> singleSymbols = new HashMap<>();
        singleSymbols.put('I', 1);
        singleSymbols.put('V', 5);
        singleSymbols.put('X', 10);
        singleSymbols.put('L', 50);
        singleSymbols.put('C', 100);
        singleSymbols.put('D', 500);
        singleSymbols.put('M', 1000);

        int value = 0;
        for (int i = 0; i < s.length() - 1; ++i) {
            int firstValue = singleSymbols.get(s.charAt(i));
            int nextValue = singleSymbols.get(s.charAt(i + 1));
            if (firstValue < nextValue) {
                value -= firstValue;
            } else {
                value += firstValue;
            }
        }
        return value + singleSymbols.get(s.charAt(s.length() - 1));
    }
}
