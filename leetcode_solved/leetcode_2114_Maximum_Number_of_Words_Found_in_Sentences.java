// AC: Runtime: 2 ms, faster than 100.00% of Java online submissions for Maximum Number of Words Found in Sentences.
// Memory Usage: 38.3 MB, less than 100.00% of Java online submissions for Maximum Number of Words Found in Sentences.
// .
// T:O(sum(len)), S:O(max(len))
// 
class Solution {
    public int mostWordsFound(String[] sentences) {
        int ret = 0;
        for (String sentence: sentences) {
            ret = Math.max(ret, sentence.split(" ").length);
        }

        return ret;
    }
}