// AC: Runtime 3 ms Beats 100% 
// Memory 42.8 MB Beats 100%
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int alternatingSubarray(int[] nums) {
        int len = nums.length, curLen = 0, prev = -1, ret = -1;
        for (int num : nums) {
            if (curLen >= 2) {
                if (curLen % 2 == 0) {
                    if (num - prev == -1) {
                        curLen++;
                        ret = Math.max(ret, curLen);
                    } else if (num - prev == 1) {
                        curLen = 2;
                    } else {
                        curLen = 0;
                    }
                } else {
                    if (num - prev == 1) {
                        curLen++;
                        ret = Math.max(ret, curLen);
                    } else {
                        curLen = 0;
                    }
                }
            } else if (num - prev == 1) {
                curLen = 2;
                ret = Math.max(ret, curLen);
            }
            prev = num;
        }

        return ret;
    }
}
