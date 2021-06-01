// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Only Letters.
// Memory Usage: 36.7 MB, less than 96.71% of Java online submissions for Reverse Only Letters.
// str builder
// T:O(n), S:O(n)
// 
class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder letters = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if ((temp >= 'A' && temp <= 'Z') || (temp >= 'a' && temp <= 'z')) {
                letters.append(temp);
            }
        }
        letters = letters.reverse();
        StringBuilder ret = new StringBuilder();
        int pos = 0;
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (!(temp >= 'A' && temp <= 'Z') && !(temp >= 'a' && temp <= 'z')) {
                ret.append(temp);
            } else {
                ret.append(letters.charAt(pos++));
            }
        }

        return ret.toString();
    }
}