// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Break a Palindrome.
// Memory Usage: 36.9 MB, less than 86.12% of Java online submissions for Break a Palindrome.
// see the annotation
// T:O(n), S:O(n)
// 
class Solution {
    public String breakPalindrome(String palindrome) {
        int len = palindrome.length();
        if (len <= 1) {
            return "";
        }
        StringBuilder ret = new StringBuilder();
        boolean changed = false;
        // we should only check the former half string, and if the len is odd, we should skip the middle char.
        for (int i = 0; i < len / 2; i++) {
            if (palindrome.charAt(i) > 'a') {
                changed = true;
                for (int j = 0; j < len; j++) {
                    if (j != i) {
                        ret.append(palindrome.charAt(j));
                    }
                    // smallest lexicographically
                    else {
                        ret.append('a');
                    }
                }
                break;
            }
        }
        // former half string are all 'a's, so just let tail char to be 'b'.
        if (!changed) {
            // 末尾加1
            return palindrome.substring(0, len - 1) + 'b';
        }

        return ret.toString();
    }
}