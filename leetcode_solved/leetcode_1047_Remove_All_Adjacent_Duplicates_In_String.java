// AC: Runtime: 13 ms, faster than 62.48% of Java online submissions for Remove All Adjacent Duplicates In String.
// Memory Usage: 39.7 MB, less than 37.68% of Java online submissions for Remove All Adjacent Duplicates In String.
// using stack.
// T:O(n), S:O(n)
// 
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> record = new Stack<>();
        for (char c : s.toCharArray()) {
            if (record.empty() || !record.peek().equals(c)) {
                record.push(c);
            } else {
                record.pop();
            }
        }
        StringBuilder ret = new StringBuilder();
        for (char c: record) {
            ret.append(c);
        }

        return ret.toString();
    }
}