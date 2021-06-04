// AC: Runtime: 8 ms, faster than 81.94% of Java online submissions for License Key Formatting.
// Memory Usage: 39.2 MB, less than 55.53% of Java online submissions for License Key Formatting.
// 略.
// T:O(n), S:O(n)
// 
class Solution {
    public String licenseKeyFormatting(String s, int k) {
        int count = 0;
        StringBuilder sNonDash = new StringBuilder();
        for (char c: s.toCharArray()) {
            if (c != '-') {
                count++;
                sNonDash.append(c);
            }
        }
        int firstGroup = count % k, pos = firstGroup;
        StringBuilder ret = new StringBuilder();

        if (firstGroup != 0) {
            ret.append(sNonDash.subSequence(0, firstGroup).toString().toUpperCase());
        }
        if (firstGroup == count) {
            return ret.toString();
        } else {
            if (firstGroup != 0) {
                ret.append('-');
            }
            while (pos < count) {
                ret.append(sNonDash.subSequence(pos, pos + k).toString().toUpperCase());
                ret.append('-');
                pos += k;
            }
            return ret.substring(0, ret.length() - 1);
        }
    }
}
