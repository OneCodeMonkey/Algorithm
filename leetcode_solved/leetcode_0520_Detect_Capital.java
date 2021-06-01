// AC: Runtime: 1 ms, faster than 99.62% of Java online submissions for Detect Capital.
// Memory Usage: 37.3 MB, less than 52.67% of Java online submissions for Detect Capital.
// 分类讨论
// T:o(n), S:O(1)
// 
class Solution {
    public boolean detectCapitalUse(String word) {
        int len = word.length();
        if (len == 1) {
            return true;
        }
        char firstLetter = word.charAt(0);
        if (firstLetter >= 'A' && firstLetter <= 'Z') {
            char secondLetter = word.charAt(1);
            if (len == 2) {
                return true;
            }
            if (secondLetter >= 'A' && secondLetter <= 'Z') {
                for (int i = 2; i < len; i++) {
                    if (!(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')) {
                        return false;
                    }
                }
            } else {
                for (int i = 2; i < len; i++) {
                    if (!(word.charAt(i) >= 'a' && word.charAt(i) <= 'z')) {
                        return false;
                    }
                }
            }
        } else {
            for (int i = 1; i < len; i++) {
                if (!(word.charAt(i) >= 'a' && word.charAt(i) <= 'z')) {
                    return false;
                }
            }
        }

        return true;
    }
}