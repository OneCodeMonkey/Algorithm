// AC:
// Runtime: 1 ms, faster than 10.88% of Java online submissions for Split a String in Balanced Strings.
// Memory Usage: 37.1 MB, less than 16.31% of Java online submissions for Split a String in Balanced Strings.
// 思路：用栈
// 复杂度：T:O(n), S:O(n)
//
class Solution {
    public int balancedStringSplit(String s) {
        Stack<String> record = new Stack<>();
        int ret = 0;
        record.add(String.valueOf(s.charAt(0)));
        for (int i = 1; i < s.length(); i++) {
            String temp = String.valueOf(s.charAt(i));
            if (record.empty()) {
                record.add(temp);
            } else {
                if (!temp.equals(record.peek())) {
                    record.pop();
                    if (record.empty()) {
                        ret++;
                    }
                } else {
                    record.add(temp);
                }
            }
        }
        return ret;
    }
}