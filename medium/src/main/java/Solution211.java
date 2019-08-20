import java.util.LinkedList;
import java.util.Queue;

public class Solution211 {
    class WordDictionary {
        class TrieNode {
            boolean end;
            TrieNode[] children = new TrieNode[26];
            TrieNode(boolean end) {
                this.end = end;
            }
        }

        private TrieNode root;

        /** Initialize your data structure here. */
        public WordDictionary() {
            root = new TrieNode(false);
        }

        /** Adds a word into the data structure. */
        public void addWord(String word) {
            TrieNode current = root;
            for (int i = 0; i < word.length(); ++i) {
                char letter = word.charAt(i);
                if (current.children[letter-'a'] == null) {
                    current.children[letter-'a'] = new TrieNode(i == word.length()-1);
                }
                current = current.children[letter-'a'];
            }
        }

        /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
        public boolean search(String word) {
            Queue<TrieNode> queue = new LinkedList<>();
            queue.add(root);
            int i = 0;
            while (i != word.length() && !queue.isEmpty()) {
                char letter = word.charAt(i);
                int size = queue.size();
                while (size > 0) {
                    TrieNode node = queue.poll();
                    if (letter != '.' && node.children[letter-'a']!= null) {
                        queue.add(node.children[letter-'a']);
                    } else if (letter == '.') {
                        for (TrieNode child : node.children) {
                            if (child != null) {
                                queue.add(child);
                            }
                        }
                    }
                    --size;
                }
                ++i;
            }
            if (i != word.length() || queue.isEmpty()) {
                return false;
            }
            while (!queue.isEmpty()) {
                TrieNode node = queue.poll();
                if (node.end) {
                    return true;
                }
            }
            return false;
        }
    }
}
