// AC:
// Runtime: 6 ms, faster than 48.29% of Java online submissions for Reverse Words in a String III.
// Memory Usage: 39.5 MB, less than 55.61% of Java online submissions for Reverse Words in a String III.
// 略。
// T:O(n * len(avg(s))), S:O(n * len(avg(s)))
//
class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder ret = new StringBuilder();
        for (String word: words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                ret.append(word.charAt(i));
            }
            ret.append(" ");
        }
        return ret.toString().trim();
    }
}