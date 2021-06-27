// AC: Runtime: 2 ms, faster than 89.23% of Java online submissions for Make The String Great.
// Memory Usage: 39.1 MB, less than 40.71% of Java online submissions for Make The String Great.
// using stack
// T:O(n), S:O(n)
// 
class Solution {
    public String makeGood(String s) {
        Stack<Character> record = new Stack<>();
        for (char c: s.toCharArray()) {
            if (record.empty()) {
                record.add(c);
            } else {
                int c1ToInt = c;
                int c2ToInt = record.peek();
                if (Math.abs(c1ToInt - c2ToInt) == 32) {
                    record.pop();
                } else {
                    record.add(c);
                }
            }
        }
        StringBuilder ret = new StringBuilder();
        for (char c: record) {
            ret.append(c);
        }
        
        return ret.toString();
    }
}