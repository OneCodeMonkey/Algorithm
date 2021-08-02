// AC: Runtime: 2 ms, faster than 99.68% of Java online submissions for Maximum XOR for Each Query.
// Memory Usage: 55.2 MB, less than 53.06% of Java online submissions for Maximum XOR for Each Query.
// for every query, answer is (2^maxBit - 1) ^ XOR, because we can always find a k to make XOR sum maximum.
// T:O(n), S:O(1)
// 
class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int size = nums.length, XOR = 0;
        for (int i: nums) {
            XOR ^= i;
        }

        int[] ret = new int[size];
        for (int i = 0; i < size; i++) {
            int answer = XOR ^ ((1 << maximumBit) - 1);
            ret[i] = answer;
            XOR ^= nums[size - 1 - i];
        }

        return ret;
    }
}