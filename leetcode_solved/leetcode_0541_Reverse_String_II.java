// AC: Runtime: 1 ms, faster than 77.67% of Java online submissions for Reverse String II.
// Memory Usage: 38.6 MB, less than 97.21% of Java online submissions for Reverse String II.
// string builder
// T:O(n), S:O(n)
// 
class Solution {
    public String reverseStr(String s, int k) {
        int size = s.length();
        StringBuilder ret = new StringBuilder();
        int pos = 0;
        while (pos < size) {
            if (pos + 2 * k < size) {
                StringBuilder temp = new StringBuilder(s.substring(pos, pos + k));
                ret.append(temp.reverse());
                ret.append(s.substring(pos + k, pos + 2 * k));
                pos += 2 * k;
            } else if (pos + 2 * k >= size && pos + k < size) {
                StringBuilder temp = new StringBuilder(s.substring(pos, pos + k));
                ret.append(temp.reverse());
                ret.append(s.substring(pos + k, size));
                pos = size - 1;
                break;
            } else {
                StringBuilder temp = new StringBuilder(s.substring(pos, size));
                ret.append(temp.reverse());
                pos = size - 1;
                break;
            }
        }

        return ret.toString();
    }
}