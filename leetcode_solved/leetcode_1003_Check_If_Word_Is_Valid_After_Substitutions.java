// AC: Runtime: 10 ms, faster than 53.04% of Java online submissions for Check If Word Is Valid After Substitutions.
// Memory Usage: 39.6 MB, less than 48.91% of Java online submissions for Check If Word Is Valid After Substitutions.
// stack
// T:O(n), S:O(n)
// 
class Solution {
    public boolean isValid(String s) {
        Stack<Character> record = new Stack();
        for (char c: s.toCharArray()) {
            if (c == 'c') {
                if (!record.empty() && record.peek() == 'b') {
                    record.pop();
                    if (!record.empty() && record.peek() == 'a') {
                        record.pop();
                    } else {
                        record.push('b');
                        record.push('c');
                    }
                } else {
                    record.push('c');
                }
            } else {
                record.push(c);
            }
        }

        return  record.empty();
    }
}