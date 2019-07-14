import java.util.ArrayList;
import java.util.List;

public class Solution93 {
    public List<String> restoreIpAddresses(String s) {
        List<String> set = new ArrayList<>();
        searchForIp(set, "", 0, s, 0);
        return set;
    }

    private void searchForIp(List<String> set, String prefix, int parts, String s, int index) {
        if (parts == 4 && index == s.length()) {
            set.add(prefix);
        } else if (parts != 4 && (parts >= 4 || index < s.length())) {
            for (int i = index; i < index + 3 && i < s.length(); ++i) {
                String p = s.substring(index, i + 1);
                if (p.charAt(0) == '0' && p.length() == 1 || p.charAt(0) != '0' && Integer.parseInt(p) < 256) {
                    searchForIp(set, prefix + p + (parts == 3 ? "" : "."), parts + 1, s, i + 1);
                }
            }
        }
    }
}
