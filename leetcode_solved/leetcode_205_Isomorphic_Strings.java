// AC: Runtime: 4 ms, faster than 87.42% of Java online submissions for Isomorphic Strings.
// Memory Usage: 39 MB, less than 52.96% of Java online submissions for Isomorphic Strings.
// since s contains ASCII char, we use a int[128] to restore the corresponding char s[i], t[i] relative position
// and check, if not equal, return false
// T:O(n), S:O(1)
// 
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.equals(t)) {
            return true;
        }
        int size = s.length();
        int[] sRecord = new int[128], tRecord = new int[128];
        for (int i = 0; i < size; i++) {
            if (sRecord[s.charAt(i)] != tRecord[t.charAt(i)]) {
                return false;
            }
            sRecord[s.charAt(i)] = i + 1;
            tRecord[t.charAt(i)] = i + 1;
        }

        return true;
    }
}