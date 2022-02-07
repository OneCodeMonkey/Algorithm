// AC: Runtime: 7 ms, faster than 10.82% of Java online submissions for Longest Subarray of 1's After Deleting One Element.
// Memory Usage: 58.2 MB, less than 5.41% of Java online submissions for Longest Subarray of 1's After Deleting One Element.
// compare any two consecutive 1's sequences and check whether their distance is only one 1.
// T:O(n), S:O(1)
// 
class Solution {
    public int longestSubarray(int[] nums) {
        int len = nums.length, prePos = -1, preLen = 0, curPos = -1, curLen = 0, ret = 0;
        boolean hasZero = false;
        for (int i = 0; i < len; i++) {
            if (curPos == -1) {
                if (nums[i] == 1) {
                    curPos = i;
                    curLen = 1;
                } else {
                    hasZero = true;
                }
            } else {
                if (nums[i] == 1) {
                    if (curPos == -2) {
                        curPos = i;
                    }
                    curLen++;
                    if (prePos != -1) {
                        if (curPos - prePos - preLen == 1) {
                            ret = Math.max(ret, preLen + curLen);
                        }
                    }
                } else {
                    if (prePos != -1) {
                        if (curPos - prePos - preLen == 1) {
                            ret = Math.max(ret, preLen + curLen);
                        }
                    }
                    prePos = curPos;
                    preLen = curLen;
                    curPos = -2;
                    curLen = 0;
                    hasZero = true;
                }
            }
            ret = Math.max(ret, curLen);
        }
        if (!hasZero) {
            ret -= 1;
        }
        return ret;
    }
}