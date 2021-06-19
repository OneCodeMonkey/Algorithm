


// 法一：O(n)
// AC: Runtime: 0 ms, faster than 100.00% of Java online submissions for Kth Missing Positive Number.
// Memory Usage: 38.2 MB, less than 97.07% of Java online submissions for Kth Missing Positive Number.
// .
// T:O(n), S:O(1)
// 
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int ret = 1, size = arr.length;
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                if (arr[0] - 1 >= k) {
                    return k;
                } else {
                    k -= arr[0] - 1;
                }
            } else if (i == size - 1) {
                if (arr[i] - arr[i - 1] > k) {
                    return arr[i - 1] + k;
                } else {
                    return k + arr[i - 1] + 1;
                }
            } else {
                if (arr[i] - arr[i - 1] > 1) {
                    if (arr[i] - arr[i - 1] > k) {
                        return arr[i - 1] + k;
                    } else {
                        k -= arr[i] - arr[i - 1] - 1;
                    }
                }
            }
        }

        return arr[size - 1] + k;
    }
}