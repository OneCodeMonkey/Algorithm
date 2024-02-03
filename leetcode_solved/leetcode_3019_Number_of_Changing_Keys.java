// AC: Runtime 1 ms Beats 100.00% of users with Java
// Memory 42.13 MB Beats 100.00% of users with Java
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int countKeyChanges(String s) {
        int ret = 0;
        char prev = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (prev == cur || Math.abs(prev - cur) == ('a' - 'A')) {
                continue;
            }
            ret++;
            prev = cur;
        }

        return ret;
    }
}
