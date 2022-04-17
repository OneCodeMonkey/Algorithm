// AC: Runtime: 2 ms, faster than 83.79% of Java online submissions for Reverse Substrings Between Each Pair of Parentheses.
// Memory Usage: 40.5 MB, less than 92.14% of Java online submissions for Reverse Substrings Between Each Pair of Parentheses.
// stack
// T:O(n), S:O(n)
// 
class Solution {
    public String reverseParentheses(String s) {
        Stack<String> st = new Stack<>();
        StringBuilder cur = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                st.push(cur.toString());
                cur = new StringBuilder();
            } else if (c == ')') {
                cur.reverse();
                cur = new StringBuilder(st.pop() + cur);
            } else {
                cur.append(c);
            }
        }

        return cur.toString();
    }
}