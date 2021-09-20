// AC: Runtime: 28 ms, faster than 99.62% of Java online submissions for Implement Trie (Prefix Tree).
// Memory Usage: 48.3 MB, less than 77.69% of Java online submissions for Implement Trie (Prefix Tree).
// understand the definition of trie tree. using a isWord boolean and children[26] to record its existence of a word prefix, 
// and to enrich feature, we can add wordCount to record the number words.
// T: insert: O(n), search: O(n), startsWith: O(n), S:O(m * n),  n is the length of string, m is the number of strings.
//  
class TrieNode {
    boolean isWord;
    TrieNode[] children;

    public TrieNode() {
        isWord = false;
        children = new TrieNode[26];
    }
}

class Trie {
    private TrieNode root;

    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode parent = root;
        for (int i = 0; i < word.length(); i++) {
            int charI = word.charAt(i) - 'a';
            if (parent.children[charI] == null) {
                parent.children[charI] = new TrieNode();
            }
            parent = parent.children[charI];
        }
        parent.isWord = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode target = find(word);
        return target != null && target.isWord;
    }

    public TrieNode find(String word) {
        TrieNode parent = root;
        for (int i = 0; i < word.length(); i++) {
            int charI = word.charAt(i) - 'a';
            if (parent.children[charI] == null) {
                return null;
            }
            parent = parent.children[charI];
        }

        return parent;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode parent = root;
        for (int i = 0; i < prefix.length(); i++) {
            int charI = prefix.charAt(i) - 'a';
            if (parent.children[charI] == null) {
                return false;
            }
            parent = parent.children[charI];
        }

        return true;
    }
}