// Runtime 20 ms Beats 100.00% of users with Java
// Memory 45.73 MB Beats 66.67% of users with Java
// .
// T:O(n), S:O(n)
// 
class Solution {
    public String compressedString(String word) {
        char prevChar = ' ';
        int len = word.length(), prevCharCount = 0;
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < len; i++) {
            char c = word.charAt(i);
            if (prevChar == ' ') {
                prevChar = c;
                prevCharCount = 1;
                if (i == len - 1) {
                    ret.append(prevCharCount);
                    ret.append(prevChar);
                }
                continue;
            }
            if (c != prevChar) {
                ret.append(prevCharCount);
                ret.append(prevChar);
                prevChar = c;
                prevCharCount = 1;
            } else {
                if (prevCharCount < 9) {
                    prevCharCount++;
                } else {
                    ret.append(prevCharCount);
                    ret.append(prevChar);
                    prevCharCount = 1;
                }
            }
            if (i == len - 1 && prevCharCount > 0) {
                ret.append(prevCharCount);
                ret.append(prevChar);
            }
        }

        return ret.toString();
    }
}
