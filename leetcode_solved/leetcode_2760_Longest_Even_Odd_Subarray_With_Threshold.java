// AC: Runtime 16 ms Beats 33.33%
// Memory 43.9 MB Beats 33.33%
// Brute-force.
// T:O(n ^ 2), S:O(1)
// 
class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int len = nums.length, ret = 0, curLen = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] <= threshold) {
                if (nums[i] % 2 == 0) {
                    int curSign = 1;
                    curLen = 1;
                    for (int j = i + 1; j < len; j++) {
                        if (nums[j] > threshold) {
                            break;
                        }
                        curSign = curSign == 1 ? -1 : 1;
                        if (curSign == 1 && nums[j] % 2 == 0) {
                            curLen++;
                        } else if (curSign == -1 && nums[j] % 2 == 1) {
                            curLen++;
                        } else {
                            break;
                        }
                    }
                    ret = Math.max(ret, curLen);
                }
            } else {
                ret = Math.max(ret, curLen);
            }
        }

        return ret;
    }
}
