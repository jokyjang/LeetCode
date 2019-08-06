import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution642 {
    class AutocompleteSystem {
        class TrieNode {
            int times;
            final Map<Character, TrieNode> children;
            TrieNode() {
                this.children = new HashMap<>();
            }
        }

        class Pair {
            String word;
            int times;
            Pair(String word, int times) {
                this.word = word;
                this.times = times;
            }
        }

        private final TrieNode root;
        private StringBuilder currentSb;
        private TrieNode currentNode;

        public AutocompleteSystem(String[] sentences, int[] times) {
            root = new TrieNode();
            currentSb = new StringBuilder();
            currentNode = root;
            for (int i = 0; i < sentences.length; ++i) {
                insert(sentences[i], times[i]);
            }
        }

        public List<String> input(char c) {
            TrieNode node = null;
            if (!currentNode.children.containsKey(c)) {
                node = new TrieNode();
                currentNode.children.put(c, node);
            } else {
                node = currentNode.children.get(c);
            }

            node.times += 1;
            currentNode = node;
            currentSb.append(c);

            PriorityQueue<Pair> queue = new PriorityQueue<>((a, b) -> {
                int result = Integer.compare(a.times, b.times);
                return result != 0 ? result : b.word.compareTo(a.word);
            });
            availableWords(currentNode, currentSb.toString(), queue);

            if (c == '#') {
                currentNode = root;
                currentSb = new StringBuilder();
            }
            List<String> result = new LinkedList<>();
            while (!queue.isEmpty()) {
                result.add(0, queue.poll().word);
            }
            return result;
        }

        private void availableWords(TrieNode root, String prefix, PriorityQueue<Pair> result) {
            root.children.forEach((key, value) -> {
                if (key == '#') {
                    result.add(new Pair(prefix, value.times));
                    if (result.size() > 3) {
                        result.poll();
                    }
                } else {
                    availableWords(value, prefix+key, result);
                }
            });
        }

        private void insert(String word, int times) {
            char[] chars = word.toCharArray();
            TrieNode current = root;
            for (char c : chars) {
                TrieNode node = current.children.computeIfAbsent(c, key -> new TrieNode());
                node.times += times;
                current = node;
            }
            TrieNode node = current.children.computeIfAbsent('#', key -> new TrieNode());
            node.times += times;
        }
    }
}
