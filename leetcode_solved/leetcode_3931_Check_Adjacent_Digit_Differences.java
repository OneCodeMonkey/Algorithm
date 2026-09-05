// Runtime 3 ms Beats -% 
// Memory 45.66 MB Beats -%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            int c1 = Integer.parseInt(String.valueOf(s.charAt(i))), c2 = Integer.parseInt(String.valueOf(s.charAt(i + 1)));
            if (Math.abs(c1 - c2) > 2) {
                return false;
            }
        }

        return true;
    }
}
