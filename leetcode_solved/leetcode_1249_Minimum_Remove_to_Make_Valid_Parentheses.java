// AC: Runtime: 41 ms, faster than 38.11% of Java online submissions for Minimum Remove to Make Valid Parentheses.
// Memory Usage: 51.6 MB, less than 52.28% of Java online submissions for Minimum Remove to Make Valid Parentheses.
// stack.
// T:O(n), S:O(n)
// 
class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> record = new Stack<>();
        StringBuilder ret = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                record.add(1);
                ret.append(c);
            } else if (c == ')') {
                if (!record.empty()) {
                    record.pop();
                    ret.append(c);
                }
            } else {
                ret.append(c);
            }
        }

        if (record.size() > 0) {
            int count = 0;
            StringBuilder retCopy = new StringBuilder();
            // remove right-side (
            for (int i = ret.length() - 1; i >= 0; i--) {
                if (count < record.size() && ret.charAt(i) == '(') {
                    count++;
                } else {
                    retCopy.append(ret.charAt(i));
                }
            }

            return retCopy.reverse().toString();
        }

        return ret.toString();
    }
}