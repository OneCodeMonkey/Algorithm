// AC: Runtime: 173 ms, faster than 14.57% of Java online submissions for Replace Words.
// Memory Usage: 43.5 MB, less than 93.48% of Java online submissions for Replace Words.
// using hashset or trie tree
// T:O(m + n), S:O(n), m = sum(dictionary[i].length), n = sentence.length
//
class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        HashSet<String> dictionarySet = new HashSet<>(dictionary);
        String[] words = sentence.split(" ");
        StringBuilder ret = new StringBuilder();
        for (String word : words) {
            String wordRoot = word;
            for (int i = 0; i < word.length(); i++) {
                String subStr = word.substring(0, i + 1);
                if (dictionarySet.contains(subStr)) {
                    wordRoot = subStr;
                    break;
                }
            }
            ret.append(wordRoot);
            ret.append(" ");
        }

        return ret.toString().trim();
    }
}