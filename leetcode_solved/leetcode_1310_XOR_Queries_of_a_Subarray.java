// AC: Runtime: 3 ms, faster than 46.81% of Java online submissions for XOR Queries of a Subarray.
// Memory Usage: 64.3 MB, less than 20.36% of Java online submissions for XOR Queries of a Subarray.
// xorSum[i, j] = xorSum[j] ^ xorSum[i - 1]. using an array to store xorSum[i] which is xor sum from 0 to i.
// T:O(n), S:O(n)
// 
class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int len = arr.length, lenQuery = queries.length, xorSum = 0;
        int[] record = new int[len + 1], ret = new int[lenQuery];
        record[0] = 0;
        for (int i = 0; i < len; i++) {
            xorSum ^= arr[i];
            record[i + 1] = xorSum;
        }

        for (int i = 0; i < lenQuery; i++) {
            int rangeXor = record[queries[i][0]] ^ record[queries[i][1] + 1];
            ret[i] = rangeXor;
        }

        return ret;
    }
}