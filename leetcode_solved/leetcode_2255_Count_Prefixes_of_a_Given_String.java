// AC: Runtime: 1 ms, faster than 100.00% of Java online submissions for Count Prefixes of a Given String.
// Memory Usage: 43.7 MB, less than 33.33% of Java online submissions for Count Prefixes of a Given String.
// .
// T:O(sum(min(s.length(), words[i].length))), S:O(1)
// 
class Solution {
    public int countPrefixes(String[] words, String s) {
        int ret = 0;
        for (String word : words) {
            if (s.startsWith(word)) {
                ret++;
            }
        }

        return ret;
    }
}