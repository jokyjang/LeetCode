public class Solution38 {
    public String countAndSay(int n) {
        String seq = "1";
        for (int i = 1; i < n; ++i) {
            seq = next(seq);
        }
        return seq;
    }

    // Return the next count-and-say sequence of the given sequence
    private String next(String seq) {
        char lastFound = seq.charAt(0);
        int times = 1;
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < seq.length(); ++i) {
            if (seq.charAt(i) == lastFound) {
                ++times;
            } else {
                result.append(times).append(lastFound);
                lastFound = seq.charAt(i);
                times = 1;
            }
        }
        return result + String.valueOf(times) + lastFound;
    }
}
