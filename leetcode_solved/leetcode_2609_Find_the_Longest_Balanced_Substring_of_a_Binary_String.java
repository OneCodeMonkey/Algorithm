// AC: Runtime 2 ms Beats 100% 
// Memory 42.3 MB Beats 100%
// Using two variables record 0's and 1's.
// T:O(n), S:O(1)
// 
class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int countZero = 0, countOne = 0, ret = 0;
        char prev = ' ';
        for (char c : s.toCharArray()) {
            if (prev == '1' && c == '0') {
                ret = Math.max(ret, Math.min(countZero, countOne));
                countZero = 0;
                countOne = 0;
            } else if (prev == '0' && c == '1') {
                countOne = 0;
            }
            if (c == '0') {
                countZero++;
            } else {
                countOne++;
            }
            prev = c;
        }
        if (prev == '1') {
            ret = Math.max(ret, Math.min(countZero, countOne));
        }

        return ret * 2;
    }
}
