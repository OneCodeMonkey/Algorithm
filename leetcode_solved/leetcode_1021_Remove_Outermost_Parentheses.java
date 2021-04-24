// Runtime: 15 ms, faster than 9.62% of Java online submissions for Remove Outermost Parentheses.
// Memory Usage: 41.6 MB, less than 5.03% of Java online submissions for Remove Outermost Parentheses.
//
class Solution {
    public String removeOuterParentheses(String S) {
        HashSet<Integer> toRemove = new HashSet<>();
        Stack<Integer> record = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                if (record.empty()) {
                    toRemove.add(i);
                }
                record.add(1);
            } else {
                record.pop();
                if (record.empty()) {
                    toRemove.add(i);
                }
            }
        }
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (!toRemove.contains(i)) {
                ret = ret.append(S.charAt(i));
            }
        }

        return ret.toString();
    }
}