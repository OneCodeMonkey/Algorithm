// brute-force solution
// Runtime: 2 ms, faster than 45.54% of Java online submissions for Sum of All Odd Length Subarrays.
// Memory Usage: 36.9 MB, less than 22.62% of Java online submissions for Sum of All Odd Length Subarrays.
// T:O(n^3), S:O(1)
// 
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int size = arr.length, ret = 0;
        for (int step = 1; step <= size; step += 2) {
            for (int i = 0; i + step - 1 < size; i++) {
                for (int j = i; j <= i + step - 1; j++) {
                    ret += arr[j];
                }
            }
        }

        return ret;
    }
}