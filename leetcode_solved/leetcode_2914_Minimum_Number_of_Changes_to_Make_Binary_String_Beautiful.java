// AC: Runtime Details 3ms Beats 99.61%of users with Java
// Memory Details 43.63MB Beats 53.94%of users with Java
// Greedy.
// T:O(n), S:O(1)
// 
class Solution {
    public int minChanges(String s) {
        int len = s.length(), ret = 0;
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(2 * i) != s.charAt(2 * i + 1)) {
                ret++;
            }
        }

        return ret;
    }
}
