// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Decode String.
// Memory Usage: 37.1 MB, less than 58.79% of Java online submissions for Decode String.
// Using two stacks to record the K and current string, and iterator to build expression.
// T:O(SUM(Ki * len(substring_i))), S:O(SUM(Ki * len(substring_i)))
// 
class Solution {
    public String decodeString(String s) {
        int size = s.length(), curK = 0;
        StringBuilder curString = new StringBuilder();
        Stack<Integer> repeat = new Stack<>();
        Stack<String> prev = new Stack<>();
        for (int i = 0; i < size; i++) {
            char c = s.charAt(i);
            if (c == '[') {
                repeat.add(curK);
                prev.add(curString.toString());
                curString = new StringBuilder();
                curK = 0;
            } else if (c == ']') {
                int repeatTime = repeat.pop();
                StringBuilder prevString = new StringBuilder(prev.pop());
                for (int j = 0; j < repeatTime; j++) {
                    prevString.append(curString);
                }
                curString = prevString;
            } else if (c >= '0' && c <= '9') {
                curK = curK * 10 + Integer.parseInt(String.valueOf(c));
            } else {
                curString.append(c);
            }
        }

        return curString.toString();
    }
}