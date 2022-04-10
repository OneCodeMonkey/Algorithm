// AC: Runtime: 1 ms, faster than 67.78% of Java online submissions for Score of Parentheses.
// Memory Usage: 41.7 MB, less than 66.53% of Java online submissions for Score of Parentheses.
// .
// T:O(n), S:O(n)
// 
class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> record = new Stack<>();
        int score = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                record.push(score);
                score = 0;
            } else {
                score = record.pop() + (score == 0 ? 1 : 2 * score);
            }
        }

        return score;
    }
}
