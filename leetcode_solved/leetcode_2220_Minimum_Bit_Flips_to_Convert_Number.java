// AC: Runtime: 1 ms, faster than 66.67% of Java online submissions for Minimum Bit Flips to Convert Number.
// Memory Usage: 41.1 MB, less than 33.33% of Java online submissions for Minimum Bit Flips to Convert Number.
// .
// T:O(log(max(m, n))), S:O(1)
// 
class Solution {
    public int minBitFlips(int start, int goal) {
        int ret = 0;
        while (start > 0 || goal > 0) {
            if (start > 0) {
                if (goal == 0 && start % 2 == 1) {
                    ret++;
                } else {
                    if (start % 2 != goal % 2) {
                        ret++;
                    }
                    goal /= 2;
                }
                start /= 2;
            } else {
                if (goal % 2 == 1) {
                    ret++;
                }
                goal /= 2;
            }
        }

        return ret;
    }
}
