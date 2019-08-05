import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution187 {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> count = new HashSet<>();
        Set<String> result = new HashSet<>();
        for (int i = 0; i <= s.length() - 10; ++i) {
            String key = s.substring(i, i + 10);
            if (!count.contains(key)) {
                count.add(key);
            } else {
                result.add(key);
            }
        }
        return new ArrayList<String>(result);
    }
}
