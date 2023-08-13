// AC: Runtime 3 ms Beats 100%
// Memory 43.9 MB Beats 50%
// .
// T:O(n), S:O(n)
// 
class Solution {
    public String finalString(String s) {
        StringBuilder ret = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == 'i') {
                ret.reverse();
            } else {
                ret.append(c);
            }
        }

        return ret.toString();
    }
}
