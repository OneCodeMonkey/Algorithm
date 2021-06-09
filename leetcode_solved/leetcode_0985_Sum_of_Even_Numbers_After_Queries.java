// AC: Runtime: 5 ms, faster than 21.97% of Java online submissions for Sum of Even Numbers After Queries.
// Memory Usage: 47.5 MB, less than 29.76% of Java online submissions for Sum of Even Numbers After Queries.
// .
// T:O(max(nums.length, queries.length)), S:O(1)
//
class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int tempSum = 0, size = queries.length, pos = 0;
        int[] ret = new int[size];
        if (size == 0) {
            return ret;
        }
        for (int i: nums) {
            if (i % 2 == 0) {
                tempSum += i;
            }
        }
        for (int[] item: queries) {
            int val = item[0], index = item[1];
            if (Math.abs(nums[index]) % 2 == 0) {
                if (Math.abs(val) % 2 == 0) {
                    tempSum += val;
                } else {
                    tempSum -= nums[index];
                }
            } else {
                if (Math.abs(val) % 2 == 1) {
                    tempSum += nums[index] + val;
                }
            }
            ret[pos++] = tempSum;
            nums[index] += val;
        }

        return ret;
    }
}