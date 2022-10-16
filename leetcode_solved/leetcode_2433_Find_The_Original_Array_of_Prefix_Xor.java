// AC: Runtime 1 ms Beats 100% 
// Memory 54.7 MB Beats 100%
// bitwise manipulation
// T:O(n), S:O(n)
// 
class Solution {
    public int[] findArray(int[] pref) {
        int len = pref.length, pos = 0;
        int[] ret = new int[len];
        ret[pos++] = pref[0];
        for (int i = 1; i < len; i++) {
            ret[pos++] = pref[i] ^ pref[i - 1];
        }

        return ret;
    }
}
