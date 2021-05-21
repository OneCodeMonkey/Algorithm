// AC:Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Gap.
// Memory Usage: 35.7 MB, less than 61.93% of Java online submissions for Binary Gap.
// 略。
// T:O(n), S:O(1)
// 
class Solution {
    public int binaryGap(int n) {
        int ret = 0, tempGapLen = -1;
        while (n > 0) {
            int bit = n % 2;
            if (tempGapLen == -1) {
                if (bit == 1) {
                    tempGapLen = 1;
                }
            } else {
                if (bit == 0) {
                    tempGapLen++;
                } else {
                    if (tempGapLen > ret) {
                        ret = tempGapLen;
                    }
                    tempGapLen = 1;
                }
            }
            n = n >> 1;
        }
        return ret;
    }
}