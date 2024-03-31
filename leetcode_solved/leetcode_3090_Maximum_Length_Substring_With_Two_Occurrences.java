// Runtime 4 ms Beats 33.33% of users with Java
// Memory 42.10 MB Beats 66.67% of users with Java
// Sliding-window.
// T:O(n), S:O(1)
// 
class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> record = new HashMap<>();
        int len = s.length(), left = 0, right = 0, ret = 0;
        while (left <= right && right < len) {
            char c = s.charAt(right);
            record.merge(c, 1, Integer::sum);
            if (record.get(c) > 2) {
                while (left < len && s.charAt(left) != c) {
                    record.merge(s.charAt(left), -1, Integer::sum);
                    left++;
                }
                if (left < len && s.charAt(left) == c) {
                    record.merge(c, -1, Integer::sum);
                    left++;
                }
            }
            ret = Math.max(ret, right - left + 1);
            right++;
        }

        return ret;
    }
}
