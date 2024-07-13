// Runtime 2 ms Beats 100.00%
// Memory 46.32 MB Beats 100.00%
// Backtracking.
// T:O(2 ^ n), S:O(2 ^ n)
// 
class Solution {
    public List<String> validStrings(int n) {
        List<String> ret = new LinkedList<>();
        StringBuilder curStr = new StringBuilder();
        backtracking(ret, curStr, n, 1);

        return ret;
    }

    private void backtracking(List<String> ret, StringBuilder sb, int n, int prev) {
        if (sb.length() == n) {
            ret.add(sb.toString());
            return;
        }
        sb.append("1");
        backtracking(ret, sb, n, 1);
        sb.deleteCharAt(sb.length() - 1);
        if (prev == 1) {
            sb.append("0");
            backtracking(ret, sb, n, 0);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
