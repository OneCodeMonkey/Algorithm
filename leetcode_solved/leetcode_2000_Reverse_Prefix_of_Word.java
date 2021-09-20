// AC: Runtime: 1 ms, faster than 100.00% of Java online submissions for Reverse Prefix of Word.
// Memory Usage: 38.5 MB, less than 66.67% of Java online submissions for Reverse Prefix of Word.
// .
// T:O(n), S:O(n)
// 
class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index != -1) {
            StringBuilder ret = new StringBuilder(word.substring(0, index + 1));
            ret.reverse();
            ret.append(word, index + 1, word.length());
            return ret.toString();
        }

        return word;
    }
}