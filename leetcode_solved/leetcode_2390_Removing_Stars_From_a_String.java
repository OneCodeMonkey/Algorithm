// AC: Runtime: 203 ms, faster than 51.24% of Java online submissions for Removing Stars From a String.
// Memory Usage: 70.5 MB, less than 43.75% of Java online submissions for Removing Stars From a String.
// Using stack.
// T:O(n), S:O(n)
// 
class Solution {
    public String removeStars(String s) {
        StringBuilder ret = new StringBuilder();
        Stack<Integer> record = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '*') {
                record.add(1);
            } else {
                if (!record.empty()) {
                    record.pop();
                } else {
                    ret.append(c);
                }
            }
        }

        return ret.reverse().toString();
    }
}
