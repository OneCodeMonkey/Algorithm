// AC: Runtime 10 ms Beats 66.67% 
// Memory 43.7 MB Beats 16.67%
// native replace method.
// T:O(n), S:O(1)
//
class Solution {
    public int minLength(String s) {
        while (s.contains("AB") || s.contains("CD")) {
            s = s.replace("AB", "");
            s = s.replace("CD", "");
        }

        return s.length();
    }
}
