public class Solution243 {
    // TODO
    public int shortestDistance(String[] words, String word1, String word2) {
        int lastWord1 = -1, lastWord2 = -1, min = Integer.MAX_VALUE;
        for (int i = 0; i < words.length; ++i) {
            if (words[i].equals(word1)) {
                lastWord1 = i;
                if (lastWord2 != -1) {
                    min = Math.min(min, lastWord1 - lastWord2);
                }
            } else if (words[i].equals(word2)) {
                lastWord2 = i;
                if (lastWord1 != -1) {
                    min = Math.min(min, lastWord2 - lastWord1);
                }
            }
        }
        return min;
    }
}
