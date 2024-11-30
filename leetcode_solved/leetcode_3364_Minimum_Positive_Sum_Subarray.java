// Runtime 2 ms Beats 100.00%
// Memory 44.67 MB Beats 100.00%
// .
// T:O((n-l) * (r-l)), S:O(1)
// 
class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int len = nums.size();
        long ret = -1;
        long sumLengthL = 0;
        for (int i = 0; i < l; i++) {
            sumLengthL += nums.get(i);
        }
        if (sumLengthL == 1) {
            return 1;
        } else if (sumLengthL > 0) {
            ret = sumLengthL;
        }
        for (int i = 0; i < len - l; i++) {
            long sum2 = sumLengthL;
            for (int j = i + l; j < i + r && j < len; j++) {
                sum2 += nums.get(j);
                if (sum2 == 1) {
                    return 1;
                } else if (sum2 > 0) {
                    if (ret < 0) {
                        ret = sum2;
                    } else {
                        ret = Math.min(ret, sum2);
                    }
                }
            }
            if (i + l < len) {
                sumLengthL -= nums.get(i) - nums.get(i + l);
            }
            if (sumLengthL == 1) {
                return 1;
            } else if (sumLengthL > 0) {
                if (ret < 0) {
                    ret = sumLengthL;
                } else {
                    ret = Math.min(ret, sumLengthL);
                }
            }
        }

        return (int) ret;
    }
}
