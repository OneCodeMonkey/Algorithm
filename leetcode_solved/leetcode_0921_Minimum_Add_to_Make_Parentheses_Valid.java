// AC: Runtime: 3 ms, faster than 7.46% of Java online submissions for Minimum Add to Make Parentheses Valid.
// Memory Usage: 38.9 MB, less than 6.69% of Java online submissions for Minimum Add to Make Parentheses Valid.
// Using stack
// T:O(len(s)), S:O(len(s))
// 
class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> record = new Stack<>();
        for (char c : s.toCharArray()) {
            if (record.empty() || c == '(' || record.peek() == ')') {
                record.add(c);
            } else {
                record.pop();
            }
        }
        
        return record.size();
    }
}