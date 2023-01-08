// AC: Runtime 244 ms Beats 16.67% 
// Memory 59.8 MB Beats 66.67%
// Accumulate every bit sum of binary representation, and if one bit sum is odd, then add 2^(bit - 1) to answer.
// T:O(nlogn), S:O(logn)
// 
class Solution {
    public int xorBeauty(int[] nums) {
        HashMap<Integer, Integer> bitCount = new HashMap<>();
        int len = nums.length, exp = 1, maxExp = 0, ret = 0;
        for (int num : nums) {
            exp = 1;
            while (num > 0) {
                int digit = num % 2;
                maxExp = Math.max(maxExp, exp);
                bitCount.merge(exp, digit, Integer::sum);
                exp++;
                num /= 2;
            }
        }

        for (int j = 1; j <= maxExp; j++) {
            int digitSum = bitCount.getOrDefault(j, 0);
            if (digitSum % 2 == 1) {
                ret += (int) Math.pow(2, j - 1);
            }
        }

        return ret;
    }
}
