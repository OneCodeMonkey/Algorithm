// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Counting Words With a Given Prefix.
// Memory Usage: 42 MB, less than 100.00% of Java online submissions for Counting Words With a Given Prefix.
// .
// T:O(words.length * len(pref)), S:O(1)
// 
class Solution {
    public int prefixCount(String[] words, String pref) {
        int ret = 0;
        for (String word:words) {
            if (word.startsWith(pref)) {
                ret++;
            }
        }

        return ret;
    }
}