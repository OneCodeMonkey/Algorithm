// AC: Runtime: 4 ms, faster than 46.43% of Java online submissions for Maximum Sum of Two Non-Overlapping Subarrays.
// Memory Usage: 42.6 MB, less than 66.08% of Java online submissions for Maximum Sum of Two Non-Overlapping Subarrays.
// DP
// T:O(n), S:O(n)
// 
class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        int len = nums.length, ret = 0, tempSumLen1 = 0, tempMaxSumLen1 = 0, tempSumLen2 = 0, tempMaxSumLen2 = 0;
        int[] leftMaxLen1 = new int[len], leftMaxLen2 = new int[len], rightMaxLen1 = new int[len],
                rightMaxLen2 = new int[len];
        for (int i = 0; i < len; i++) {
            if (i < firstLen - 1) {
                tempSumLen1 += nums[i];
            } else {
                tempSumLen1 += nums[i];
                if (i >= firstLen) {
                    tempSumLen1 -= nums[i - firstLen];
                }
                tempMaxSumLen1 = Math.max(tempMaxSumLen1, tempSumLen1);
                leftMaxLen1[i] = tempMaxSumLen1;
            }

            if (i < secondLen - 1) {
                tempSumLen2 += nums[i];
            } else {
                tempSumLen2 += nums[i];
                if (i >= secondLen) {
                    tempSumLen2 -= nums[i - secondLen];
                }
                tempMaxSumLen2 = Math.max(tempMaxSumLen2, tempSumLen2);
                leftMaxLen2[i] = tempMaxSumLen2;
            }
        }
        tempSumLen1 = 0;
        tempMaxSumLen1 = 0;
        tempSumLen2 = 0;
        tempMaxSumLen2 = 0;
        for (int i = len - 1; i >= 0; i--) {
            if (i > len - firstLen) {
                tempSumLen1 += nums[i];
            } else {
                tempSumLen1 += nums[i];
                if (i <= len - firstLen - 1) {
                    tempSumLen1 -= nums[i + firstLen];
                }
                tempMaxSumLen1 = Math.max(tempMaxSumLen1, tempSumLen1);
                rightMaxLen1[i] = tempMaxSumLen1;
            }

            if (i > len - secondLen) {
                tempSumLen2 += nums[i];
            } else {
                tempSumLen2 += nums[i];
                if (i <= len - secondLen - 1) {
                    tempSumLen2 -= nums[i + secondLen];
                }
                tempMaxSumLen2 = Math.max(tempMaxSumLen2, tempSumLen2);
                rightMaxLen2[i] = tempMaxSumLen2;
            }
        }

        for (int i = Math.min(firstLen, secondLen) - 1; i < len - Math.min(firstLen, secondLen); i++) {
            int tempMax = Math.max(leftMaxLen1[i] + rightMaxLen2[i + 1], leftMaxLen2[i] + rightMaxLen1[i + 1]);

            ret = Math.max(ret, tempMax);
        }

        return ret;
    }
}