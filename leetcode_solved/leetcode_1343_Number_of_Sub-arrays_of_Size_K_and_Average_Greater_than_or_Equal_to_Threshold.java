// AC: Runtime: 1 ms, faster than 100.00% of Java online submissions for Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold.
// Memory Usage: 47.5 MB, less than 71.17% of Java online submissions for Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold.
// judge sum of the continous k numbers of arr.
// T:O(n), S:O(1)
// 
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int tempSum = 0, size = arr.length, ret = 0;
        for (int i = 0; i < k; i++) {
            tempSum += arr[i];
        }

        if (tempSum >= threshold * k) {
            ret++;
        }

        for (int i = k; i < size; i++) {
            tempSum += arr[i] - arr[i - k];
            if (tempSum >= threshold * k) {
                ret++;
            }
        }

        return ret;
    }
}