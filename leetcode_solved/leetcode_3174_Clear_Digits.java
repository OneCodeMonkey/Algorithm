// Runtime 2 ms Beats 100.00% of users with Java
// Memory 42.66 MB Beats 100.00% of users with Java
// Using stack
// T:O(n), S:O(n)
// 
class Solution {
    public String clearDigits(String s) {
        Stack<Character> record = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') {
                if (!record.isEmpty()) {
                    record.pop();
                }
            } else {
                record.push(c);
            }
        }
        StringBuilder ret = new StringBuilder();
        while (!record.isEmpty()) {
            ret.append(record.pop());
        }

        return ret.reverse().toString();
    }
}
