import java.util.Arrays;

// TODO add tests
public class Solution937 {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (a, b) -> {
            int i1 = a.indexOf(" ") + 1;
            int i2 = b.indexOf(" ") + 1;
            if (!Character.isDigit(a.charAt(i1)) && !Character.isDigit(b.charAt(i2))) {
                int result = a.substring(i1).compareTo(b.substring(i2));
                return result != 0 ? result : a.substring(0, i1-1).compareTo(b.substring(0, i2-1));
            } else if (Character.isDigit(a.charAt(i1)) && !Character.isDigit(b.charAt(i2))) {
                return 1;
            } else if (!Character.isDigit(a.charAt(i1)) && Character.isDigit(b.charAt(i2))) {
                return -1;
            } else {
                return 0;
            }
        });
        return logs;
    }
}
