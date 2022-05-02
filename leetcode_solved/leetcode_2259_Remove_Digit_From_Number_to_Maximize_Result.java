// AC: Runtime: 1 ms, faster than 100.00% of Java online submissions for Remove Digit From Number to Maximize Result.
// Memory Usage: 42 MB, less than 100.00% of Java online submissions for Remove Digit From Number to Maximize Result.
// Thought: to get largest result, one way is to choose the first index with value digit and meets the requirement of s[i + 1] > s[i], 
// if not exist such index, choose the smallest index with value digit and s[i + 1] < s[i], or the index is on s.length() - 1 is also smaller index.
// if both kinds of index not exist, just choose any index with value digit are same.
// T:O(n), S:O(1)
// 
class Solution {
    public String removeDigit(String number, char digit) {
        int firstLargerIndex = -1, lastSmallerIndex = -1, sameIndex = -1, len = number.length();
        for (int i = 0; i < len; i++) {
            if (number.charAt(i) == digit) {
                if (sameIndex == -1) {
                    sameIndex = i;
                }
                if (i + 1 < len) {
                    if (number.charAt(i + 1) > number.charAt(i)) {
                        firstLargerIndex = i;
                        break;
                    }
                    if (number.charAt(i + 1) < number.charAt(i)) {
                        lastSmallerIndex = i;
                    }
                } else {
                    lastSmallerIndex = i;
                }
            }
        }
        int removeIndex = firstLargerIndex != -1 ? firstLargerIndex : (lastSmallerIndex != -1 ? lastSmallerIndex : sameIndex);
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (i != removeIndex) {
                ret.append(number.charAt(i));
            }
        }

        return ret.toString();
    }
}