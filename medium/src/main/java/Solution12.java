import java.util.HashMap;
import java.util.Map;

public class Solution12 {
    public String intToRoman(int num) {
        Map<Integer, String> roman = new HashMap<>();
        roman.put(1, "I");
        roman.put(4, "IV");
        roman.put(5, "V");
        roman.put(9, "IX");
        roman.put(10, "X");
        roman.put(40, "XL");
        roman.put(50, "L");
        roman.put(90, "XC");
        roman.put(100, "C");
        roman.put(400, "CD");
        roman.put(500, "D");
        roman.put(900, "CM");
        roman.put(1000, "M");

        StringBuilder result = new StringBuilder();
        int highDigit = 1;

        while (num != 0) {
            int digit = num % 10;
            if (roman.containsKey(digit * highDigit)) {
                String value = roman.get(digit*highDigit);
                result.insert(0, value);
            } else {
                StringBuilder split = new StringBuilder();
                if (digit > 5) {
                    split = new StringBuilder(roman.get(5 * highDigit));
                    digit -= 5;
                }
                for (int i = 0; i < digit; ++i) {
                    split.append(roman.get(highDigit));
                }
                result.insert(0, split.toString());
            }
            num = num / 10;
            highDigit = highDigit * 10;
        }
        return result.toString();
    }
}
