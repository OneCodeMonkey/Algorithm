// Runtime 317 ms Beats 100.00% 
// Memory 48.12 MB Beats 100.00%
// Stack.
// T:O(n), S:O(n)
//
class Solution {
    public String resultingString(String s) {
        Stack<Character> record = new Stack<>();
        for (char c : s.toCharArray()) {
            if (record.empty()) {
                record.add(c);
            } else {
                char top = record.peek();
                int diff = Math.abs((top - 'a') - (c - 'a'));
                if (diff == 1 || diff == 25) {
                    record.pop();
                } else {
                    record.add(c);
                }
            }
        }
        StringBuilder ret = new StringBuilder();
        while (!record.empty()) {
            ret.append(record.pop());
        }

        return ret.reverse().toString();
    }
}
