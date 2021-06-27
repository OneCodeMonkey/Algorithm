// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Check If a Word Occurs As a Prefix of Any Word in a Sentence.
// Memory Usage: 37.1 MB, less than 29.65% of Java online submissions for Check If a Word Occurs As a Prefix of Any Word in a Sentence.
// .
// T:O(len(sentence)), S:O(len(sentence))
// 
class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] arr = sentence.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].startsWith(searchWord)) {
                return i + 1;
            }
        }
        
        return -1;
    }
}