// AC: Runtime: 1 ms, faster than 100.00% of Java online submissions for Count Triplets That Can Form Two Arrays of Equal XOR.
// Memory Usage: 36.6 MB, less than 70.64% of Java online submissions for Count Triplets That Can Form Two Arrays of Equal XOR.
// thought: notice i < j <= k, so triple can be two elements. just find subarray which xor sum is zero, then plus array.length - 1.
// T:O(n^2), S:O(1)
//
class Solution {
    public int countTriplets(int[] arr) {
        int size = arr.length, ret = 0;
        if (size >= 2) {
            for (int i = 1; i < size; i++) {
                int xorSum = arr[i];
                for (int j = i - 1; j >= 0; j--) {
                    xorSum ^= arr[j];
                    if (xorSum == 0) {
                        ret += i - j;
                    }
                }
            }
        }

        return ret;
    }
}