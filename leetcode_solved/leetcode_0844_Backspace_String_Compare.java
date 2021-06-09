// AC: Runtime: 1 ms, faster than 66.01% of Java online submissions for Backspace String Compare.
// Memory Usage: 37 MB, less than 76.26% of Java online submissions for Backspace String Compare.
// Using stack
// T:O(n), S:O(n)
//
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c != '#') {
                sStack.push(c);
            } else {
                if (!sStack.empty()) {
                    sStack.pop();
                }
            }
        }
        for (char c: t.toCharArray()) {
            if (c != '#') {
                tStack.push(c);
            } else {
                if (!tStack.empty()) {
                    tStack.pop();
                }
            }
        }
        if (sStack.size() != tStack.size()) {
            return false;
        }
        int size = sStack.size();
        for (int i = 0; i < size; i++) {
            if (!sStack.pop().equals(tStack.pop())) {
                return false;
            }
        }
        return true;
    }
}