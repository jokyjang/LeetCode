import java.util.PriorityQueue;

// TODO
public class Solution833 {
    class Triplet {
        int index;
        String source;
        String target;
        Triplet(int index, String source, String target) {
            this.index = index;
            this.source = source;
            this.target = target;
        }
    }
    public String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
        PriorityQueue<Triplet> queue = new PriorityQueue<>((a, b) -> Integer.compare(a.index, b.index));
        for (int i = 0; i < indexes.length; ++i) {
            if (S.substring(indexes[i], indexes[i] + sources[i].length()).equals(sources[i])) {
                queue.add(new Triplet(indexes[i], sources[i], targets[i]));
            }
        }
        if (queue.isEmpty()) {
            return S;
        }

        int left = 0;
        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            Triplet t = queue.poll();
            sb.append(S.substring(left, t.index));
            sb.append(t.target);
            left = t.index + t.source.length();
        }
        sb.append(S.substring(left));
        return sb.toString();
    }
}
