// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Rotate String.
// Memory Usage: 36.7 MB, less than 84.01% of Java online submissions for Rotate String.
// check the s + s contains goal or not
// T:O(n), S:O(1)
//
class Solution {
    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }
}