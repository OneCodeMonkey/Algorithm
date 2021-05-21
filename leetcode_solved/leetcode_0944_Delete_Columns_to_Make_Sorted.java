// AC: Runtime: 6 ms, faster than 91.74% of Java online submissions for Delete Columns to Make Sorted.
// Memory Usage: 38.8 MB, less than 79.60% of Java online submissions for Delete Columns to Make Sorted.
// 略.
// T:O(n * len(strs[i])), S:O(1)
// 
class Solution {
    public int minDeletionSize(String[] strs) {
        int row = strs.length, col = strs[0].length(), ret = 0;
        if (row <= 1) {
            return 0;
        }
        for (int i = 0; i < col; i++) {
            boolean check = true;
            for (int j = 0; j < row - 1; j++) {
                if (strs[j].charAt(i) > strs[j + 1].charAt(i)) {
                    check = false;
                    break;
                }
            }
            if (!check) {
                ret++;
            }
        }
        return ret;
    }
}