// AC: Runtime: 57 ms, faster than 20.00% of Java online submissions for Adding Spaces to a String.
// Memory Usage: 88.3 MB, less than 20.00% of Java online submissions for Adding Spaces to a String.
// .
// T:O(m), S:O(m + n), m = s.length(), n = spaces.length
// 
class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder ret = new StringBuilder();
        int pos = 0;
        for (int i = 0; i < s.length(); i++) {
            if (pos < spaces.length && i == spaces[pos]) {
                ret.append(" ");
                pos++;
            }
            ret.append(s.charAt(i));
        }

        return ret.toString();
    }
}