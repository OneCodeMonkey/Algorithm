// AC: Runtime 0 ms Beats 100% 
// Memory 39.9 MB Beats 100%
// find the subarray that pairs with 1 and -1, count the max length.
// T:O(n), S:O(1)
// 
class Solution {
    public int captureForts(int[] forts) {
        int previousNonZero = -2, previousNonZeroIndex = -1, ret = 0;
        for (int i = 0; i < forts.length; i++) {
            if (forts[i] != 0) {
                if (previousNonZero == -2) {
                    previousNonZero = forts[i];
                    previousNonZeroIndex = i;
                } else {
                    if ((forts[i] == 1 && previousNonZero == -1) || (forts[i] == -1 && previousNonZero == 1)) {
                        ret = Math.max(ret, i - previousNonZeroIndex - 1);
                    }
                    previousNonZero = forts[i];
                    previousNonZeroIndex = i;
                }
            }
        }

        return ret;
    }
}
