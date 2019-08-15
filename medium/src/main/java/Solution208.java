public class Solution208 {
    class Trie {
        private TrieNode root;

        /** Initialize your data structure here. */
        public Trie() {
            root = new TrieNode(false);
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            TrieNode current = root;
            for (int i = 0; i < word.length(); ++i) {
                int index = word.charAt(i) - 'a';
                if (current.children[index] == null) {
                    current.children[index] = new TrieNode(false);
                }
                current = current.children[index];
                current.end |= (i == word.length() - 1);
            }
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            TrieNode current = root;
            for (int i = 0; i < word.length(); ++i) {
                int index = word.charAt(i) - 'a';
                if (current.children[index] == null) {
                    return false;
                }
                current = current.children[index];
                if (i == word.length() - 1 && current.end) {
                    return true;
                }
            }
            return false;
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            TrieNode current = root;
            for (int i = 0; i < prefix.length(); ++i) {
                int index = prefix.charAt(i) - 'a';
                if (current.children[index] == null) {
                    return false;
                }
                current = current.children[index];
            }
            return true;
        }

        class TrieNode {
            boolean end;
            TrieNode[] children;

            TrieNode(boolean end) {
                this.children = new TrieNode[26];
                this.end = end;
            }
        }
    }
}
