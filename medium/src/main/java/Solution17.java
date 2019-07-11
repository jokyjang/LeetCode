import java.util.LinkedList;
import java.util.List;

public class Solution17 {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> combinations = new LinkedList<>();
        String[] letters = new String[]{" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if (digits.isEmpty()) {
            return combinations;
        }
        combinations.addLast("");
        for (int i = 0; i < digits.length(); ++i) {
            int number = digits.charAt(i) - '0';
            String letter = letters[number];
            int size = combinations.size();
            for (int j = 0; j < size; ++j) {
                String prefix = combinations.removeFirst();
                for (int k = 0; k < letter.length(); ++k) {
                    combinations.addLast(prefix + letter.charAt(k));
                }
            }
        }
        return combinations;
    }
}
