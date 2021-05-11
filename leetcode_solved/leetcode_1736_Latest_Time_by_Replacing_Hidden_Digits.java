// AC:
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Latest Time by Replacing Hidden Digits.
// Memory Usage: 37.2 MB, less than 69.02% of Java online submissions for Latest Time by Replacing Hidden Digits.
// 注意踩坑
// T:O(1), S:O(1)
class Solution {
    public String maximumTime(String time) {
        StringBuilder ret = new StringBuilder();
        if (time.charAt(0) == '?') {
            if (time.charAt(1) == '?' || time.charAt(1) < '4') {
                ret.append('2');
            } else {
                ret.append('1');
            }
        } else {
            ret.append(time.charAt(0));
        }
        if (time.charAt(1) == '?') {
            if (ret.charAt(0) == '2') {
                ret.append('3');
            } else {
                ret.append('9');
            }
        } else {
            ret.append(time.charAt(1));
        }
        ret.append(':');
        if (time.charAt(3) == '?') {
            ret.append('5');
        } else {
            ret.append(time.charAt(3));
        }
        if (time.charAt(4) == '?') {
            ret.append('9');
        } else {
            ret.append(time.charAt(4));
        }
        return ret.toString();
    }
}