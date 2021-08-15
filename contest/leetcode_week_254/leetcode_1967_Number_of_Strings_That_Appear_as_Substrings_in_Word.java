// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of Strings That Appear as Substrings in Word.
// Memory Usage: 39.1 MB, less than 75.00% of Java online submissions for Number of Strings That Appear as Substrings in Word.
// .
// T:O(n), S:O(1)
//
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int ret = 0;
        for (String str: patterns) {
            if (word.contains(str)) {
                ret++;
            }
        }

        return ret;
    }
}