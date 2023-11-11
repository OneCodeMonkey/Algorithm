// AC: Runtime Details 11ms Beats 41.20%of users with Java
// Memory Details 44.05MB Beats 66.80%of users with Java
// Combination.
// T:O(n), S:O(1)
// 
class Solution {
    public int countHomogenous(String s) {
        long ret = 0;
        int count = 0;
        char prev = ' ';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (prev == ' ') {
                count++;
            } else {
                if (prev == c) {
                    count++;
                } else {
                    ret += (long) count * (count + 1) / 2;
                    ret %= 1e9 + 7;
                    count = 1;
                }
            }
            if (i == s.length() - 1) {
                ret += (long) count * (count + 1) / 2;
                ret %= 1e9 + 7;
            }
            prev = c;
        }

        return (int) ret;
    }
}
