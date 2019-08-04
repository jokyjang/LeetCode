import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public interface Solution131 {

    List<List<String>> partition(String s);

    default boolean isPalindrome(String s, int low, int high) {
        while (low < high && s.charAt(low) == s.charAt(high)) {
            low++;
            high--;
        }
        return low >= high;
    }

    class DP implements Solution131 {
        @Override
        public List<List<String>> partition(String s) {
            List<List<String>>[] result = new ArrayList[s.length()];
            for (int i = 0; i < s.length(); ++i) {
                result[i] = new ArrayList<>();
                for (int j = i; j >= 0; --j) {
                    if (!isPalindrome(s, j, i)) continue;
                    if (j == 0) {
                        result[i].add(Collections.singletonList(s.substring(j, i + 1)));
                    } else {
                        for (List<String> list : result[j-1]) {
                            List<String> newList = new ArrayList<>(list);
                            newList.add(s.substring(j, i + 1));
                            result[i].add(newList);
                        }
                    }
                }
            }
            return result[s.length()-1];
        }
    }

    class Recursion implements Solution131 {
        @Override
        public List<List<String>> partition(String s) {
            List<List<String>> result = new LinkedList<>();
            for (int i = 0; i < s.length(); ++i) {
                if (!isPalindrome(s, 0, i)) continue;
                if (i == s.length() - 1) {
                    result.add(Collections.singletonList(s));
                    continue;
                }
                for (List<String> list : partition(s.substring(i+1))) {
                    List<String> newSet = new ArrayList<>();
                    newSet.add(s.substring(0, i+1));
                    newSet.addAll(list);
                    result.add(newSet);
                }
            }
            return result;
        }
    }
}