// Runtime 1 ms Beats 100.00% 
// Memory 43.94 MB Beats ? %
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int countValidPrefixes(String s) {
        int countZero = 0, countOne = 0, ret = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                countZero++;
            } else {
                countOne++;
            }
            if (countZero > ((i + 2) / 2) || countOne > ((i + 2) / 2)) {
                continue;
            }
            ret++;
        }

        return ret;
    }
}
