// Runtime 1 ms Beats 100.00% of users with Java
// Memory 41.94 MB Beats 100.00% of users with Java
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int minimumChairs(String s) {
        int cur = 0, ret = 0;
        for (char c : s.toCharArray()) {
            if (c == 'E') {
                cur++;
                ret = Math.max(ret, cur);
            } else {
                cur--;
            }
        }

        return ret;
    }
}
