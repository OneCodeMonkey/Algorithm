// Runtime 1 ms Beats 100.00%
// Memory 42.83 MB Beats 100.00%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int len = colors.length, ret = 0;
        for (int i = 0; i < len; i++) {
            int left = i == 0 ? colors[len - 1] : colors[i - 1], right = i == len - 1 ? colors[0] : colors[i + 1];
            if (colors[i] != left && colors[i] != right) {
                ret++;
            }
        }

        return ret;
    }
}
